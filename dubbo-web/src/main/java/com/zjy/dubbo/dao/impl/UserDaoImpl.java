package com.zjy.dubbo.dao.impl;

import com.zjy.dubbo.dao.UserDao;
import com.zjy.dubbo.domain.User;
import org.springframework.stereotype.Repository;
import org.springframework.web.context.ContextLoaderListener;

/**dao数据层操作
 * @author zhangjiuyang
 * @create 2018/7/25
 * @since 1.0.0
 */
@Repository("userDao")
public class UserDaoImpl implements UserDao {
    /*  
     * 通过模拟数据库数据，返回结果
     * @author zhangjiuyang
     * @date 2018/7/25 15:10
     * @param [id]
     * @return com.zjy.dubbo.domain.User
     */
    @Override
    public User findUserById(long id) {
        User user = new User();
        user.setUsername("张久阳");
        user.setEmail("zjy_zjy@183.com");
        user.setMobile("112222222222");
        user.setPassword("122222");
        user.setId(id);
        return user;
    }
    
    @Override
    public User findUserThrowsException() {
        int i = 1 / 0;
        System.out.println(i);
        return null;
    }
}
