package com.entity.model;

import com.entity.BeiwangluEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import com.fasterxml.jackson.annotation.JsonFormat;
import java.util.Date;
import org.springframework.format.annotation.DateTimeFormat;
import java.io.Serializable;


/**
 * 备忘录
 * 接收传参的实体类
 *（实际开发中配合移动端接口开发手动去掉些没用的字段， 后端一般用entity就够用了）
 * 取自ModelAndView 的model名称
 */
public class BeiwangluModel implements Serializable {
    private static final long serialVersionUID = 1L;




    /**
     * 主键
     */
    private Integer id;


    /**
     * 用户
     */
    private Integer yonghuId;


    /**
     * 备忘录名称
     */
    private String beiwangluName;


    /**
     * 备忘录类型
     */
    private Integer beiwangluTypes;


    /**
     * 备忘录详情
     */
    private String beiwangluContent;


    /**
     * 记录时间
     */
    @JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd HH:mm:ss")
	@DateTimeFormat
    private Date insertTime;


    /**
     * 创建时间
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
	 * 获取：备忘录名称
	 */
    public String getBeiwangluName() {
        return beiwangluName;
    }


    /**
	 * 设置：备忘录名称
	 */
    public void setBeiwangluName(String beiwangluName) {
        this.beiwangluName = beiwangluName;
    }
    /**
	 * 获取：备忘录类型
	 */
    public Integer getBeiwangluTypes() {
        return beiwangluTypes;
    }


    /**
	 * 设置：备忘录类型
	 */
    public void setBeiwangluTypes(Integer beiwangluTypes) {
        this.beiwangluTypes = beiwangluTypes;
    }
    /**
	 * 获取：备忘录详情
	 */
    public String getBeiwangluContent() {
        return beiwangluContent;
    }


    /**
	 * 设置：备忘录详情
	 */
    public void setBeiwangluContent(String beiwangluContent) {
        this.beiwangluContent = beiwangluContent;
    }
    /**
	 * 获取：记录时间
	 */
    public Date getInsertTime() {
        return insertTime;
    }


    /**
	 * 设置：记录时间
	 */
    public void setInsertTime(Date insertTime) {
        this.insertTime = insertTime;
    }
    /**
	 * 获取：创建时间
	 */
    public Date getCreateTime() {
        return createTime;
    }


    /**
	 * 设置：创建时间
	 */
    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    }
