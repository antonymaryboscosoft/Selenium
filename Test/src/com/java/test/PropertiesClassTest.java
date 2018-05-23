/**
 * 
 */
package com.java.test;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

/**
 * @author unit2a
 *
 */
public class PropertiesClassTest {

	/**
	 * @param args
	 * @throws IOException 
	 */
	public static void main(String[] args) throws IOException {
		Properties	prop = new Properties();
		File file = new File("E:/anto/eclpslunapom/FreeCRMTest/src/main/java/com/crm/qa/config/config.properties");
		FileInputStream ip = new FileInputStream(file);
		
//		FileInputStream ip = new FileInputStream(System.getProperty("E:/anto/eclpslunapom/FreeCRMTest/src/main/java/com/crm/qa/config/config.properties"));

		prop.load(ip);
		System.out.println(prop.getProperty("browser"));
	}

}
