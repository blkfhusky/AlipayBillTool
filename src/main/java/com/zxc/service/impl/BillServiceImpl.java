package com.zxc.service.impl;

import com.zxc.mapper.UserMapper;
import com.zxc.service.BillService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.servlet.DispatcherServlet;

/**
 * Description:
 * User: blkfhusky
 * Date: 2018-11-16
 * Time: 6:13 PM
 */
@Service(value = "billService")
public class BillServiceImpl implements BillService {

    @Autowired
    private UserMapper userMapper;

    @Override
    public boolean importBill() {
        System.out.println(userMapper.get(1L).getName());
//        DispatcherServlet
        return false;
    }
}
