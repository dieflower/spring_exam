package com.sxt.sys.service.impl;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.github.pagehelper.Page;
import com.github.pagehelper.PageHelper;
import com.sxt.sys.domain.Bills;
import com.sxt.sys.mapper.BillsMapper;
import com.sxt.sys.service.BillsService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.sxt.sys.utils.DataGridView;
import com.sxt.sys.vo.BillsVo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * <p>
 *  服务实现类
 * </p>
 *
 * @author cr
 * @since 2019-04-23
 */
@Service
public class BillsServiceImpl extends ServiceImpl<BillsMapper, Bills> implements BillsService {
    @Autowired
    private BillsMapper billsMapper;


    @Override
    public DataGridView queryAll(BillsVo billsVo) {
        Page<Object> objects = PageHelper.startPage(billsVo.getPage(), billsVo.getLimit());
        List<Bills> bills = billsMapper.queryAllBills(billsVo);
        return new DataGridView(objects.getTotal(),bills);
    }

    @Override
    public Integer insert(BillsVo billsVo) {


        return billsMapper.insert(billsVo);
    }
}
