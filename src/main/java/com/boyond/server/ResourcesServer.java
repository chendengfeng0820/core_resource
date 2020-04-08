package com.boyond.server;

import com.boyond.pojo.Resources;

import java.util.List;

public interface ResourcesServer {

	//增加
	void addResource(Resources resources);

	//删除
	void deleteById(Integer id);

	//修改
	void updateResourceById(Resources resources);

	//id查找
	Resources findById(Integer id);

	//全部查找
	List<Resources> findAll();


}
