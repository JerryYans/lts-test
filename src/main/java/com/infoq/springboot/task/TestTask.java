package com.infoq.springboot.task;

import com.github.ltsopensource.core.domain.Action;
import com.github.ltsopensource.core.domain.Job;
import com.github.ltsopensource.spring.tasktracker.JobRunnerItem;
import com.github.ltsopensource.spring.tasktracker.LTS;
import com.github.ltsopensource.tasktracker.Result;
import com.github.ltsopensource.tasktracker.logger.BizLogger;
import com.github.ltsopensource.tasktracker.runner.LtsLoggerFactory;
import com.infoq.springboot.Constant.Constant;

/**
 * Created by ys on 2016/5/9.
 *
 */
@LTS
public class TestTask {

    @JobRunnerItem(shardValue = Constant.TEST_TASK)
    public Result testTask(Job job) throws Throwable{
        try{
            Thread.sleep(1000L);
            //doctorService.doctorAccepted(job.getParam("orderId"));
            BizLogger bizLogger = LtsLoggerFactory.getBizLogger();
            bizLogger.info("医生接受提问如果30分钟内不回答问题则执行这个任务");
        }catch (Exception e){
            return new Result(Action.EXECUTE_LATER,e.getMessage());
        }
        return new Result(Action.EXECUTE_SUCCESS,"医生接受提问30分钟未回答 任务执行成功");
    }


}
