package org.JSONParser_Read;

import java.io.File;
import java.io.FileReader;
import java.io.IOException;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;

public class ReadData_JSONParser {

	public static void main(String[] args) throws IOException, ParseException {
		
		
		FileReader fd = new FileReader(new File("D:\\Eclipse 2023 workspace\\ZZZAPI-1\\src\\test\\resources\\Sample.json"));
		
		JSONParser parser = new JSONParser();
		
		Object parse = parser.parse(fd);
		
		//TypeCast Object to JSONObject to read json file
		
		JSONObject jsonObject = (JSONObject)parse;
		
		System.out.println(jsonObject.get("id"));
		System.out.println(jsonObject.get("type"));
		System.out.println(jsonObject.get("name"));
		System.out.println(jsonObject.get("ppu"));
		System.out.println(jsonObject.get("batters"));
		System.out.println(jsonObject.get("topping"));
		
		System.out.println();

		
		
		Object object = jsonObject.get("batters");
		
		JSONObject jsonObject2 = (JSONObject) object;
		
		Object object2 = jsonObject2.get("batter");
		
		JSONArray array = (JSONArray) object2;
		
		for (int i = 0; i < array.size(); i++) {
			
			Object object3 = array.get(i);
			
			JSONObject jsonObject3 = (JSONObject) object3;
			
			System.out.print(jsonObject3.get("id").toString().concat("\t")); 
			System.out.println(jsonObject3.get("type")); 
			
		}
		
		
		Object object3 = jsonObject.get("topping");
		
		JSONArray array2 = (JSONArray) object3;
		
		System.out.println();
		for (int i = 0; i < array2.size(); i++) {
			
			Object object4 = array2.get(i);
			
			JSONObject jsonObject4 = (JSONObject) object4;
			

			
			System.out.print(jsonObject4.get("id").toString().concat("\t"));

			System.out.println(jsonObject4.get("type"));

			
			
		}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	
	}

}
