package com.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.utils.PageUtils;
import com.entity.XiachexinxiEntity;
import java.util.List;
import java.util.Map;
import com.entity.vo.XiachexinxiVO;
import org.apache.ibatis.annotations.Param;
import com.entity.view.XiachexinxiView;


/**
 * 下车信息
 *
 * @author 
 * @email 
 * @date 2023-03-30 15:13:59
 */
public interface XiachexinxiService extends IService<XiachexinxiEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<XiachexinxiVO> selectListVO(Wrapper<XiachexinxiEntity> wrapper);
   	
   	XiachexinxiVO selectVO(@Param("ew") Wrapper<XiachexinxiEntity> wrapper);
   	
   	List<XiachexinxiView> selectListView(Wrapper<XiachexinxiEntity> wrapper);
   	
   	XiachexinxiView selectView(@Param("ew") Wrapper<XiachexinxiEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params,Wrapper<XiachexinxiEntity> wrapper);
   	

}

