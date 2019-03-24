package com.javaeight.lamdaexpresiion;

interface intef
{
	void test();
}

interface squareInter
{
	int getSquare(int i);
}

public class LamdaExpressionDemo {
	public static void main(String[] args) {
		
		intef i = ()->System.out.println("test");
		i.test();
		
		squareInter sq = (int j) -> { return j*j;};
		 System.out.println(sq.getSquare(4));
		
		squareInter sqr = j -> j*j;
		 System.out.println(sqr.getSquare(5));
			
	}

}
