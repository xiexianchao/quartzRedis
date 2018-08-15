package com.xiechao.job;

import org.quartz.JobExecutionContext;
import org.quartz.JobExecutionException;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.scheduling.quartz.QuartzJobBean;


public class ParamJob extends QuartzJobBean {

    private final static Logger logger = LoggerFactory.getLogger(ParamJob.class);

    private String name;

    public void setName(String name) {
        this.name = name;
    }

    @Override
    protected void executeInternal(JobExecutionContext jobExecutionContext) throws JobExecutionException {
        logger.info("####ParamJob execute");
        logger.info("####name:" + name);
    }
}
