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
 * 宿舍报修
 *
 * @author 
 * @email
 */
@TableName("baoxiu")
public class BaoxiuEntity<T> implements Serializable {
    private static final long serialVersionUID = 1L;


	public BaoxiuEntity() {

	}

	public BaoxiuEntity(T t) {
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
     * 宿舍
     */
    @TableField(value = "sushe_id")

    private Integer susheId;


    /**
     * 用户
     */
    @TableField(value = "yonghu_id")

    private Integer yonghuId;


    /**
     * 报修时间
     */
    @JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd HH:mm:ss")
	@DateTimeFormat
    @TableField(value = "insert_time",fill = FieldFill.INSERT)

    private Date insertTime;


    /**
     * 报修名称
     */
    @TableField(value = "baoxiu_name")

    private String baoxiuName;


    /**
     * 报修图片
     */
    @TableField(value = "baoxiu_photo")

    private String baoxiuPhoto;


    /**
     * 报修内容
     */
    @TableField(value = "baoxiu_content")

    private String baoxiuContent;


    /**
     * 报修状态
     */
    @TableField(value = "baoxiu_types")

    private Integer baoxiuTypes;


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
	 * 设置：宿舍
	 */
    public Integer getSusheId() {
        return susheId;
    }
    /**
	 * 获取：宿舍
	 */

    public void setSusheId(Integer susheId) {
        this.susheId = susheId;
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
	 * 设置：报修时间
	 */
    public Date getInsertTime() {
        return insertTime;
    }
    /**
	 * 获取：报修时间
	 */

    public void setInsertTime(Date insertTime) {
        this.insertTime = insertTime;
    }
    /**
	 * 设置：报修名称
	 */
    public String getBaoxiuName() {
        return baoxiuName;
    }
    /**
	 * 获取：报修名称
	 */

    public void setBaoxiuName(String baoxiuName) {
        this.baoxiuName = baoxiuName;
    }
    /**
	 * 设置：报修图片
	 */
    public String getBaoxiuPhoto() {
        return baoxiuPhoto;
    }
    /**
	 * 获取：报修图片
	 */

    public void setBaoxiuPhoto(String baoxiuPhoto) {
        this.baoxiuPhoto = baoxiuPhoto;
    }
    /**
	 * 设置：报修内容
	 */
    public String getBaoxiuContent() {
        return baoxiuContent;
    }
    /**
	 * 获取：报修内容
	 */

    public void setBaoxiuContent(String baoxiuContent) {
        this.baoxiuContent = baoxiuContent;
    }
    /**
	 * 设置：报修状态
	 */
    public Integer getBaoxiuTypes() {
        return baoxiuTypes;
    }
    /**
	 * 获取：报修状态
	 */

    public void setBaoxiuTypes(Integer baoxiuTypes) {
        this.baoxiuTypes = baoxiuTypes;
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
        return "Baoxiu{" +
            "id=" + id +
            ", susheId=" + susheId +
            ", yonghuId=" + yonghuId +
            ", insertTime=" + insertTime +
            ", baoxiuName=" + baoxiuName +
            ", baoxiuPhoto=" + baoxiuPhoto +
            ", baoxiuContent=" + baoxiuContent +
            ", baoxiuTypes=" + baoxiuTypes +
            ", createTime=" + createTime +
        "}";
    }
}
