package com.ta.framework.data.test;

/**
 * 
 * @author gentjan kolicaj
 *
 */
public abstract class TestData<K,V>{

	protected K key;
	protected V value;
	
	public TestData() {
		super();
		// TODO Auto-generated constructor stub
	}

	public TestData(K key, V value) {
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
