package com.sxt.sys.utils;

import java.util.ArrayList;
import java.util.List;

import com.fasterxml.jackson.annotation.JsonProperty;

public class TreeNode {

	private Integer id;
	@JsonProperty("pId")
	private Integer pid;
	private String title;
	private String icon;
	private String href;
	private Boolean spread;
	private List<TreeNode> children=new ArrayList<>();
	
	
	private String name;
	
	private Boolean isParent;
	
	private Boolean open;
	//zTreechecked属性
	private Boolean checked;
	
	
	public TreeNode(Integer id, Integer pid, String name, Boolean isParent, Boolean open, Boolean checked) {
		super();
		this.id = id;
		this.pid = pid;
		this.name = name;
		this.isParent = isParent;
		this.open = open;
		this.checked = checked;
	}

	public Boolean getChecked() {
		return checked;
	}

	public void setChecked(Boolean checked) {
		this.checked = checked;
	}

	public TreeNode(Integer id, Integer pid, String name, Boolean isParent, Boolean open) {
		super();
		this.id = id;
		this.pid = pid;
		this.name = name;
		this.isParent = isParent;
		this.open = open;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Boolean getIsParent() {
		return isParent;
	}

	public void setIsParent(Boolean isParent) {
		this.isParent = isParent;
	}

	public Boolean getOpen() {
		return open;
	}

	public void setOpen(Boolean open) {
		this.open = open;
	}

	public TreeNode() {
		// TODO Auto-generated constructor stub
	}
	
	/**
	 * 主页左边导航树的json对象的构造方法s
	 * @param id
	 * @param pid
	 * @param title
	 * @param icon
	 * @param href
	 * @param spread
	 */
	public TreeNode(Integer id, Integer pid, String title, String icon, String href, Boolean spread) {
		super();
		this.id = id;
		this.pid = pid;
		this.title = title;
		this.icon = icon;
		this.href = href;
		this.spread = spread;
	}




	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public Integer getPid() {
		return pid;
	}
	public void setPid(Integer pid) {
		this.pid = pid;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getIcon() {
		return icon;
	}
	public void setIcon(String icon) {
		this.icon = icon;
	}
	public String getHref() {
		return href;
	}
	public void setHref(String href) {
		this.href = href;
	}
	public Boolean getSpread() {
		return spread;
	}
	public void setSpread(Boolean spread) {
		this.spread = spread;
	}
	public List<TreeNode> getChildren() {
		return children;
	}
	public void setChildren(List<TreeNode> children) {
		this.children = children;
	}

	
	
	
	
}
