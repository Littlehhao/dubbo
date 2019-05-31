package com.sztech.dubbo.web.dao.config;

/**
 * @program: dubbo
 * @description: The Type DynamicDataSource ThreadLocal
 * @author: jie fu
 * @create: 2019-05-31 11:21
 */
public final class DynamicDataSourceHolder {

    private static final ThreadLocal<DynamicDataSourceGlobal> contextHolder=new ThreadLocal<>();


    public DynamicDataSourceHolder() {
    }

    /**
     * 获取数据源
     * @return
     */
    public static DynamicDataSourceGlobal getContextHolder() {
        return contextHolder.get();
    }

    /**
     * 存放数据源
     * @param dataSourceGloba
     */
    public static void setContextHolder(DynamicDataSourceGlobal dataSourceGloba) {
        contextHolder.set(dataSourceGloba);
    }

    /**
     * 移除数据源
     */
    public static void remove(){
        contextHolder.remove();
    }
}
