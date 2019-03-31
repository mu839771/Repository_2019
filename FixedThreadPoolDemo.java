package com.executor;

import java.util.Arrays;
import java.util.List;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class FixedThreadPoolDemo {
public static void main(String[] args) {
	
	Runnable jobOne = ()->
	{
		for(int i=0;i<10;i++)
		{
		
				System.out.println(Thread.currentThread()+" : "+i);
			
			
		}
	};
	
	Runnable jobTwo = ()->
	{

		List<String> list = Arrays.asList("Mukesh","Kumar","Anil");
		
		for(String s:list)
		{
			System.out.println(Thread.currentThread()+" : "+s);
		}
	};
	
	ExecutorService service = Executors.newFixedThreadPool(2);
	service.submit(jobOne);
	service.submit(jobTwo);
	service.shutdown();
}
}
