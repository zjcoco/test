package com.zj.model;

import lombok.Data;

/**
 * Created by zhangjun on 17/4/6.
 */
@Data
public class Person {
    private int age;
    private String name;
    private Person spouse;
    private Person[] children;
}
