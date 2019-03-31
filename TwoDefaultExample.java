package com.javaeight.defaultexample;

interface MyRadiodvertisement
{
	default void getAdvertisement()
	{
		System.out.println("MyRadiodvertisement");
	}
	
}

interface MyTVadvertisement
{
	default void getAdvertisement()
	{
		System.out.println("MyTVadvertisement");
	}
	
}

class AdvertisementImpl implements MyTVadvertisement,MyRadiodvertisement

{

	@Override
	public void getAdvertisement() {
		// TODO Auto-generated method stub
		MyTVadvertisement.super.getAdvertisement(); // Using the super keyword we can call the default implementation of method . So we will not get any ambiguity issue.
	}
	
}

public class TwoDefaultExample {
public static void main(String[] args) {
	
	new AdvertisementImpl().getAdvertisement();
}
}
