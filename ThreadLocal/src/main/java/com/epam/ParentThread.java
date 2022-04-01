package com.epam;

import lombok.extern.slf4j.Slf4j;

@Slf4j
public class ParentThread extends Thread {

	static ThreadLocal<String> tl = new ThreadLocal<>() {
		@Override
		protected String initialValue() {
			return "intialThreadValue";

		}
	};

	@Override
	public void run() {
		tl.set("PLV");
		log.info("Parent Thread Local Value is : " + tl.get());
		ChildThread ct = new ChildThread();
		ct.start();
	}
}
