package com.itpw.day12.generic.阿里大咖的优美泛型;

import java.util.List;

public class Response<T> {

    private Content<T> content;

    private boolean success;

    private String errorCode;

    private String errorMsg;

    public static <T> Response<T> succeed(T data) {
        Response<T> response = new Response<>();
        response.setContent(buildContent(data));
        response.setSuccess(true);
        response.setErrorCode(ResponseCode.SUCCESS.getCode());
        response.setErrorMsg(ResponseCode.SUCCESS.getDesc());
        return response;
    }

    public static <T> Response<T> fail(String code, String message) {
        Response<T> response = new Response<>();
        response.setSuccess(false);
        response.setErrorCode(code);
        response.setErrorMsg(message);
        return response;
    }

    private static <T> Content<T> buildContent(T data) {
        Content<T> content = new Content<>();
        content.setData(data);
        if (data instanceof List) {
            content.setCurrentPage(1);
            content.setTotalCount(((List)data).size());
        }
        return content;
    }

    public Content<T> getContent() {
        return content;
    }

    public void setContent(Content<T> content) {
        this.content = content;
    }

    public boolean isSuccess() {
        return success;
    }

    public void setSuccess(boolean success) {
        this.success = success;
    }

    public String getErrorCode() {
        return errorCode;
    }

    public void setErrorCode(String errorCode) {
        this.errorCode = errorCode;
    }

    public String getErrorMsg() {
        return errorMsg;
    }

    public void setErrorMsg(String errorMsg) {
        this.errorMsg = errorMsg;
    }

    @Override
    public String toString() {
        return "Response{" +
        "content=" + content +
        ", success=" + success +
        ", errorCode='" + errorCode + '\'' +
        ", errorMsg='" + errorMsg + '\'' +
        '}';
    }
}
