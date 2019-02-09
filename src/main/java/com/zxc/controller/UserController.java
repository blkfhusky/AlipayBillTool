package com.zxc.controller;

import com.zxc.entity.MyUser;
import com.zxc.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

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

    @GetMapping("/{id}")
    public MyUser getUser(@PathVariable Long id) {
        return userService.getUser(id);
    }

    @PostMapping("/init")
    public Integer initUsers() {
        return userService.init();
    }



}
