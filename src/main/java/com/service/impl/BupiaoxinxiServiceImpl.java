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


import com.dao.BupiaoxinxiDao;
import com.entity.BupiaoxinxiEntity;
import com.service.BupiaoxinxiService;
import com.entity.vo.BupiaoxinxiVO;
import com.entity.view.BupiaoxinxiView;

@Service("bupiaoxinxiService")
public class BupiaoxinxiServiceImpl extends ServiceImpl<BupiaoxinxiDao, BupiaoxinxiEntity> implements BupiaoxinxiService {
	
	
    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        Page<BupiaoxinxiEntity> page = this.selectPage(
                new Query<BupiaoxinxiEntity>(params).getPage(),
                new EntityWrapper<BupiaoxinxiEntity>()
        );
        return new PageUtils(page);
    }
    
    @Override
	public PageUtils queryPage(Map<String, Object> params, Wrapper<BupiaoxinxiEntity> wrapper) {
		  Page<BupiaoxinxiView> page =new Query<BupiaoxinxiView>(params).getPage();
	        page.setRecords(baseMapper.selectListView(page,wrapper));
	    	PageUtils pageUtil = new PageUtils(page);
	    	return pageUtil;
 	}
    
    @Override
	public List<BupiaoxinxiVO> selectListVO(Wrapper<BupiaoxinxiEntity> wrapper) {
 		return baseMapper.selectListVO(wrapper);
	}
	
	@Override
	public BupiaoxinxiVO selectVO(Wrapper<BupiaoxinxiEntity> wrapper) {
 		return baseMapper.selectVO(wrapper);
	}
	
	@Override
	public List<BupiaoxinxiView> selectListView(Wrapper<BupiaoxinxiEntity> wrapper) {
		return baseMapper.selectListView(wrapper);
	}

	@Override
	public BupiaoxinxiView selectView(Wrapper<BupiaoxinxiEntity> wrapper) {
		return baseMapper.selectView(wrapper);
	}


}
