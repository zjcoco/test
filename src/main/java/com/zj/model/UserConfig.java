package com.zj.model;

import lombok.Data;
import org.springframework.boot.context.properties.ConfigurationProperties;

/**
 * Created by zhangjun on 17/4/6.
 */
@Data
@ConfigurationProperties(prefix = "server-junit")
public class UserConfig {
    private String username;
    private String password;
}
