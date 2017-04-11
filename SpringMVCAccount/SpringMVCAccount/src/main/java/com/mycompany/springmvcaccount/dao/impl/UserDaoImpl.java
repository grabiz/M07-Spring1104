/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.springmvcaccount.dao.impl;

import com.mycompany.springmvcaccount.dao.UserDao;
import com.mycompany.springmvcaccount.model.User;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;

/**
 *
 * @author iviettech
 */
@Repository
public class UserDaoImpl implements UserDao {

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
        return null;
    }
    
}
