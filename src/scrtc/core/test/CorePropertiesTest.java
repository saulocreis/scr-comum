package scrtc.core.test;

import java.io.PrintStream;

import scrtc.core.CoreProperties;

public class CorePropertiesTest {
	
	static public final PrintStream ps = System.out;

	static public void main(String[] args) {
		
		ps.println(CoreProperties.get("xlsxSheet"));
		
	}

}
