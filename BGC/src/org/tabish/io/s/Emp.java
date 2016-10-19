package org.tabish.io.s;


import java.io.*;

public class Emp extends Base implements Serializable
{
 
//x  Base b1=new Base();
 transient int a;
 static int b;
 String name;
 int age;
 
  Emp(String name,int age,int a,int b,int z)
  {
      this.name=name;
	this.age=age;	
	this.a=a;
	this.b=b;
	this.z=z;
  } 
}