package com.galaxe.utilities;

import org.apache.commons.lang3.RandomStringUtils;


public class RestUtils {
 public static String empName() {
	 String generatedString=RandomStringUtils.randomAlphabetic(1);
	 return ("Suresh"+generatedString);
  }
 
 
 
public static String empJob() {
	String generatedString=RandomStringUtils.randomAlphabetic(1);
	return ("Teacher"+generatedString);
}


//public static String empAge() {
//	String generatedString=RandomStringUtils.randomNumeric(2);
//	return generatedString;
//}
}
