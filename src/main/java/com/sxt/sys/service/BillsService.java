package com.sxt.sys.service;

import com.sxt.sys.domain.Bills;
import com.baomidou.mybatisplus.extension.service.IService;
import com.sxt.sys.utils.DataGridView;
import com.sxt.sys.vo.BillsVo;
import org.springframework.stereotype.Component;

/**
 * <p>
 *  服务类
 * </p>
 *
 * @author cr
 * @since 2019-04-23
 */
public interface BillsService extends IService<Bills> {

    DataGridView queryAll(BillsVo billsVo);

    Integer insert(BillsVo billsVo);
}
