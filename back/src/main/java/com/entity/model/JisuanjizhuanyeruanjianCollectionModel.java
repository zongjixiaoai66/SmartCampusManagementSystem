package com.entity.model;

import com.entity.JisuanjizhuanyeruanjianCollectionEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import com.fasterxml.jackson.annotation.JsonFormat;
import java.util.Date;
import org.springframework.format.annotation.DateTimeFormat;
import java.io.Serializable;


/**
 * 计算机专业相关的软件收藏
 * 接收传参的实体类
 *（实际开发中配合移动端接口开发手动去掉些没用的字段， 后端一般用entity就够用了）
 * 取自ModelAndView 的model名称
 */
public class JisuanjizhuanyeruanjianCollectionModel implements Serializable {
    private static final long serialVersionUID = 1L;




    /**
     * 主键
     */
    private Integer id;


    /**
     * 计算机专业相关的软件
     */
    private Integer jisuanjizhuanyeruanjianId;


    /**
     * 用户
     */
    private Integer yonghuId;


    /**
     * 类型
     */
    private Integer jisuanjizhuanyeruanjianCollectionTypes;


    /**
     * 收藏时间
     */
    @JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd HH:mm:ss")
	@DateTimeFormat
    private Date insertTime;


    /**
     * 创建时间 show3 photoShow
     */
    @JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd HH:mm:ss")
	@DateTimeFormat
    private Date createTime;


    /**
	 * 获取：主键
	 */
    public Integer getId() {
        return id;
    }


    /**
	 * 设置：主键
	 */
    public void setId(Integer id) {
        this.id = id;
    }
    /**
	 * 获取：计算机专业相关的软件
	 */
    public Integer getJisuanjizhuanyeruanjianId() {
        return jisuanjizhuanyeruanjianId;
    }


    /**
	 * 设置：计算机专业相关的软件
	 */
    public void setJisuanjizhuanyeruanjianId(Integer jisuanjizhuanyeruanjianId) {
        this.jisuanjizhuanyeruanjianId = jisuanjizhuanyeruanjianId;
    }
    /**
	 * 获取：用户
	 */
    public Integer getYonghuId() {
        return yonghuId;
    }


    /**
	 * 设置：用户
	 */
    public void setYonghuId(Integer yonghuId) {
        this.yonghuId = yonghuId;
    }
    /**
	 * 获取：类型
	 */
    public Integer getJisuanjizhuanyeruanjianCollectionTypes() {
        return jisuanjizhuanyeruanjianCollectionTypes;
    }


    /**
	 * 设置：类型
	 */
    public void setJisuanjizhuanyeruanjianCollectionTypes(Integer jisuanjizhuanyeruanjianCollectionTypes) {
        this.jisuanjizhuanyeruanjianCollectionTypes = jisuanjizhuanyeruanjianCollectionTypes;
    }
    /**
	 * 获取：收藏时间
	 */
    public Date getInsertTime() {
        return insertTime;
    }


    /**
	 * 设置：收藏时间
	 */
    public void setInsertTime(Date insertTime) {
        this.insertTime = insertTime;
    }
    /**
	 * 获取：创建时间 show3 photoShow
	 */
    public Date getCreateTime() {
        return createTime;
    }


    /**
	 * 设置：创建时间 show3 photoShow
	 */
    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    }
