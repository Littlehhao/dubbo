package com.sztech.dubbo.web.dao.config;

import org.springframework.jdbc.datasource.lookup.AbstractRoutingDataSource;

/**
 * @program: dubbo
 * @description: The Type 动态数据源  实现 读写分离
 * @author: jie fu
 * @create: 2019-05-30 18:00
 */
public class DynamicDataSource extends AbstractRoutingDataSource {


    //读数据源
    private Object readDataSource;

    //写数据源
    private Object writeDataSource;

    @Override
    protected Object determineCurrentLookupKey() {
        return null;
    }
}
