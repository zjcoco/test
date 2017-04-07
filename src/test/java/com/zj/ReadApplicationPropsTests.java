package com.zj;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.zj.model.PropsConfig;
import com.zj.model.YmlConfig;
import com.zj.service.YamlTestService;
import com.zj.service.YamlTestServiceImpl;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

/**
 * Created by zhangjun on 17/4/6.
 */
@RunWith(SpringJUnit4ClassRunner.class)
@SpringBootTest(classes=ReadApplication.class)
public class ReadApplicationPropsTests {

    @Autowired
    private PropsConfig propsConfig;

    @Autowired
    private YmlConfig ymlConfig;

    @Autowired
    private YamlTestService ymalTestService;

    @Test
    public void testDisplayUser(){
        String msg = ymalTestService.showMessage();
        System.out.println("====>>>111" + msg);
    }

    @Test
    public void testDisplayYmlValue() throws JsonProcessingException {
        System.out.println("simpleProp: " + ymlConfig.getSimpleProp());

        ObjectMapper objectMapper = new ObjectMapper();
        System.out.println("arrayProps: " + objectMapper.writeValueAsString(ymlConfig.getArrayProps()));
        System.out.println("listProp1: " + objectMapper.writeValueAsString(ymlConfig.getListProp1()));
        System.out.println("listProp2: " + objectMapper.writeValueAsString(ymlConfig.getListProp2()));
        System.out.println("mapProps: " + objectMapper.writeValueAsString(ymlConfig.getMapProps()));
    }

    @Test
    public void testDisplayPropsValue() {
        String driverClassName = propsConfig.getDriverClassName();
        String url = propsConfig.getUrl();
        String username = propsConfig.getUsername();
        String password = propsConfig.getPassword();

        String filters = propsConfig.getFilters();
        String maxActive = propsConfig.getMaxActive();
        String initialSize = propsConfig.getInitialSize();
        String maxWait = propsConfig.getMaxWait();

        System.out.println("driverClassName -> " + driverClassName);
        System.out.println("url -> " + url);
        System.out.println("username -> " + username);
        System.out.println("password -> " + password);

        System.out.println("initialSize -> " + initialSize);
        System.out.println("maxWait -> " + maxWait);

    }

}
