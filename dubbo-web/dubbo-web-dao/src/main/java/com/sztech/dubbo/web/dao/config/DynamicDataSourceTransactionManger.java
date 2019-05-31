package com.sztech.dubbo.web.dao.config;

import org.springframework.jdbc.datasource.DataSourceTransactionManager;
import org.springframework.transaction.TransactionDefinition;

import javax.sql.DataSource;

/**
 * @program: dubbo
 * @description: The Type TransactionManger
 * @author: jie fu
 * @create: 2019-05-31 13:52
 */
public class DynamicDataSourceTransactionManger extends DataSourceTransactionManager {

    public DynamicDataSourceTransactionManger(DataSource dataSource) {
        super(dataSource);
    }

    @Override
    protected void doBegin(Object transaction, TransactionDefinition definition) {

        boolean readOnly=definition.isReadOnly();

        if(readOnly){
            DynamicDataSourceHolder.setContextHolder(DynamicDataSourceGlobal.READ);
        }else{
            DynamicDataSourceHolder.setContextHolder(DynamicDataSourceGlobal.WRITE);
        }
        super.doBegin(transaction, definition);
    }

    @Override
    protected void doCleanupAfterCompletion(Object transaction) {

        super.doCleanupAfterCompletion(transaction);
        //清除本地数据源配置
        DynamicDataSourceHolder.remove();
    }
}
