/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.springmvcaccount.service.impl;

import com.mycompany.springmvcaccount.dao.UserDao;
import com.mycompany.springmvcaccount.model.User;
import com.mycompany.springmvcaccount.service.UserService;
import java.util.Date;
import java.util.List;
import java.util.ArrayList;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

/**
 *
 * @author iviettech
 */
@Service("userService")
public class UserServiceImpl implements UserService{
    
    @Autowired
    private UserDao userDao;
    
    @Override
    public void insertUser(String name, String address, String birthday) {
    }

    @Override
    public void updateUser(User user) {
    }

    @Override
    public void deleteUser(long id) {
    }

    @Override
    public List<User> showAllUser() {
       return userDao.showAllUser();
    }
    
}
