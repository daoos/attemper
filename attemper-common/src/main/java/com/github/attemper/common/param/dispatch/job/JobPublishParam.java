package com.github.attemper.common.param.dispatch.job;

import com.github.attemper.common.param.CommonParam;
import com.github.attemper.common.param.CommonParam;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Builder
@Data
@NoArgsConstructor
@AllArgsConstructor
public class JobPublishParam implements CommonParam {

    protected List<String> jobNames;

    public String validate() {
        if(jobNames == null || jobNames.isEmpty()){
            return "6000";
        }
        return null;
    }

}