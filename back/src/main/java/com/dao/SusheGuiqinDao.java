package com.dao;

import com.entity.SusheGuiqinEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import java.util.Map;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.view.SusheGuiqinView;

/**
 * 宿舍归寝 Dao 接口
 *
 * @author 
 */
public interface SusheGuiqinDao extends BaseMapper<SusheGuiqinEntity> {

   List<SusheGuiqinView> selectListView(Pagination page,@Param("params")Map<String,Object> params);

}
