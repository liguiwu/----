package com.fiveqian.singleton;

/**
 * 单例设计模式--饿汉式
 * @author 小伍
 *
 */
public class Singleton {
	

	private static Singleton singleton=new Singleton();
	
	private Singleton() {
		
	}
	

	public static Singleton getInstence() {
		return singleton;
	}
	
	

	
}
