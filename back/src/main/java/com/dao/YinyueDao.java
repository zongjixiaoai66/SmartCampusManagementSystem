package com.dao;

import com.baomidou.mybatisplus.mapper.BaseMapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;
import com.entity.YinyueEntity;
import com.entity.view.YinyueView;
import org.apache.ibatis.annotations.Param;

import java.util.List;
import java.util.Map;

/**
 * 音乐 Dao 接口
 *
 * @author 
 */
public interface YinyueDao extends BaseMapper<YinyueEntity> {

   List<YinyueView> selectListView(Pagination page, @Param("params") Map<String, Object> params);

}
