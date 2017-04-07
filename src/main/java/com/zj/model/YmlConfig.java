package com.zj.model;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;
import org.springframework.boot.context.properties.ConfigurationProperties;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Created by zhangjun on 17/4/6.
 */
@Setter
@Getter
@ToString
@ConfigurationProperties(prefix = "myProps")
public class YmlConfig {
    private String simpleProp;
    private String[] arrayProps;
    private List<Map<String, String>> listProp1 = new ArrayList<>();
    private List<String> listProp2 = new ArrayList<>();
    private Map<String, String> mapProps = new HashMap<>();

}
