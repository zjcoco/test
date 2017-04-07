package com.zj.service;

import com.zj.model.UserConfig;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

/**
 * Created by zhangjun on 17/4/6.
 */
@Service("yamlTestService")
public class YamlTestServiceImpl implements YamlTestService {

    @Resource
    private UserConfig userConfig;

    @Override
    public String showMessage() {
       return ("name: " + userConfig.getUsername() + " password: " + userConfig.getPassword());
    }
}
