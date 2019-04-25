package com.sxt.sys.controller;


import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.sxt.sys.domain.Bills;
import com.sxt.sys.service.BillsService;
import com.sxt.sys.utils.DataGridView;
import com.sxt.sys.utils.ResultObj;
import com.sxt.sys.vo.BillsVo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;

import org.springframework.web.bind.annotation.RestController;

/**
 * <p>
 *  前端控制器
 * </p>
 *
 * @author cr
 * @since 2019-04-23
 */
@RestController
public class BillsController {

    @Autowired
    private BillsService billsService;


    @RequestMapping("/bills/loadAllBills")
    public DataGridView loadAllbills(BillsVo billsVo){


        return billsService.queryAll(billsVo);
    }

    @RequestMapping("/bills/addBills")
    public ResultObj addBills(BillsVo billsVo){
        Integer code=1;
        String msg="";
        try {
            Integer info = billsService.insert(billsVo);
            code = info;
            msg = info > 0 ?"添加成功":"添加失败";
        } catch (Exception e) {
            code = 0;
            msg = "添加失败";
        }
        return new ResultObj(code , msg);
    }


}

