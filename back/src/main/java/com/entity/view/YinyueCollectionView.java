package com.entity.view;

import com.baomidou.mybatisplus.annotations.TableName;
import com.entity.YinyueCollectionEntity;
import org.apache.commons.beanutils.BeanUtils;

import java.io.Serializable;
import java.lang.reflect.InvocationTargetException;

/**
 * 音乐收藏
 * 后端返回视图实体辅助类
 * （通常后端关联的表或者自定义的字段需要返回使用）
 */
@TableName("yinyue_collection")
public class YinyueCollectionView extends YinyueCollectionEntity implements Serializable {
    private static final long serialVersionUID = 1L;

		/**
		* 类型的值
		*/
		private String yinyueCollectionValue;



		//级联表 yinyue
			/**
			* 音乐编号
			*/
			private String yinyueUuidNumber;
			/**
			* 音乐名称
			*/
			private String yinyueName;
			/**
			* 音乐照片
			*/
			private String yinyuePhoto;
			/**
			* 音乐
			*/
			private String yinyueMusic;
			/**
			* 音乐类型
			*/
			private Integer yinyueTypes;
				/**
				* 音乐类型的值
				*/
				private String yinyueValue;
			/**
			* 热度
			*/
			private Integer yinyueClicknum;
			/**
			* 赞
			*/
			private Integer zanNumber;
			/**
			* 踩
			*/
			private Integer caiNumber;
			/**
			* 音乐详情
			*/
			private String yinyueContent;
			/**
			* 是否上架
			*/
			private Integer shangxiaTypes;
				/**
				* 是否上架的值
				*/
				private String shangxiaValue;
			/**
			* 逻辑删除
			*/
			private Integer yinyueDelete;

		//级联表 yonghu
			/**
			* 用户姓名
			*/
			private String yonghuName;
			/**
			* 用户手机号
			*/
			private String yonghuPhone;
			/**
			* 用户身份证号
			*/
			private String yonghuIdNumber;
			/**
			* 用户头像
			*/
			private String yonghuPhoto;
			/**
			* 电子邮箱
			*/
			private String yonghuEmail;

	public YinyueCollectionView() {

	}

	public YinyueCollectionView(YinyueCollectionEntity yinyueCollectionEntity) {
		try {
			BeanUtils.copyProperties(this, yinyueCollectionEntity);
		} catch (IllegalAccessException | InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}



			/**
			* 获取： 类型的值
			*/
			public String getYinyueCollectionValue() {
				return yinyueCollectionValue;
			}
			/**
			* 设置： 类型的值
			*/
			public void setYinyueCollectionValue(String yinyueCollectionValue) {
				this.yinyueCollectionValue = yinyueCollectionValue;
			}

















































				//级联表的get和set yinyue

					/**
					* 获取： 音乐编号
					*/
					public String getYinyueUuidNumber() {
						return yinyueUuidNumber;
					}
					/**
					* 设置： 音乐编号
					*/
					public void setYinyueUuidNumber(String yinyueUuidNumber) {
						this.yinyueUuidNumber = yinyueUuidNumber;
					}

					/**
					* 获取： 音乐名称
					*/
					public String getYinyueName() {
						return yinyueName;
					}
					/**
					* 设置： 音乐名称
					*/
					public void setYinyueName(String yinyueName) {
						this.yinyueName = yinyueName;
					}

					/**
					* 获取： 音乐照片
					*/
					public String getYinyuePhoto() {
						return yinyuePhoto;
					}
					/**
					* 设置： 音乐照片
					*/
					public void setYinyuePhoto(String yinyuePhoto) {
						this.yinyuePhoto = yinyuePhoto;
					}

					/**
					* 获取： 音乐
					*/
					public String getYinyueMusic() {
						return yinyueMusic;
					}
					/**
					* 设置： 音乐
					*/
					public void setYinyueMusic(String yinyueMusic) {
						this.yinyueMusic = yinyueMusic;
					}

					/**
					* 获取： 音乐类型
					*/
					public Integer getYinyueTypes() {
						return yinyueTypes;
					}
					/**
					* 设置： 音乐类型
					*/
					public void setYinyueTypes(Integer yinyueTypes) {
						this.yinyueTypes = yinyueTypes;
					}


						/**
						* 获取： 音乐类型的值
						*/
						public String getYinyueValue() {
							return yinyueValue;
						}
						/**
						* 设置： 音乐类型的值
						*/
						public void setYinyueValue(String yinyueValue) {
							this.yinyueValue = yinyueValue;
						}

					/**
					* 获取： 热度
					*/
					public Integer getYinyueClicknum() {
						return yinyueClicknum;
					}
					/**
					* 设置： 热度
					*/
					public void setYinyueClicknum(Integer yinyueClicknum) {
						this.yinyueClicknum = yinyueClicknum;
					}

					/**
					* 获取： 赞
					*/
					public Integer getZanNumber() {
						return zanNumber;
					}
					/**
					* 设置： 赞
					*/
					public void setZanNumber(Integer zanNumber) {
						this.zanNumber = zanNumber;
					}

					/**
					* 获取： 踩
					*/
					public Integer getCaiNumber() {
						return caiNumber;
					}
					/**
					* 设置： 踩
					*/
					public void setCaiNumber(Integer caiNumber) {
						this.caiNumber = caiNumber;
					}

					/**
					* 获取： 音乐详情
					*/
					public String getYinyueContent() {
						return yinyueContent;
					}
					/**
					* 设置： 音乐详情
					*/
					public void setYinyueContent(String yinyueContent) {
						this.yinyueContent = yinyueContent;
					}

					/**
					* 获取： 是否上架
					*/
					public Integer getShangxiaTypes() {
						return shangxiaTypes;
					}
					/**
					* 设置： 是否上架
					*/
					public void setShangxiaTypes(Integer shangxiaTypes) {
						this.shangxiaTypes = shangxiaTypes;
					}


						/**
						* 获取： 是否上架的值
						*/
						public String getShangxiaValue() {
							return shangxiaValue;
						}
						/**
						* 设置： 是否上架的值
						*/
						public void setShangxiaValue(String shangxiaValue) {
							this.shangxiaValue = shangxiaValue;
						}

					/**
					* 获取： 逻辑删除
					*/
					public Integer getYinyueDelete() {
						return yinyueDelete;
					}
					/**
					* 设置： 逻辑删除
					*/
					public void setYinyueDelete(Integer yinyueDelete) {
						this.yinyueDelete = yinyueDelete;
					}










				//级联表的get和set yonghu

					/**
					* 获取： 用户姓名
					*/
					public String getYonghuName() {
						return yonghuName;
					}
					/**
					* 设置： 用户姓名
					*/
					public void setYonghuName(String yonghuName) {
						this.yonghuName = yonghuName;
					}

					/**
					* 获取： 用户手机号
					*/
					public String getYonghuPhone() {
						return yonghuPhone;
					}
					/**
					* 设置： 用户手机号
					*/
					public void setYonghuPhone(String yonghuPhone) {
						this.yonghuPhone = yonghuPhone;
					}

					/**
					* 获取： 用户身份证号
					*/
					public String getYonghuIdNumber() {
						return yonghuIdNumber;
					}
					/**
					* 设置： 用户身份证号
					*/
					public void setYonghuIdNumber(String yonghuIdNumber) {
						this.yonghuIdNumber = yonghuIdNumber;
					}

					/**
					* 获取： 用户头像
					*/
					public String getYonghuPhoto() {
						return yonghuPhoto;
					}
					/**
					* 设置： 用户头像
					*/
					public void setYonghuPhoto(String yonghuPhoto) {
						this.yonghuPhoto = yonghuPhoto;
					}

					/**
					* 获取： 电子邮箱
					*/
					public String getYonghuEmail() {
						return yonghuEmail;
					}
					/**
					* 设置： 电子邮箱
					*/
					public void setYonghuEmail(String yonghuEmail) {
						this.yonghuEmail = yonghuEmail;
					}



}
