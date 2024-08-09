package com.entity.vo;

import com.entity.SusheGuiqinEntity;
import com.baomidou.mybatisplus.annotations.TableField;
import com.baomidou.mybatisplus.annotations.TableName;
import com.fasterxml.jackson.annotation.JsonFormat;
import java.util.Date;
import org.springframework.format.annotation.DateTimeFormat;

import java.io.Serializable;

/**
 * 宿舍归寝
 * 手机端接口返回实体辅助类
 * （主要作用去除一些不必要的字段）
 */
@TableName("sushe_guiqin")
public class SusheGuiqinVO implements Serializable {
    private static final long serialVersionUID = 1L;


    /**
     * 主键
     */

    @TableField(value = "id")
    private Integer id;


    /**
     * 用户
     */

    @TableField(value = "yonghu_id")
    private Integer yonghuId;


    /**
     * 归寝状态
     */

    @TableField(value = "guiqin_types")
    private Integer guiqinTypes;


    /**
     * 归寝日期
     */
    @JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd HH:mm:ss")
	@DateTimeFormat

    @TableField(value = "guiqin_time")
    private Date guiqinTime;


    /**
     * 归寝详情
     */

    @TableField(value = "sushe_guiqin_content")
    private String susheGuiqinContent;


    /**
     * 录入时间
     */
    @JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd HH:mm:ss")
	@DateTimeFormat

    @TableField(value = "insert_time")
    private Date insertTime;


    /**
     * 创建时间
     */
    @JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd HH:mm:ss")
	@DateTimeFormat

    @TableField(value = "create_time")
    private Date createTime;


    /**
	 * 设置：主键
	 */
    public Integer getId() {
        return id;
    }


    /**
	 * 获取：主键
	 */

    public void setId(Integer id) {
        this.id = id;
    }
    /**
	 * 设置：用户
	 */
    public Integer getYonghuId() {
        return yonghuId;
    }


    /**
	 * 获取：用户
	 */

    public void setYonghuId(Integer yonghuId) {
        this.yonghuId = yonghuId;
    }
    /**
	 * 设置：归寝状态
	 */
    public Integer getGuiqinTypes() {
        return guiqinTypes;
    }


    /**
	 * 获取：归寝状态
	 */

    public void setGuiqinTypes(Integer guiqinTypes) {
        this.guiqinTypes = guiqinTypes;
    }
    /**
	 * 设置：归寝日期
	 */
    public Date getGuiqinTime() {
        return guiqinTime;
    }


    /**
	 * 获取：归寝日期
	 */

    public void setGuiqinTime(Date guiqinTime) {
        this.guiqinTime = guiqinTime;
    }
    /**
	 * 设置：归寝详情
	 */
    public String getSusheGuiqinContent() {
        return susheGuiqinContent;
    }


    /**
	 * 获取：归寝详情
	 */

    public void setSusheGuiqinContent(String susheGuiqinContent) {
        this.susheGuiqinContent = susheGuiqinContent;
    }
    /**
	 * 设置：录入时间
	 */
    public Date getInsertTime() {
        return insertTime;
    }


    /**
	 * 获取：录入时间
	 */

    public void setInsertTime(Date insertTime) {
        this.insertTime = insertTime;
    }
    /**
	 * 设置：创建时间
	 */
    public Date getCreateTime() {
        return createTime;
    }


    /**
	 * 获取：创建时间
	 */

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

}
