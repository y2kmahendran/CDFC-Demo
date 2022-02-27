package com.cdfc.dao;
import com.google.gson.Gson;

public class ApplicationUtils {
	public static String createJsonFormat(Object jsonObject) {
		String jsonPstr="";
		Gson gson=new Gson();
		jsonPstr=gson.toJson(jsonObject);
		return jsonPstr;
		
	}

}
