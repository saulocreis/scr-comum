package scrtc.core;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;
import com.google.common.base.Optional;
import com.google.common.base.Preconditions;

public class CoreProperties {
	static public final String DEFAULT_WORKSPACE = "scrtc";
	static public final String DEFAULT_FILENAME = "propriedades.properties";
	
	static private Properties properties = new Properties();
	static private boolean initialized = false;
	
	static public String get(String property) {
		property = Preconditions.checkNotNull(property, "The parameter is null.");
		if(!initialized) {
			initialize();
			Preconditions.checkState(initialized, "CoreProperties was not initialized.");
		}
		Optional<String> propertyValue = Optional.fromNullable(properties.getProperty(DEFAULT_WORKSPACE.concat(".").concat(property)));
		return propertyValue.or("");
	}
	
	static private void initialize() {
		if(initialized) return;
		try {
			
			FileInputStream fis = new FileInputStream(DEFAULT_FILENAME);
			properties.load(fis);
			fis.close();
		}
		catch (FileNotFoundException e) {
			initialized = false;
			e.printStackTrace();
		}
		catch (IOException e) {
			initialized = false;
			e.printStackTrace();
		}
		initialized = true;
	}
}
