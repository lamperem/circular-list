package com.glopez.util;

/**
 * Class to define a Circular List
 * @author glopez
 *
 */
public class CircularList {

	private Node baseNode;
	private Node lastNode;
	private int size;
	
	public CircularList() {
		this.baseNode = null;
		this.lastNode = null;
	}
	
	/**
	 * Verify is List is empty
	 * @return true/false
	 */
	public boolean isEmpty() {
		return baseNode == null;
	}
	
	/**
	 * Get size List
	 * @return size
	 */
	public int getSizeList() {
		return size;
	}
	
	/**
	 * Search value in list
	 * @param value
	 * @return true if value exist
	 */
	public boolean searchValue(int value) {
		Node aux = baseNode;
		boolean valueFound = false;		
		
		do {
			if(value == aux.getValue()) { // compare values
				valueFound = true;
			}else {				
				aux = aux.getNextNode(); // Move to next node
			}
		}while(aux != baseNode && valueFound != true);		
		
		return valueFound;
	}
	
	/**
	 * Insert new node in specific position
	 * @param position
	 * @param value
	 */
	public void insertByReference(int value, int newValue) {
		
		Node newNode = new Node(); // Define new Node
		newNode.setValue(newValue); // Set value in new Node
		
		if( !isEmpty()) { // verify if list is empty
			
			if( searchValue(value) ) { // verify is value exist in list
				Node aux = baseNode;
				
				while( aux.getValue() != value ) { // search reference node
					aux = aux.getNextNode();
				}
			}
		}
		
	}
}
