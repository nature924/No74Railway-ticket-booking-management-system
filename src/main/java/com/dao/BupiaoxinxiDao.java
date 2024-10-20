package com.dao;

import com.entity.BupiaoxinxiEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import java.util.Map;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.vo.BupiaoxinxiVO;
import com.entity.view.BupiaoxinxiView;


/**
 * 补票信息
 * 
 * @author 
 * @email 
 * @date 2023-03-30 15:13:59
 */
public interface BupiaoxinxiDao extends BaseMapper<BupiaoxinxiEntity> {
	
	List<BupiaoxinxiVO> selectListVO(@Param("ew") Wrapper<BupiaoxinxiEntity> wrapper);
	
	BupiaoxinxiVO selectVO(@Param("ew") Wrapper<BupiaoxinxiEntity> wrapper);
	
	List<BupiaoxinxiView> selectListView(@Param("ew") Wrapper<BupiaoxinxiEntity> wrapper);

	List<BupiaoxinxiView> selectListView(Pagination page,@Param("ew") Wrapper<BupiaoxinxiEntity> wrapper);
	
	BupiaoxinxiView selectView(@Param("ew") Wrapper<BupiaoxinxiEntity> wrapper);
	

}
