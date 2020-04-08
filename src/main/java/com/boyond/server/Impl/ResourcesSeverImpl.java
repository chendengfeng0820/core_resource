package com.boyond.server.Impl;

import com.boyond.mapper.RescorcesMapper;
import com.boyond.pojo.Resources;
import com.boyond.server.ResourcesServer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author: cdf
 * @create: 2020-04-07 14:17
 **/
@Service
public class ResourcesSeverImpl implements ResourcesServer {

	@Autowired
	private RescorcesMapper rescorcesMapper;

	@Override
	public void addResource(Resources resources) {
		rescorcesMapper.addResource(resources);
	}

	@Override
	public void deleteById(Integer id) {
		rescorcesMapper.deleteById(id);
	}

	@Override
	public void updateResourceById(Resources resources) {
		rescorcesMapper.updateResourceById(resources);
	}

	@Override
	public Resources findById(Integer id) {
		return rescorcesMapper.findById(id);
	}

	@Override
	public List<Resources> findAll() {
		return rescorcesMapper.findAll();
	}
}
