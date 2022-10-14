package com.tree;

import java.util.ArrayList;
import java.util.List;

public class TreeNode {
    String data;
    List<TreeNode> children;

    public TreeNode(String data) {
        this.data = data;
        children=new ArrayList<>();
    }

    public void addChild(TreeNode treeNode){
        children.add(treeNode);
    }

    public String print(int level){
        String ret="";
        ret=" "+data+"\n";
        for(TreeNode treeNode :children){
            ret += treeNode.print(level+1);
        }
        return ret;
    }
}
