package com.service.impl;

import org.springframework.stereotype.Service;
import java.util.Map;
import java.util.List;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.mapper.EntityWrapper;
import com.baomidou.mybatisplus.plugins.Page;
import com.baomidou.mybatisplus.service.impl.ServiceImpl;
import com.utils.PageUtils;
import com.utils.Query;


import com.dao.XiachexinxiDao;
import com.entity.XiachexinxiEntity;
import com.service.XiachexinxiService;
import com.entity.vo.XiachexinxiVO;
import com.entity.view.XiachexinxiView;

@Service("xiachexinxiService")
public class XiachexinxiServiceImpl extends ServiceImpl<XiachexinxiDao, XiachexinxiEntity> implements XiachexinxiService {
	
	
    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        Page<XiachexinxiEntity> page = this.selectPage(
                new Query<XiachexinxiEntity>(params).getPage(),
                new EntityWrapper<XiachexinxiEntity>()
        );
        return new PageUtils(page);
    }
    
    @Override
	public PageUtils queryPage(Map<String, Object> params, Wrapper<XiachexinxiEntity> wrapper) {
		  Page<XiachexinxiView> page =new Query<XiachexinxiView>(params).getPage();
	        page.setRecords(baseMapper.selectListView(page,wrapper));
	    	PageUtils pageUtil = new PageUtils(page);
	    	return pageUtil;
 	}
    
    @Override
	public List<XiachexinxiVO> selectListVO(Wrapper<XiachexinxiEntity> wrapper) {
 		return baseMapper.selectListVO(wrapper);
	}
	
	@Override
	public XiachexinxiVO selectVO(Wrapper<XiachexinxiEntity> wrapper) {
 		return baseMapper.selectVO(wrapper);
	}
	
	@Override
	public List<XiachexinxiView> selectListView(Wrapper<XiachexinxiEntity> wrapper) {
		return baseMapper.selectListView(wrapper);
	}

	@Override
	public XiachexinxiView selectView(Wrapper<XiachexinxiEntity> wrapper) {
		return baseMapper.selectView(wrapper);
	}


}
