package com.kkk.domain.enums;


public enum ResponseCodeEnum {
    CODE_200(200, "请求成功"),
    CODE_404(404, "请求地址不存在"),
    CODE_600(600, "请求参数错误"),
    CODE_601(601, "用户名已经存在");

    private Integer code;

    private String msg;

    ResponseCodeEnum(Integer code, String msg) {
        this.code = code;
        this.msg = msg;
    }

    public Integer getCode() {
        return code;
    }

    public String getMsg() {
        return msg;
    }
}
