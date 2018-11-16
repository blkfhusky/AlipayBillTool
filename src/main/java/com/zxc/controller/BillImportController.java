package com.zxc.controller;

import com.zxc.service.BillService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Description:
 * User: blkfhusky
 * Date: 2018-11-16
 * Time: 6:09 PM
 */
@RestController
@RequestMapping("/bill-tool/import")
public class BillImportController {

    @Autowired
    private BillService billService;

    @RequestMapping("/hello")
    public String hello() {
        billService.importBill();
        return "hello";
    }
}
