package com.dao;

import com.entity.SusheEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import java.util.Map;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.view.SusheView;

/**
 * 宿舍 Dao 接口
 *
 * @author 
 */
public interface SusheDao extends BaseMapper<SusheEntity> {

   List<SusheView> selectListView(Pagination page,@Param("params")Map<String,Object> params);

}
