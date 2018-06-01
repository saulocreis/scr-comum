package scr.core.test;

import java.io.PrintStream;
import scr.core.CoreProperties;

public class TestePackageCore2 {
	
	static public final PrintStream ps = System.out;

	static public void main(String[] args) {
		
		ps.println(CoreProperties.get("xlsxFile"));
		
	}

}
