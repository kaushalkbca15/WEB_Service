package com.nt.util;

import java.io.IOException;
import java.util.List;

import org.codehaus.jackson.map.ObjectMapper;

public class JsonUtil {

	private static final ObjectMapper MAPPER=new ObjectMapper();
	
	public static String convertJavatoJson(Object object){
		String json=null;
			try {
				json=MAPPER.writeValueAsString(object);
			} catch (IOException e) {
				e.printStackTrace();
			}
		return json;
	}
	public static String convertJavatoJsonList(List<?> list){
		String json=null;
			try {
				json=MAPPER.writeValueAsString(list);
			} catch (IOException e) {
				e.printStackTrace();
			}
		return json;
	}
}
