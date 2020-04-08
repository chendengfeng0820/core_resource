package com.boyond.pojo;

import java.util.Date;

/**
 * @author: cdf
 * @create: 2020-04-07 14:00
 **/
public class Resources {

	private  int id;
	private String name;
	private String describe;
	private int type;
	private int category;
	private int parent_id;
	private String url;
	private int system_id;
	private String icon;
	private int sort;
	private int favorite_id;
	private int able_del;
	private int able_edit;
	private int able_show;
	private int is_deleted;
	private Date create_time;
	private int creator;
	private Date update_time;
	private int mender;
	private String uuid;


	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getDescribe() {
		return describe;
	}

	public void setDescribe(String describe) {
		this.describe = describe;
	}

	public int getType() {
		return type;
	}

	public void setType(int type) {
		this.type = type;
	}

	public int getCategory() {
		return category;
	}

	public void setCategory(int category) {
		this.category = category;
	}

	public int getParent_id() {
		return parent_id;
	}

	public void setParent_id(int parent_id) {
		this.parent_id = parent_id;
	}

	public String getUrl() {
		return url;
	}

	public void setUrl(String url) {
		this.url = url;
	}

	public int getSystem_id() {
		return system_id;
	}

	public void setSystem_id(int system_id) {
		this.system_id = system_id;
	}

	public String getIcon() {
		return icon;
	}

	public void setIcon(String icon) {
		this.icon = icon;
	}

	public int getSort() {
		return sort;
	}

	public void setSort(int sort) {
		this.sort = sort;
	}

	public int getFavorite_id() {
		return favorite_id;
	}

	public void setFavorite_id(int favorite_id) {
		this.favorite_id = favorite_id;
	}

	public int getAble_del() {
		return able_del;
	}

	public void setAble_del(int able_del) {
		this.able_del = able_del;
	}

	public int getAble_edit() {
		return able_edit;
	}

	public void setAble_edit(int able_edit) {
		this.able_edit = able_edit;
	}

	public int getAble_show() {
		return able_show;
	}

	public void setAble_show(int able_show) {
		this.able_show = able_show;
	}

	public int getIs_deleted() {
		return is_deleted;
	}

	public void setIs_deleted(int is_deleted) {
		this.is_deleted = is_deleted;
	}

	public Date getCreate_time() {
		return create_time;
	}

	public void setCreate_time(Date create_time) {
		this.create_time = create_time;
	}

	public int getCreator() {
		return creator;
	}

	public void setCreator(int creator) {
		this.creator = creator;
	}

	public Date getUpdate_time() {
		return update_time;
	}

	public void setUpdate_time(Date update_time) {
		this.update_time = update_time;
	}

	public int getMender() {
		return mender;
	}

	public void setMender(int mender) {
		this.mender = mender;
	}

	public String getUuid() {
		return uuid;
	}

	public void setUuid(String uuid) {
		this.uuid = uuid;
	}


	public Resources() {
	}

	@Override
	public String toString() {
		return "Resources{" +
				"id=" + id +
				", name='" + name + '\'' +
				", describe='" + describe + '\'' +
				", type=" + type +
				", category=" + category +
				", parent_id=" + parent_id +
				", url='" + url + '\'' +
				", system_id=" + system_id +
				", icon='" + icon + '\'' +
				", sort=" + sort +
				", favorite_id=" + favorite_id +
				", able_del=" + able_del +
				", able_edit=" + able_edit +
				", able_show=" + able_show +
				", is_deleted=" + is_deleted +
				", create_time=" + create_time +
				", creator=" + creator +
				", update_time=" + update_time +
				", mender=" + mender +
				", uuid='" + uuid + '\'' +
				'}';
	}
}
