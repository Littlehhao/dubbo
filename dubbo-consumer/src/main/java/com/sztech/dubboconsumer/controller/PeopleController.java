package com.sztech.dubboconsumer.controller;

import com.alibaba.dubbo.config.annotation.Reference;
import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import com.sztech.dubbocommen.entity.People;
import com.sztech.dubbocommen.service.IPeopleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

/**
 * @program: dubbo
 * @description:
 * @author: jie fu
 * @create: 2019-05-29 17:55
 */
@RestController
public class PeopleController {


    @Reference
    private IPeopleService peopleService;


    @GetMapping("/people/{name}")
    public People getPeople(@PathVariable("name") String name){
        People people=new People();
        people.setName(name);
        System.out.println(JSON.toJSONString(people).toString());
        return peopleService.getPeople(people);
    }
}
