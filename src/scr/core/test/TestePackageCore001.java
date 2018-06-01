package scr.core.test;

import java.io.PrintStream;
import java.util.Enumeration;
import java.util.Properties;

public class TestePackageCore001 {
	
	static public final PrintStream ps = System.out;

	static public void main(String[] args) {
		
		Properties props = System.getProperties();
		
		Enumeration<Object> keys = props.keys();
		while(keys.hasMoreElements()) {
			Object key = keys.nextElement();
			ps.print(key);
			Object value = props.get(key);
			ps.print(" -> ");
			ps.println(value);
		}		
	}

}
