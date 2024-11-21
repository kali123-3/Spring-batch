package com.infybuzz.listener;

import org.springframework.batch.core.JobExecution;
import org.springframework.batch.core.JobExecutionListener;

public class FirstJobListener implements JobExecutionListener {
    @Override
    public void beforeJob(JobExecution jobExecution) {
        System.out.println("Job parameters "+jobExecution.getJobParameters());
        System.out.println("job executon parameter "+jobExecution.getExecutionContext());
        jobExecution.getExecutionContext().put("first", "first");
    }

    @Override
    public void afterJob(JobExecution jobExecution) {
        System.out.println("Job parameters "+jobExecution.getJobParameters());
        System.out.println("job executon parameter "+jobExecution.getExecutionContext());
    }
}
