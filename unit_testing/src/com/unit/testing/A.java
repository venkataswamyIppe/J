package com.unit.testing;

public class A {


	B b=new B();
	C c=new C();
	public int sumResultOfBandC(int numberOne,int numberTwo){
		
		return b.returnFirstvalue(numberOne)+c.returnSecondvalue(numberTwo);
	
	}
}
