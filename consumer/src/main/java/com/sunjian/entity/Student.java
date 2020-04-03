package com.sunjian.entity;

import lombok.AllArgsConstructor;
import lombok.Data;

/**
 * @author sunjian
 * @date 2020/4/3 8:49
 */
@Data
@AllArgsConstructor
public class Student {
    private Long id;
    private String name;
    private Integer age;
}
