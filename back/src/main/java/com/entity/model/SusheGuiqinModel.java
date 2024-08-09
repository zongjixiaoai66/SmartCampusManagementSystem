package com.entity.model;

import com.entity.SusheGuiqinEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import com.fasterxml.jackson.annotation.JsonFormat;
import java.util.Date;
import org.springframework.format.annotation.DateTimeFormat;
import java.io.Serializable;


/**
 * 宿舍归寝
 * 接收传参的实体类
 *（实际开发中配合移动端接口开发手动去掉些没用的字段， 后端一般用entity就够用了）
 * 取自ModelAndView 的model名称
 */
public class SusheGuiqinModel implements Serializable {
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
     * 归寝状态
     */
    private Integer guiqinTypes;


    /**
     * 归寝日期
     */
    @JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd HH:mm:ss")
	@DateTimeFormat
    private Date guiqinTime;


    /**
     * 归寝详情
     */
    private String susheGuiqinContent;


    /**
     * 录入时间
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
	 * 获取：归寝状态
	 */
    public Integer getGuiqinTypes() {
        return guiqinTypes;
    }


    /**
	 * 设置：归寝状态
	 */
    public void setGuiqinTypes(Integer guiqinTypes) {
        this.guiqinTypes = guiqinTypes;
    }
    /**
	 * 获取：归寝日期
	 */
    public Date getGuiqinTime() {
        return guiqinTime;
    }


    /**
	 * 设置：归寝日期
	 */
    public void setGuiqinTime(Date guiqinTime) {
        this.guiqinTime = guiqinTime;
    }
    /**
	 * 获取：归寝详情
	 */
    public String getSusheGuiqinContent() {
        return susheGuiqinContent;
    }


    /**
	 * 设置：归寝详情
	 */
    public void setSusheGuiqinContent(String susheGuiqinContent) {
        this.susheGuiqinContent = susheGuiqinContent;
    }
    /**
	 * 获取：录入时间
	 */
    public Date getInsertTime() {
        return insertTime;
    }


    /**
	 * 设置：录入时间
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
