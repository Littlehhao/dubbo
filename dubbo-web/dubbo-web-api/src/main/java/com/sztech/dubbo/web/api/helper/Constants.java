package com.sztech.dubbo.web.api.helper;

/**
 * Created by zhongjunkai on 17/11/27.
 */
public class Constants {

    /**
     * 数据库数据状态0：有效，1：已删除
     */
    public enum Status {
        ENABLE(0), DISABLE(1);

        Status(Integer code){
            this.code = code;
        }

        private Integer code;

        public Integer getCode() {
            return code;
        }
    }

    public enum ResultEnums{
        SUCCESS("1", "成功"), ERROR("0", "发生异常"),UNIFIEDAUTHFAILED("2", "统一登录认证异常"),
        SINGLEAUTHFAILED("3","单点登录认证异常"),AUTHCONFLICT("4", "认证冲突"),AUTHORFAILED("5","授权失败");

        private String code;

        private String msg;

        ResultEnums(String code, String msg){
            this.code = code;
            this.msg = msg;
        }

        public String getCode() {
            return code;
        }

        public String getMsg() {
            return msg;
        }
    }

}
