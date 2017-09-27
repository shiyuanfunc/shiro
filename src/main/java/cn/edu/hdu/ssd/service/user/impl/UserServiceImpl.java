/*
 * File Name: UserServiceImpl.java
 * Copyright: Copyright 2016-2016 hdu All Rights Reserved.

 * Description:
 * Author: Pi Chen
 * Create Date: 2016年5月24日

 * Modifier: Pi Chen
 * Modify Date: 2016年5月24日
 * Bugzilla Id:
 * Modify Content:
 */
package cn.edu.hdu.ssd.service.user.impl;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import cn.edu.hdu.ssd.dao.IUserDao;
import cn.edu.hdu.ssd.model.User;
import cn.edu.hdu.ssd.service.user.IUserService;

/**
 *
 * @author Pi Chen
 * @version ssd V1.0.0, 2016年5月24日
 * @see
 * @since ssd V1.0.0
 */
@Service("userService")
public class UserServiceImpl implements IUserService
{

    @Autowired
    private IUserDao userDao;

    /**
     *
     * @see cn.edu.hdu.ssd.service.user.IUserService#queryAll()
     * @return
     * @throws Exception
     */
    public List<User> query(Map<String, Object> param)
    {
        return userDao.query(param);
    }

    /**
     *
     * @see cn.edu.hdu.ssd.service.user.IUserService#saveUser(java.util.Map)
     * @param param
     * @throws Exception
     */
    public User saveUser(User user)
    {
        Map<String, Object> param = new HashMap<String, Object>();
        param.put("name", user.getName());
        param.put("address", user.getAddress());
        userDao.saveUser(param);
        Object id = param.get("id");
        String s = String.valueOf(id);
        user.setId(Long.parseLong(s));
        return user;

    }

    /**
     *
     * @see cn.edu.hdu.ssd.service.user.IUserService#deleteUser(java.util.Map)
     * @param param
     * @throws Exception
     */
    public void deleteUser(long id)
    {
        Map<String, Object> param = new HashMap<String, Object>();
        param.put("id", id);
        userDao.deleteUser(param);
    }

    /**
     * brief description detail description
     *
     * @see cn.edu.hdu.ssd.service.user.IUserService#findById(long)
     * @param id
     */
    public User findById(long id)
    {
        Map<String, Object> param = new HashMap<String, Object>();
        param.put("id", id);
        List<User> users = this.query(param);
        return users.size() > 0 ? users.get(0) : null;
    }

    /**
     * brief description
     * detail description
     * @see cn.edu.hdu.ssd.service.user.IUserService#updateUser(cn.edu.hdu.ssd.model.User)
     * @param user
     * @return
     */
    public User updateUser(User user)
    {
        userDao.updateUser(user);
        return user;
    }

}
