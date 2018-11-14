package com.glopez.util;

/**
 * Class to define NODE structure
 * @author glopez
 *
 */
public class Node {
	
	private int nodeValue;
	private Node linkNextNode;
	
	public Node() {
		this.nodeValue = 0;
		this.linkNextNode = null;		
	}
	
	// Set and Get value
	public void setValue(int nodeValue) {
		this.nodeValue = nodeValue;
	}
	
	public int getValue(){
		return nodeValue;
	}
	
	// Set and Get reference to next Node
	public void setFollow(Node node) {
		this.linkNextNode = node;
	}
	
	public Node getNextNode() {
		return linkNextNode;
	}

}
