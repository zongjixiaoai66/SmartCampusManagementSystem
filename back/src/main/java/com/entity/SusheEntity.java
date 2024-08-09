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
 * 宿舍
 *
 * @author 
 * @email
 */
@TableName("sushe")
public class SusheEntity<T> implements Serializable {
    private static final long serialVersionUID = 1L;


	public SusheEntity() {

	}

	public SusheEntity(T t) {
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
     * 宿舍名称
     */
    @TableField(value = "sushe_name")

    private String susheName;


    /**
     * 宿舍地址
     */
    @TableField(value = "sushe_address")

    private String susheAddress;


    /**
     * 宿舍详情
     */
    @TableField(value = "sushe_content")

    private String susheContent;


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
	 * 设置：宿舍名称
	 */
    public String getSusheName() {
        return susheName;
    }
    /**
	 * 获取：宿舍名称
	 */

    public void setSusheName(String susheName) {
        this.susheName = susheName;
    }
    /**
	 * 设置：宿舍地址
	 */
    public String getSusheAddress() {
        return susheAddress;
    }
    /**
	 * 获取：宿舍地址
	 */

    public void setSusheAddress(String susheAddress) {
        this.susheAddress = susheAddress;
    }
    /**
	 * 设置：宿舍详情
	 */
    public String getSusheContent() {
        return susheContent;
    }
    /**
	 * 获取：宿舍详情
	 */

    public void setSusheContent(String susheContent) {
        this.susheContent = susheContent;
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
        return "Sushe{" +
            "id=" + id +
            ", susheName=" + susheName +
            ", susheAddress=" + susheAddress +
            ", susheContent=" + susheContent +
            ", insertTime=" + insertTime +
            ", createTime=" + createTime +
        "}";
    }
}
