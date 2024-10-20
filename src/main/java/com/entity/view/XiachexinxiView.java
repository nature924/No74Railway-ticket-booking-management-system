package com.entity.view;

import com.entity.XiachexinxiEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import org.apache.commons.beanutils.BeanUtils;
import java.lang.reflect.InvocationTargetException;

import java.io.Serializable;
 

/**
 * 下车信息
 * 后端返回视图实体辅助类   
 * （通常后端关联的表或者自定义的字段需要返回使用）
 * @author 
 * @email 
 * @date 2023-03-30 15:13:59
 */
@TableName("xiachexinxi")
public class XiachexinxiView  extends XiachexinxiEntity implements Serializable {
	private static final long serialVersionUID = 1L;

	public XiachexinxiView(){
	}
 
 	public XiachexinxiView(XiachexinxiEntity xiachexinxiEntity){
 	try {
			BeanUtils.copyProperties(this, xiachexinxiEntity);
		} catch (IllegalAccessException | InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
 		
	}
}
