package com.rai.cache;

import java.util.HashMap;
import java.util.Map;

public class Cache {
	
	private Map<String, Object> cacheMap;
	private int capacity;
	
	public Cache(int capacity) {
		this.cacheMap = new HashMap<>();
		this.capacity = capacity;
	}
	
	public Object get(String key) {
		Object value = cacheMap.get(key);
		if(value == null) {
			System.out.println("Cache miss for key: " + key);
			return null;
		}
		System.out.println("Cache hit for key: " + key);
		return value;
	}

	public void put(String key, Object value) {
		if(cacheMap.size() >= capacity) {
			System.out.println("Cache is full. Removing the oldest entry.");
			String oldestKey = cacheMap.keySet().iterator().next();
			cacheMap.remove(oldestKey);
		}
		cacheMap.put(key, value);
		System.out.println("Added value to cache for key: " + key);
	}
	
	public int size() {
		return cacheMap.size();
	}
	
	public void clear() {
		cacheMap.clear();
		System.out.println("Cache has been cleared.");
	}
}
