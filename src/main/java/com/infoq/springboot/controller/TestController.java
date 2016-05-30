package com.infoq.springboot.controller;

import com.github.ltsopensource.core.domain.Job;
import com.github.ltsopensource.jobclient.JobClient;
import com.github.ltsopensource.jobclient.domain.Response;
import com.infoq.springboot.Constant.Constant;
import com.infoq.springboot.util.DateUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Date;

/**
 * Created by ys on 2016/5/9.
 *
 */
@RestController
@RequestMapping(value = "/api/test")
public class TestController {

    @Autowired
    private JobClient jobClient;

    @RequestMapping("/")
    public Response home() {
        Job job = new Job();
        String uid = "abcd";
        job.setTaskId("测试30分钟执行任务_" + uid);
        job.setParam("uid", uid);
        job.setParam("type", Constant.TEST_TASK);
        job.setTaskTrackerNodeGroup("test_task_track");
        job.setRepeatCount(10);
        job.setTriggerDate(DateUtils.getMinLater(new Date(), 30));
        Response response = jobClient.submitJob(job);
        return response;
    }
}
