package com.test.java;

public class ThreadSample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new Thread(() -> System.out.println("start thread")).start();

	}

}
