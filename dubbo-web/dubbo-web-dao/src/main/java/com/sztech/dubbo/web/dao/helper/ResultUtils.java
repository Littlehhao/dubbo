package com.sztech.dubbo.web.dao.helper;


import com.sztech.dubbo.web.api.helper.Constants;
import com.sztech.dubbo.web.api.helper.Result;

/**
 * 返回结果工具类
 * Created by zhongjunkai on 17/11/27.
 */
public class ResultUtils {

    /**
     * 返回成功
     * @param code 错误码
     * @param msg 成功提示
     * @param object 结果集
     * @return
     */
    public static Result success(String code, String msg, Object object){
        Result result = new Result();
        result.setCode(code);
        result.setMsg(msg);
        result.setData(object);
        return result;
    }

    /**
     * 返回成功
     * @param code
     * @param msg
     * @return
     */
    public static Result success(String code, String msg){
        return success(code, msg, null);
    }

    /**
     * 返回成功，错误码和提示采用默认
     * @param object 结果集
     * @return
     */
    public static Result success(Object object){
        Result result = new Result();
        result.setCode(Constants.ResultEnums.SUCCESS.getCode());
        result.setMsg(Constants.ResultEnums.SUCCESS.getMsg());
        result.setData(object);
        return result;
    }

    /**
     * 返回成功
     * @return
     */
    public static Result success(){
        Result result = new Result();
        result.setCode(Constants.ResultEnums.SUCCESS.getCode());
        result.setMsg(Constants.ResultEnums.SUCCESS.getMsg());
        return result;
    }

    /**
     * 返回错误
     * @param code 错误码
     * @param msg 错误提示
     * @return
     */
    public static Result error(String code, String msg){
        Result result = new Result();
        result.setCode(code);
        result.setMsg(msg);
        return result;
    }
}
