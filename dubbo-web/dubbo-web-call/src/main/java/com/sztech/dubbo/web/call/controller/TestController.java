package com.sztech.dubbo.web.call.controller;

import com.sztech.dubbocommen.service.IPeopleService;
import jdk.nashorn.internal.ir.annotations.Reference;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @program: dubbo
 * @description: The Type TestController
 * @author: jie fu
 * @create: 2019-05-30 17:14
 */
@RestController
@RequestMapping("test")
@Validated
public class TestController {

    @Reference
    private IPeopleService peopleService;


}
