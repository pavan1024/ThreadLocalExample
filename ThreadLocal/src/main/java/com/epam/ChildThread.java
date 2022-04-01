package com.epam;

import lombok.extern.slf4j.Slf4j;

@Slf4j
public class ChildThread extends Thread {

	public void run() {
		log.info("Before Assigning Thread Local Value : "+ParentThread.tl.get());
		ParentThread.tl.set("CLV");
		log.info("Parent Thread Local Value is : "+ParentThread.tl.get());
	}
	
}
