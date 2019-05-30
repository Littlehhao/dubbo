package com.sztech.dubbocommen.entity;

import lombok.Data;

import java.io.Serializable;

/**
 * @program: dubbo
 * @description: people Bean
 * @author: jie fu
 * @create: 2019-05-29 16:44
 */
@Data
public class People implements Serializable {

    private Integer id;

    private String name;

}
