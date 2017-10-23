package com.cn.hnust.service.impl;
import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.cn.hnust.dao.UserMapper;
import com.cn.hnust.entity.User;
import com.cn.hnust.service.IUserService;  
/**
 * 
 * @ClassName:     UserServiceImpl   
 * @Description:    
 * @author:        caihaifeng
 * @date:          2017年10月23日 下午5:19:17 
 *
 * 
 */
@Service("userService")  
public class UserServiceImpl implements IUserService {  
    @Resource  
    private UserMapper userDao;  
    @Override  
    public User getUserById(int userId) {  
        // TODO Auto-generated method stub  
        return this.userDao.selectByPrimaryKey(userId);  
    }  
  
}  
