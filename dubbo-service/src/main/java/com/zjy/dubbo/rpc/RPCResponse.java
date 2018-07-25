package com.zjy.dubbo.rpc;

import java.io.Serializable;

/**封装dubbo返回结果集合
 * @author zhangjiuyang
 * @create 2018/7/25
 * @since 1.0.0
 */
public class RPCResponse<T> implements Serializable {
    private static final long serialVersionUID = 1L;

    private boolean success = true;//是否成功

    private String errorMessage;//错误消息

    private Object result;//结果集

    private String message;//自定义消息

    public boolean isSuccess() {
        return success;
    }

    public void setSuccess(boolean success) {
        this.success = success;
    }

    public String getErrorMessage() {
        return errorMessage;
    }

    public void setErrorMessage(String errorMessage) {
        this.errorMessage = errorMessage;
    }

    public Object getResult() {
        return result;
    }

    public void setResult(Object result) {
        this.result = result;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }
}
