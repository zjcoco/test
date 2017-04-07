package com.zj.model;

import lombok.Data;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

/**
 * Created by zhangjun on 17/4/6.
 */
@Data
@ConfigurationProperties(prefix = "master.ds")
public class PropsConfig {
    private String driverClassName;
    private String url;
    private String username;
    private String password;
    private String filters;
    private String maxActive;
    private String initialSize;
    private String maxWait;
}
