package com.zjy.dubbo.response;

/**用于将结果集返回给前端
 * @author zhangjiuyang
 * @create 2018/7/25
 * @since 1.0.0
 */
public class ResultResponse {

    private boolean success = true;//是否成功

    private String msg;//错误信息或提示信息

    private Object data;//数据结果集

    public boolean isSuccess() {
        return success;
    }

    public void setSuccess(boolean success) {
        this.success = success;
    }

    public String getMsg() {
        return msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }

    public Object getData() {
        return data;
    }

    public void setData(Object data) {
        this.data = data;
    }
}
