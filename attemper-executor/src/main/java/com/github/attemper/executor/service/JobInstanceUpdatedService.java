package com.github.attemper.executor.service;

import com.github.attemper.common.param.dispatch.instance.JobInstanceGetParam;
import com.github.attemper.common.param.dispatch.instance.JobInstanceIdParam;
import com.github.attemper.common.property.StatusProperty;
import com.github.attemper.common.result.dispatch.instance.JobInstance;
import com.github.attemper.core.service.instance.JobInstanceService;
import org.camunda.bpm.engine.RuntimeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@Transactional
public class JobInstanceUpdatedService {

    @Autowired
    private RuntimeService runtimeService;

    @Autowired
    private JobInstanceService jobInstanceService;

    public Void terminate(JobInstanceIdParam param) {
        JobInstance jobInstance = getJobInstance(param);
        if (validateState(jobInstance)) {
            runtimeService.deleteProcessInstanceIfExists(
                    jobInstance.getProcInstId(),
                    StatusProperty.getValue(901),
                    true,
                    true,
                    false,
                    false);
        }
        return null;
    }

    private boolean validateState(JobInstance jobInstance) {
        return jobInstance.getProcInstId() != null;
    }

    private JobInstance getJobInstance(JobInstanceIdParam param) {
        return jobInstanceService.get(new JobInstanceGetParam().setId(param.getId()));
    }
}