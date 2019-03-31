package com.executor;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class CachedThreadPoolDemo {
	public static void main(String[] args) {

		Runnable jobOne = () -> {
			for (int i = 0; i < 10; i++) {

				System.out.println(Thread.currentThread() + " : " + i);

			}
		};

		Runnable jobTwo = () -> {

			List<String> list = Arrays.asList("Mukesh", "Kumar", "Anil");

			for (String s : list) {
				System.out.println(Thread.currentThread() + " : " + s);
			}
		};

		Runnable jobThree = () -> {

			Map<Integer, String> map = new HashMap<Integer, String>();
			map.put(1, "Mukesh");
			map.put(2, "Kumar");
			map.put(3, "Palvit");

			Iterator it = map.entrySet().iterator();
			while (it.hasNext()) {
				Map.Entry<Integer, String> entry = (Entry<Integer, String>) it.next();
				System.out.println(Thread.currentThread()+ " : "+entry.getKey() + ":" + entry.getValue());
			}
			

		};
		ExecutorService service = Executors.newCachedThreadPool();
		service.submit(jobOne);
		service.submit(jobTwo);
		service.submit(jobThree);
		service.shutdown();
	}
}
