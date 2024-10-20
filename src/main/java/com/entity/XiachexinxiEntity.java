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
 * 下车信息
 * 数据库通用操作实体类（普通增删改查）
 * @author 
 * @email 
 * @date 2023-03-30 15:13:59
 */
@TableName("xiachexinxi")
public class XiachexinxiEntity<T> implements Serializable {
	private static final long serialVersionUID = 1L;


	public XiachexinxiEntity() {
		
	}
	
	public XiachexinxiEntity(T t) {
		try {
			BeanUtils.copyProperties(this, t);
		} catch (IllegalAccessException | InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	/**
	 * 主键id
	 */
	@TableId
	private Long id;
	/**
	 * 下车编号
	 */
					
	private String xiachebianhao;
	
	/**
	 * 下车站点
	 */
					
	private String xiachezhandian;
	
	/**
	 * 下车时间
	 */
				
	@JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd HH:mm:ss")
	@DateTimeFormat 		
	private Date xiacheshijian;
	
	/**
	 * 下车备注
	 */
					
	private String xiachebeizhu;
	
	/**
	 * 用户账号
	 */
					
	private String yonghuzhanghao;
	
	/**
	 * 用户姓名
	 */
					
	private String yonghuxingming;
	
	
	@JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd HH:mm:ss")
	@DateTimeFormat
	private Date addtime;

	public Date getAddtime() {
		return addtime;
	}
	public void setAddtime(Date addtime) {
		this.addtime = addtime;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}
	/**
	 * 设置：下车编号
	 */
	public void setXiachebianhao(String xiachebianhao) {
		this.xiachebianhao = xiachebianhao;
	}
	/**
	 * 获取：下车编号
	 */
	public String getXiachebianhao() {
		return xiachebianhao;
	}
	/**
	 * 设置：下车站点
	 */
	public void setXiachezhandian(String xiachezhandian) {
		this.xiachezhandian = xiachezhandian;
	}
	/**
	 * 获取：下车站点
	 */
	public String getXiachezhandian() {
		return xiachezhandian;
	}
	/**
	 * 设置：下车时间
	 */
	public void setXiacheshijian(Date xiacheshijian) {
		this.xiacheshijian = xiacheshijian;
	}
	/**
	 * 获取：下车时间
	 */
	public Date getXiacheshijian() {
		return xiacheshijian;
	}
	/**
	 * 设置：下车备注
	 */
	public void setXiachebeizhu(String xiachebeizhu) {
		this.xiachebeizhu = xiachebeizhu;
	}
	/**
	 * 获取：下车备注
	 */
	public String getXiachebeizhu() {
		return xiachebeizhu;
	}
	/**
	 * 设置：用户账号
	 */
	public void setYonghuzhanghao(String yonghuzhanghao) {
		this.yonghuzhanghao = yonghuzhanghao;
	}
	/**
	 * 获取：用户账号
	 */
	public String getYonghuzhanghao() {
		return yonghuzhanghao;
	}
	/**
	 * 设置：用户姓名
	 */
	public void setYonghuxingming(String yonghuxingming) {
		this.yonghuxingming = yonghuxingming;
	}
	/**
	 * 获取：用户姓名
	 */
	public String getYonghuxingming() {
		return yonghuxingming;
	}

}
