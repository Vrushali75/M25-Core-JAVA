package org.tnsindia.statickeyword;
class B{
	static int a=56;
}
public class DemoOnStaticVaribale {
	
	/*If we declare any variable outside the main function and we print that variable without static keyword
	then we will get the error...for that purpose we have to use static keyword
	*/
	
	public static void main(String[] args) {
		System.out.println(B.a);
		
	}

}
