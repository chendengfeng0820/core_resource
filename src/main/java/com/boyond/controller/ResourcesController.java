package com.boyond.controller;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import com.boyond.mapper.RescorcesMapper;
import com.boyond.pojo.Resources;
import com.boyond.server.ResourcesServer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.Date;
import java.util.List;

/**
 * @author: cdf
 * @create: 2020-04-07 14:59
 **/
@Controller
@RequestMapping("/resource")
public class ResourcesController {

	@Autowired
	private RescorcesMapper rescorcesMapper;

	//查找所有资源信息
	public String findAll(@RequestBody JSONObject jsonObject){
		Resources resources=JSON.parseObject(jsonObject.toString(),Resources.class);
		List<Resources> list=rescorcesMapper.findAll();
		return JSON.toJSONString(list);
	}


	//id查找资源信息
	@RequestMapping("/findById")
	public String findById(@RequestBody JSONObject jsonObject){
		Resources resources= JSON.parseObject(jsonObject.toString(),Resources.class);
		int id=resources.getId();
		Resources resources1=rescorcesMapper.findById(id);
		String result=JSON.toJSONString(resources1);
		return  result;
	}

	//删除资源
	@RequestMapping("/delete")
	public String deleteresource(@RequestBody JSONObject jsonObject){
		Resources resources= JSON.parseObject(jsonObject.toString(),Resources.class);
		int id=resources.getId();
		rescorcesMapper.deleteById(id);
		return JSON.toJSONString("t");
	}

	//修改资源
	@RequestMapping("/updateresource")
	public String updateresource(@RequestBody JSONObject jsonObject){
		Resources resources=JSON.parseObject(jsonObject.toString(),Resources.class);
		int id=resources.getId();
		Resources resources1=new Resources();
		resources1.setId(id);
		resources1.setName(resources.getName());
		resources1.setDescribe(resources.getDescribe());
		resources1.setType(resources.getType());
		resources1.setCategory(resources.getCategory());
		resources1.setParent_id(resources.getParent_id());
		resources1.setUrl(resources.getUrl());
		resources1.setSystem_id(resources.getSystem_id());
		resources1.setIcon(resources.getIcon());
		resources1.setSort(resources.getSort());
		resources1.setFavorite_id(resources.getFavorite_id());
		resources1.setAble_del(resources.getAble_del());
		resources1.setAble_edit(resources.getAble_edit());
		resources1.setAble_show(resources.getAble_show());
		resources1.setIs_deleted(resources.getIs_deleted());
		resources1.setCreate_time(resources.getCreate_time());
		resources1.setCreator(resources.getCreator());
		resources1.setUpdate_time(resources.getUpdate_time());
		resources1.setMender(resources.getMender());
		resources1.setUuid(resources.getUuid());
		rescorcesMapper.updateResourceById(resources1);
		return JSON.toJSONString("t");
	}

	//添加资源
	@RequestMapping("/addresource")
	public String addResource(@RequestBody JSONObject jsonObject){
		Resources resources= JSON.parseObject(jsonObject.toString(),Resources.class);
		resources.setName(resources.getName());
		resources.setDescribe(resources.getDescribe());
		resources.setType(resources.getType());
		resources.setCategory(resources.getCategory());
		resources.setParent_id(resources.getParent_id());
		resources.setUrl(resources.getUrl());
		resources.setSystem_id(resources.getSystem_id());
		resources.setIcon(resources.getIcon());
		resources.setSort(resources.getSort());
		resources.setFavorite_id(resources.getFavorite_id());
		resources.setAble_del(resources.getAble_del());
		resources.setAble_edit(resources.getAble_edit());
		resources.setAble_show(resources.getAble_show());
		resources.setIs_deleted(resources.getIs_deleted());
		resources.setCreate_time(resources.getCreate_time());
		resources.setCreator(resources.getCreator());
		resources.setUpdate_time(resources.getUpdate_time());
		resources.setMender(resources.getMender());
		resources.setUuid(resources.getUuid());
		rescorcesMapper.addResource(resources);
		return JSON.toJSONString("t");

	}
}
