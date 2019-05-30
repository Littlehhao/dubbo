package com.sztech.dubboprovider.service;

import com.alibaba.dubbo.config.annotation.Service;
import com.sztech.dubbocommen.entity.People;
import com.sztech.dubbocommen.service.IPeopleService;
import org.springframework.stereotype.Component;

import java.util.Random;

/**
 * @program: dubbo
 * @description: dubbo 服务注册
 * @author: jie fu
 * @create: 2019-05-29 16:56
 */
@Component
@Service
public class PeopleServiceImpl implements IPeopleService {


    @Override
    public People getPeople(People people) {
        people.setId(new Random().nextInt(100));
        return people;
    }
}
