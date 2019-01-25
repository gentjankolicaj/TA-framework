package com.ta.framework.result;
/**
 * 
 * @author gentjan kolicaj
 *
 */
public abstract class MyResult<K,V> {
	
	private K key;
	private V value;
	
	public MyResult() {
		super();
		// TODO Auto-generated constructor stub
	}

	public MyResult(K key, V value) {
		super();
		this.key = key;
		this.value = value;
	}

	public K getKey() {
		return key;
	}

	public void setKey(K key) {
		this.key = key;
	}

	public V getValue() {
		return value;
	}

	public void setValue(V value) {
		this.value = value;
	}
	
	
	
	

}
