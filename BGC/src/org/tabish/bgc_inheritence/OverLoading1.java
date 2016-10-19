package org.tabish.bgc_inheritence;

public class OverLoading1 {

	public static void main(String[] args) {
		new OverLoading1().abc(2,4f);   //ambiguity error
   short a=2;
	}
	
	public static void abc(int a,float b){
		
		System.out.println("int ab");
	}

    public static void abc(float b,int a){
		System.out.println("int ba");
	}
  
}
