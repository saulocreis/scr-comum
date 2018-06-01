package scr.core;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;
import com.google.common.base.Optional;
import com.google.common.base.Preconditions;

public class CoreProperties {
	static private final String DEFAULT_WORKSPACE = "injoy.";
	static private final String DEFAULT_FILENAME = "propriedades.properties";
	
	static private Properties properties = new Properties();
	static private boolean initialized = false;
	
	static public boolean isSet(String property) {
		return get(property) != null;
	}
	
	static public String get(String property) {
		property = Preconditions.checkNotNull(property, "O parâmetro deste método está vazio.");
		if(!initialized) {
			initialize();
			Preconditions.checkState(initialized, "CoreProperties não foi inicializada.");
		}
		Optional<String> propertyValue = Optional.fromNullable(properties.getProperty(DEFAULT_WORKSPACE.concat(property)));
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
			properties = null;
			initialized = false;
			e.printStackTrace();
		}
		catch (IOException e) {
			properties = null;
			initialized = false;
			e.printStackTrace();
		}
		initialized = true;
	}
}
