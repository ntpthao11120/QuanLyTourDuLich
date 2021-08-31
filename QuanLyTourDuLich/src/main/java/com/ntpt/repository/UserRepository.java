/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.ntpt.repository;

import com.ntpt.pojos.User;
import java.util.List;
import org.springframework.security.core.Transient;

/**
 *
 * @author ntpth
 */
public interface UserRepository {
    boolean addUser(User user);
    List<User> getUsers(String username);
}
