package org.tnsindia.regexdemo;

import java.util.regex.Matcher;
import java.util.regex.Pattern;
//Demo on matcher() method of Matcher class
public class RegExMatcherClassDemo {

	public static void main(String[] args) {
		Pattern p=Pattern.compile("Vrushali");
		Matcher m=p.matcher("My name is Vrushali");
		while(m.find())
		{
			System.out.println("Pattern found at: "+m.start()+" "+m.end());
		}

	}

}
