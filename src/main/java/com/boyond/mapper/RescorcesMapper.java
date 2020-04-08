package com.boyond.mapper;

import com.boyond.pojo.Resources;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;

import java.util.List;

@Mapper
@Component
public interface RescorcesMapper {


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
