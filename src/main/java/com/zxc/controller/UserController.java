package com.zxc.controller;

import com.zxc.entity.User;
import com.zxc.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Description:
 * User: blkfhusky
 * Date: 2018-11-16
 * Time: 6:09 PM
 * @author blkfhusky
 */
@RestController
@RequestMapping("/user")
public class UserController {

    @Autowired
    private UserService userService;

    @RequestMapping("/{id}")
    public User getUser(@PathVariable Long id) {
        return userService.getUser(id);
    }


}
