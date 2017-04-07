package com.zj;

import com.zj.model.PropsConfig;
import com.zj.model.UserConfig;
import com.zj.model.YmlConfig;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.properties.EnableConfigurationProperties;


/**
 * Created by zhangjun on 17/4/6.
 */
@SpringBootApplication
@EnableConfigurationProperties({PropsConfig.class,
        YmlConfig.class, UserConfig.class})
public class ReadApplication {
    public static void main(final String[] args) {
        SpringApplication.run(ReadApplication.class, args);
    }
}
