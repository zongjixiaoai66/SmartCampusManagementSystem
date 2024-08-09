package com.service;

import com.baomidou.mybatisplus.service.IService;
import com.utils.PageUtils;
import com.entity.JisuanjizhuanyeruanjianEntity;
import java.util.Map;
import javax.servlet.http.HttpServletRequest;

/**
 * 计算机专业相关的软件 服务类
 */
public interface JisuanjizhuanyeruanjianService extends IService<JisuanjizhuanyeruanjianEntity> {

    /**
    * @param params 查询参数
    * @return 带分页的查询出来的数据
    */
     PageUtils queryPage(Map<String, Object> params);
}