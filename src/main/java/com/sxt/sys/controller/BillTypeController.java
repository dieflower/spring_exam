package com.sxt.sys.controller;


import com.sxt.sys.domain.BillType;
import com.sxt.sys.service.BillTypeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;

import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * <p>
 *  前端控制器
 * </p>
 *
 * @author cr
 * @since 2019-04-23
 */
@RestController

public class BillTypeController {

    @Autowired
    private BillTypeService billTypeService;


    @RequestMapping("/bill/loadAllBill")
    public List<BillType> loadAllBill(){

        return billTypeService.queryAll();
    }

}

