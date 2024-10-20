package com.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.utils.PageUtils;
import com.entity.BupiaoxinxiEntity;
import java.util.List;
import java.util.Map;
import com.entity.vo.BupiaoxinxiVO;
import org.apache.ibatis.annotations.Param;
import com.entity.view.BupiaoxinxiView;


/**
 * 补票信息
 *
 * @author 
 * @email 
 * @date 2023-03-30 15:13:59
 */
public interface BupiaoxinxiService extends IService<BupiaoxinxiEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<BupiaoxinxiVO> selectListVO(Wrapper<BupiaoxinxiEntity> wrapper);
   	
   	BupiaoxinxiVO selectVO(@Param("ew") Wrapper<BupiaoxinxiEntity> wrapper);
   	
   	List<BupiaoxinxiView> selectListView(Wrapper<BupiaoxinxiEntity> wrapper);
   	
   	BupiaoxinxiView selectView(@Param("ew") Wrapper<BupiaoxinxiEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params,Wrapper<BupiaoxinxiEntity> wrapper);
   	

}

