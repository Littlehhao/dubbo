package com.sztech.dubbo.web.api.helper;


import lombok.Data;

/**
 * 统计返回结果封装类
 * Created by zhongjunkai on 17/11/27.
 */
@Data
public class Result<T> {

    //返回状态码,1成功、0异常、2认证异常、3认证冲突
    private String code;

    //提示信息
    private String msg;

    //结果数据
    private T data;

}
