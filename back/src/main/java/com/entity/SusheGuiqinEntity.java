package com.entity;

import com.baomidou.mybatisplus.annotations.TableId;
import com.baomidou.mybatisplus.annotations.TableName;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import java.lang.reflect.InvocationTargetException;

import java.io.Serializable;
import java.util.Date;
import java.util.List;

import org.springframework.format.annotation.DateTimeFormat;
import com.fasterxml.jackson.annotation.JsonFormat;
import org.apache.commons.beanutils.BeanUtils;
import com.baomidou.mybatisplus.annotations.TableField;
import com.baomidou.mybatisplus.enums.FieldFill;
import com.baomidou.mybatisplus.enums.IdType;

/**
 * 宿舍归寝
 *
 * @author 
 * @email
 */
@TableName("sushe_guiqin")
public class SusheGuiqinEntity<T> implements Serializable {
    private static final long serialVersionUID = 1L;


	public SusheGuiqinEntity() {

	}

	public SusheGuiqinEntity(T t) {
		try {
			BeanUtils.copyProperties(this, t);
		} catch (IllegalAccessException | InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}


    /**
     * 主键
     */
    @TableId(type = IdType.AUTO)
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
    @JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd")
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
    @TableField(value = "insert_time",fill = FieldFill.INSERT)

    private Date insertTime;


    /**
     * 创建时间
     */
    @JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd HH:mm:ss")
	@DateTimeFormat
    @TableField(value = "create_time",fill = FieldFill.INSERT)

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

    @Override
    public String toString() {
        return "SusheGuiqin{" +
            "id=" + id +
            ", yonghuId=" + yonghuId +
            ", guiqinTypes=" + guiqinTypes +
            ", guiqinTime=" + guiqinTime +
            ", susheGuiqinContent=" + susheGuiqinContent +
            ", insertTime=" + insertTime +
            ", createTime=" + createTime +
        "}";
    }
}
