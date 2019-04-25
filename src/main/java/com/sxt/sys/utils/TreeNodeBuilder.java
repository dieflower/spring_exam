package com.sxt.sys.utils;

import java.util.ArrayList;
import java.util.List;

/**
 * 把简单的json集合转成标准的json集合
 * @author LJH
 *
 */
public class TreeNodeBuilder {

	/**
	 * 把简单的json集合转成标准的json集合
	 * @param treeNodes
	 * @param topId  根据节点的父ID
	 * @return
	 */
	public static List<TreeNode> build(List<TreeNode> treeNodes, Integer topId) {
		List<TreeNode> nodes=new ArrayList<>();
		for (TreeNode n1 : treeNodes) {
			if(n1.getPid()==topId){
				nodes.add(n1);
			}
			for (TreeNode n2 : treeNodes) {
				if(n1.getId()==n2.getPid()){
					n1.getChildren().add(n2);
				}
			}
		}
		return nodes;
	}

}
