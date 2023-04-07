package com.rai.cache;

public class CacheMain {
	public static void main(String[] args) {
		Cache cache = new Cache(2);
		cache.put("Key1", "value1");
		cache.put("Key2", "value2");
		System.out.println(cache.get("key1"));
		cache.put("Key3", "value3");
		System.out.println(cache.get("key2"));
		cache.clear();
	}

}
