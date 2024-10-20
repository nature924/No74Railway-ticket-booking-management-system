package com.dao;

import com.entity.XiachexinxiEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import java.util.Map;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.vo.XiachexinxiVO;
import com.entity.view.XiachexinxiView;


/**
 * 下车信息
 * 
 * @author 
 * @email 
 * @date 2023-03-30 15:13:59
 */
public interface XiachexinxiDao extends BaseMapper<XiachexinxiEntity> {
	
	List<XiachexinxiVO> selectListVO(@Param("ew") Wrapper<XiachexinxiEntity> wrapper);
	
	XiachexinxiVO selectVO(@Param("ew") Wrapper<XiachexinxiEntity> wrapper);
	
	List<XiachexinxiView> selectListView(@Param("ew") Wrapper<XiachexinxiEntity> wrapper);

	List<XiachexinxiView> selectListView(Pagination page,@Param("ew") Wrapper<XiachexinxiEntity> wrapper);
	
	XiachexinxiView selectView(@Param("ew") Wrapper<XiachexinxiEntity> wrapper);
	

}
