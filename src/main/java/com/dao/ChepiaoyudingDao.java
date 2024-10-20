package com.dao;

import com.entity.ChepiaoyudingEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import java.util.Map;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.vo.ChepiaoyudingVO;
import com.entity.view.ChepiaoyudingView;


/**
 * 车票预订
 * 
 * @author 
 * @email 
 * @date 2023-03-30 15:13:59
 */
public interface ChepiaoyudingDao extends BaseMapper<ChepiaoyudingEntity> {
	
	List<ChepiaoyudingVO> selectListVO(@Param("ew") Wrapper<ChepiaoyudingEntity> wrapper);
	
	ChepiaoyudingVO selectVO(@Param("ew") Wrapper<ChepiaoyudingEntity> wrapper);
	
	List<ChepiaoyudingView> selectListView(@Param("ew") Wrapper<ChepiaoyudingEntity> wrapper);

	List<ChepiaoyudingView> selectListView(Pagination page,@Param("ew") Wrapper<ChepiaoyudingEntity> wrapper);
	
	ChepiaoyudingView selectView(@Param("ew") Wrapper<ChepiaoyudingEntity> wrapper);
	

    List<Map<String, Object>> selectValue(@Param("params") Map<String, Object> params,@Param("ew") Wrapper<ChepiaoyudingEntity> wrapper);

    List<Map<String, Object>> selectTimeStatValue(@Param("params") Map<String, Object> params,@Param("ew") Wrapper<ChepiaoyudingEntity> wrapper);

    List<Map<String, Object>> selectGroup(@Param("params") Map<String, Object> params,@Param("ew") Wrapper<ChepiaoyudingEntity> wrapper);



}
