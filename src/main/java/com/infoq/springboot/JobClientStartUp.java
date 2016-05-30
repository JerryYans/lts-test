package com.infoq.springboot;

import com.infoq.springboot.bean.JobClientConfig;
import com.infoq.springboot.bean.TaskTrackerConfig;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.context.embedded.ConfigurableEmbeddedServletContainer;
import org.springframework.boot.context.embedded.EmbeddedServletContainerCustomizer;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.ImportResource;
import org.springframework.web.WebApplicationInitializer;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.context.ContextLoaderListener;
import org.springframework.web.context.support.AnnotationConfigWebApplicationContext;
import org.springframework.web.servlet.DispatcherServlet;

import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.ServletRegistration;

/**
 * Created by ys on 2016/5/9.
 *
 */
//@Configuration
@EnableAutoConfiguration
@ComponentScan(basePackages = "com.infoq.springboot.*")
@ImportResource({"lts-tasktracker-shard-annotaion.xml"})// SpringBootServletInitializer
public class JobClientStartUp implements WebApplicationInitializer,EmbeddedServletContainerCustomizer {


    public static void main(String[] args) {
        SpringApplication.run(JobClientStartUp.class, args);
    }

    @Override
    public void onStartup(ServletContext container) throws ServletException {

        AnnotationConfigWebApplicationContext rootContext =
                new AnnotationConfigWebApplicationContext();
        rootContext.register(JobClientConfig.class);
        rootContext.register(TaskTrackerConfig.class);

        container.addListener(new ContextLoaderListener(rootContext));

        AnnotationConfigWebApplicationContext dispatcherContext =
                new AnnotationConfigWebApplicationContext();
        ServletRegistration.Dynamic dispatcher =
                container.addServlet("dispatcher", new DispatcherServlet(dispatcherContext));
        dispatcher.setLoadOnStartup(1);
        dispatcher.addMapping("/");
    }

    @Override
    public void customize(ConfigurableEmbeddedServletContainer container) {
        container.setPort(3897);
    }
}
