package com.zjy.dubbo.controller;


import com.zjy.dubbo.domain.User;
import com.zjy.dubbo.response.ResultResponse;
import com.zjy.dubbo.rpc.RPCResponse;
import com.zjy.dubbo.service.UserService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.annotation.Resource;

/**
 * @author zhangjiuyang
 * @create 2018/7/25
 * @since 1.0.0
 */
@Controller
@RequestMapping("/user")
public class UserController {
    @Resource(name = "userService")
    private UserService userService;

    @ResponseBody
    @RequestMapping(value = "/id", method = RequestMethod.POST)
    public ResultResponse findUserById(long id) {
        ResultResponse response = new ResultResponse();
        RPCResponse<User> result = userService.findUserById(id);
        if (result.isSuccess()) {
            response.setData(result.getResult());
        } else {
            response.setSuccess(false);
            response.setMsg(result.getErrorMessage());
        }
        return response;
    }

    @ResponseBody
    @RequestMapping(value = "/exception", method = RequestMethod.POST)
    public ResultResponse findUserThrowsException() {
        ResultResponse response = new ResultResponse();
        RPCResponse<User> result = userService.findUserThrowsException();
        if (result.isSuccess()) {
            response.setData(result.getResult());
        } else {
            response.setSuccess(false);
            response.setMsg(result.getErrorMessage());
        }
        return response;
    }
}
