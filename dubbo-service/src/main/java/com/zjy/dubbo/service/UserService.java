package com.zjy.dubbo.service;

import com.zjy.dubbo.domain.User;
import com.zjy.dubbo.rpc.RPCResponse;

//用户的接口
public interface UserService {
    /*  
     * 正常调用
     * @author zhangjiuyang
     * @date 2018/7/25 14:29
     * @param [id]
     * @return com.zjy.dubbo.rpc.RPCResponse<com.zjy.dubbo.domain.User>
     */
    public RPCResponse<User> findUserById(long id);

    /*  
     * 调用该方法会抛出异常
     * @author zhangjiuyang
     * @date 2018/7/25 14:30
     * @param []
     * @return com.zjy.dubbo.rpc.RPCResponse<com.zjy.dubbo.domain.User>
     */
    public RPCResponse<User> findUserThrowsException();
}
