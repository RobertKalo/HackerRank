package com.hackerrank.main;

public class Singleton {

	private Singleton() {
	}

	private static final Singleton	instance	= new Singleton();

	public String					str;

	public static Singleton getSingleInstance() {
		return instance;
	}

}
