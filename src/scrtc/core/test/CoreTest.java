package scrtc.core.test;

import java.io.PrintStream;
import java.util.Enumeration;
import java.util.Properties;


public class CoreTest {
	
	static public final PrintStream ps = System.out;

	static public void main(String[] args) {
		
		Properties props = System.getProperties();
		Enumeration<Object> keys = props.keys();
		int numKeys = 0;
		while(keys.hasMoreElements()) {
			numKeys++;
			Object key = keys.nextElement();
			ps.print(key);
			Object value = props.get(key);
			ps.print(" -> ");
			ps.println(value);
		}
		ps.println();
		ps.println("Number of properties: " + numKeys);
		
	}

}
