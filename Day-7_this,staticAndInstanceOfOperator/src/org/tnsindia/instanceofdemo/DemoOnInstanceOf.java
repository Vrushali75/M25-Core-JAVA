package org.tnsindia.instanceofdemo;
//Demo on instance of operator
class E
{
	String str=null;
	//float percentage=89.95f;
}
public class DemoOnInstanceOf {

	public static void main(String[] args) {
		E e=new E();
		//to check whether it is an instance of the given class or not
		System.out.println(e instanceof E);

	}

}
