package com.zjy.dubbo.service.impl;

import com.zjy.dubbo.dao.UserDao;
import com.zjy.dubbo.domain.User;
import com.zjy.dubbo.rpc.RPCResponse;
import com.zjy.dubbo.service.UserService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

/**
 * @author zhangjiuyang
 * @create 2018/7/25
 * @since 1.0.0
 */
@Service("userService")
public class UserServiceImpl implements UserService {

    @Resource(name = "userDao")
    private UserDao userDao;

    @Override
    public RPCResponse<User> findUserById(long id) {
        RPCResponse<User> response = new RPCResponse<>();
        try {
            User user = userDao.findUserById(id);
            response.setResult(user);
        } catch (Exception e) {
            e.printStackTrace();
            response.setSuccess(false);
            response.setErrorMessage(e.getMessage());
        }
        return response;
    }

    @Override
    public RPCResponse<User> findUserThrowsException() {
        RPCResponse<User> response = new RPCResponse<>();
        try {
            User user = userDao.findUserThrowsException();
            response.setResult(user);
        } catch (Exception e) {
            e.printStackTrace();
            response.setSuccess(false);
            response.setMessage(e.getMessage());
        }
        return response;
    }
}
