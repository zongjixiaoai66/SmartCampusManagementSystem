package com.dao;

import com.entity.JisuanjizhuanyeruanjianCollectionEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import java.util.Map;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.view.JisuanjizhuanyeruanjianCollectionView;

/**
 * 计算机专业相关的软件收藏 Dao 接口
 *
 * @author 
 */
public interface JisuanjizhuanyeruanjianCollectionDao extends BaseMapper<JisuanjizhuanyeruanjianCollectionEntity> {

   List<JisuanjizhuanyeruanjianCollectionView> selectListView(Pagination page,@Param("params")Map<String,Object> params);

}
