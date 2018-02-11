package com.nt.util;

import java.io.IOException;

import org.codehaus.jackson.map.ObjectMapper;

public class ConvertJSON {
	private  static final ObjectMapper mapper=new ObjectMapper();
	public static String converJavaToJSON(Object object){
		String jsonString=null;
		try {
			jsonString=mapper.writeValueAsString(object);
		} catch (IOException e) {
			System.out.println("JSON Convert problem");
			e.printStackTrace();
		}
		return jsonString;
	}
}
