package com.gogoing.workflow;

import org.activiti.spring.boot.SecurityAutoConfiguration;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication(exclude = SecurityAutoConfiguration.class)
public class WorkflowApplication {

    public static void main_(String[] args) {
        SpringApplication.run(WorkflowApplication.class, args);
    }
}
