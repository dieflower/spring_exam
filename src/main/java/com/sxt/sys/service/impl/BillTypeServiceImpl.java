package com.sxt.sys.service.impl;

import com.sxt.sys.domain.BillType;
import com.sxt.sys.mapper.BillTypeMapper;
import com.sxt.sys.service.BillTypeService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
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
public class BillTypeServiceImpl extends ServiceImpl<BillTypeMapper, BillType> implements BillTypeService {
    @Autowired
    private BillTypeMapper billTypeMapper;
    @Override
    public List<BillType> queryAll() {
        return billTypeMapper.selectList(null);
    }
}
