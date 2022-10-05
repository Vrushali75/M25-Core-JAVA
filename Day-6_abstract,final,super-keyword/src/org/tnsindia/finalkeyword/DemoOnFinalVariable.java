package org.tnsindia.finalkeyword;
//Demo on final keyword with variable
class FinalVariable
{
	//If any variable is declared as final we can't change the value of that variable
	public final float salary=62000f;
	/*void display()
	{
		salary=65000f;
	}
	*/
	
	
}
public class DemoOnFinalVariable {

	public static void main(String[] args) {
		FinalVariable f1=new FinalVariable();
		System.out.println(f1.salary);

	}

}
