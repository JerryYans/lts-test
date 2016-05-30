package com.infoq.springboot.bean;

import com.github.ltsopensource.jobclient.JobClient;
import com.github.ltsopensource.spring.JobClientFactoryBean;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.util.Properties;

/**
 * Created by ys on 2016/5/9.
 *
 */
@Configuration
public class JobClientConfig {

    @Bean(name = "jobClient",initMethod = "start")
    public JobClient getJobClient() throws Exception{
        JobClientFactoryBean factoryBean = new JobClientFactoryBean();
        factoryBean.setClusterName("test_cluster");
        factoryBean.setRegistryAddress("zookeeper://10.1.24.90:2181");
        factoryBean.setNodeGroup("test_jobClient");
//        factoryBean.setMasterChangeListeners(new MasterChangeListener[]{
//                new MasterChangeListenerImpl()
//        });
        Properties configs = new Properties();
        configs.setProperty("job.fail.store", "leveldb");
        factoryBean.setConfigs(configs);
        factoryBean.afterPropertiesSet();
        JobClient jobClient = factoryBean.getObject();
        return jobClient;
    }

}
