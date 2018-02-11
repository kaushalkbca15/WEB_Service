package com.json.util;

import java.io.IOException;
import java.util.List;

import org.codehaus.jackson.map.ObjectMapper;

import com.json.bo.Book;

public class JSONUtils {

	private static final ObjectMapper MAPPER=new ObjectMapper();
	public static String convertJavaToJsno(Object object){
		String json=null;
		//MAPPER.equals(obj))
		try {
			json=MAPPER.writeValueAsString(object);
		} catch (IOException e) {
			e.printStackTrace();
			System.out.println(e.getMessage());
		}
		return json;
	}
	
	
	
	public static String convertJavaToJsnoList(List<?> list){
		String json=null;
		try {
			json=MAPPER.writeValueAsString(list);
		} catch (IOException e) {
			e.printStackTrace();
			System.out.println(e.getMessage());
		}
		return json;
	}
}
