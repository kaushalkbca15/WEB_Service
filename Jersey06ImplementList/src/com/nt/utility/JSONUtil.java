package com.nt.utility;

import java.io.IOException;
import java.util.List;

import org.codehaus.jackson.map.ObjectMapper;

public class JSONUtil {

	private static final ObjectMapper MAPPER=new ObjectMapper();
	public static String convertJavaToJSON(List<?> list){
		String json=null;
		try {
			json=MAPPER.writeValueAsString(list);
			System.out.println(json);
		} catch (IOException e) {
			e.printStackTrace();
		}
		return json;
	}
}
