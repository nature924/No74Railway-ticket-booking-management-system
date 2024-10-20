package com.entity.vo;

import com.entity.HuochexinxiEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import java.util.Date;
import org.springframework.format.annotation.DateTimeFormat;

import com.fasterxml.jackson.annotation.JsonFormat;
import java.io.Serializable;
 

/**
 * 火车信息
 * 手机端接口返回实体辅助类 
 * （主要作用去除一些不必要的字段）
 * @author 
 * @email 
 * @date 2023-03-30 15:13:59
 */
public class HuochexinxiVO  implements Serializable {
	private static final long serialVersionUID = 1L;

	 			
	/**
	 * 火车类型
	 */
	
	private String huocheleixing;
		
	/**
	 * 车次号
	 */
	
	private String checihao;
		
	/**
	 * 车站
	 */
	
	private String chezhan;
		
	/**
	 * 起点站
	 */
	
	private String qidianzhan;
		
	/**
	 * 途径站点
	 */
	
	private String tujingzhandian;
		
	/**
	 * 终点站
	 */
	
	private String zhongdianzhan;
		
	/**
	 * 开车时间
	 */
		
	@JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd HH:mm:ss")
	@DateTimeFormat 
	private Date kaicheshijian;
		
	/**
	 * 到站时间
	 */
		
	@JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd HH:mm:ss")
	@DateTimeFormat 
	private Date daozhanshijian;
		
	/**
	 * 列车图片
	 */
	
	private String liechetupian;
		
	/**
	 * 车票价格
	 */
	
	private Integer chepiaojiage;
		
	/**
	 * 剩余车票
	 */
	
	private Integer chepiaoshu;
		
	/**
	 * 列车路线
	 */
	
	private String liecheluxian;
				
	
	/**
	 * 设置：火车类型
	 */
	 
	public void setHuocheleixing(String huocheleixing) {
		this.huocheleixing = huocheleixing;
	}
	
	/**
	 * 获取：火车类型
	 */
	public String getHuocheleixing() {
		return huocheleixing;
	}
				
	
	/**
	 * 设置：车次号
	 */
	 
	public void setChecihao(String checihao) {
		this.checihao = checihao;
	}
	
	/**
	 * 获取：车次号
	 */
	public String getChecihao() {
		return checihao;
	}
				
	
	/**
	 * 设置：车站
	 */
	 
	public void setChezhan(String chezhan) {
		this.chezhan = chezhan;
	}
	
	/**
	 * 获取：车站
	 */
	public String getChezhan() {
		return chezhan;
	}
				
	
	/**
	 * 设置：起点站
	 */
	 
	public void setQidianzhan(String qidianzhan) {
		this.qidianzhan = qidianzhan;
	}
	
	/**
	 * 获取：起点站
	 */
	public String getQidianzhan() {
		return qidianzhan;
	}
				
	
	/**
	 * 设置：途径站点
	 */
	 
	public void setTujingzhandian(String tujingzhandian) {
		this.tujingzhandian = tujingzhandian;
	}
	
	/**
	 * 获取：途径站点
	 */
	public String getTujingzhandian() {
		return tujingzhandian;
	}
				
	
	/**
	 * 设置：终点站
	 */
	 
	public void setZhongdianzhan(String zhongdianzhan) {
		this.zhongdianzhan = zhongdianzhan;
	}
	
	/**
	 * 获取：终点站
	 */
	public String getZhongdianzhan() {
		return zhongdianzhan;
	}
				
	
	/**
	 * 设置：开车时间
	 */
	 
	public void setKaicheshijian(Date kaicheshijian) {
		this.kaicheshijian = kaicheshijian;
	}
	
	/**
	 * 获取：开车时间
	 */
	public Date getKaicheshijian() {
		return kaicheshijian;
	}
				
	
	/**
	 * 设置：到站时间
	 */
	 
	public void setDaozhanshijian(Date daozhanshijian) {
		this.daozhanshijian = daozhanshijian;
	}
	
	/**
	 * 获取：到站时间
	 */
	public Date getDaozhanshijian() {
		return daozhanshijian;
	}
				
	
	/**
	 * 设置：列车图片
	 */
	 
	public void setLiechetupian(String liechetupian) {
		this.liechetupian = liechetupian;
	}
	
	/**
	 * 获取：列车图片
	 */
	public String getLiechetupian() {
		return liechetupian;
	}
				
	
	/**
	 * 设置：车票价格
	 */
	 
	public void setChepiaojiage(Integer chepiaojiage) {
		this.chepiaojiage = chepiaojiage;
	}
	
	/**
	 * 获取：车票价格
	 */
	public Integer getChepiaojiage() {
		return chepiaojiage;
	}
				
	
	/**
	 * 设置：剩余车票
	 */
	 
	public void setChepiaoshu(Integer chepiaoshu) {
		this.chepiaoshu = chepiaoshu;
	}
	
	/**
	 * 获取：剩余车票
	 */
	public Integer getChepiaoshu() {
		return chepiaoshu;
	}
				
	
	/**
	 * 设置：列车路线
	 */
	 
	public void setLiecheluxian(String liecheluxian) {
		this.liecheluxian = liecheluxian;
	}
	
	/**
	 * 获取：列车路线
	 */
	public String getLiecheluxian() {
		return liecheluxian;
	}
			
}
