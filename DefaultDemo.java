package com.javaeight.defaultexample;
/*Advantage of using default method it is not compulsory to override in implmentation  classes*/
interface Myadvertisement
{
	default void getAdvertisement()
	{
		System.out.println("getAdvertisement");
	}
	void test();
}

class MyadvertisementImpl implements Myadvertisement
{

	@Override
	public void test() {
		System.out.println("MyadvertisementImpl ::test");
		
	}
	
	@Override
	public void getAdvertisement()
	{
		System.out.println("MyadvertisementImpl ::getAdvertisement");
	}
	
	
}


class MyNewsadvertisementImpl implements Myadvertisement
{
	@Override
	public void test() {
		System.out.println("MyNewsadvertisementImpl ::test");		
	}
}

public class DefaultDemo  {
	public static void main(String[] args){
		new MyadvertisementImpl().test();
		new MyadvertisementImpl().getAdvertisement();
		new MyNewsadvertisementImpl().getAdvertisement();
		new MyadvertisementImpl().getAdvertisement();
		
	}
}
