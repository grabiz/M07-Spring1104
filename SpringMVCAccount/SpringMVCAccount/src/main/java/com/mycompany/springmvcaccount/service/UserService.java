/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.springmvcaccount.service;

import com.mycompany.springmvcaccount.model.User;
import java.util.Date;
import java.util.List;
import org.springframework.stereotype.Service;

/**
 *
 * @author iviettech
 */
@Service("userService")
public interface UserService {
    public void insertUser(String name, String address, String birthday);
    public void updateUser(User user);
    public void deleteUser(long id);
    public List<User> showAllUser();
}
