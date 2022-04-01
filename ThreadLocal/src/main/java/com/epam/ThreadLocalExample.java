package com.epam;

class ThreadLocalExample {

	public static void main(String[] args) {		
		ParentThread pt = new ParentThread();
		pt.start();
	}
}
