package org.practice;

import java.io.File;
import java.io.FileReader;
import java.io.IOException;

import com.fasterxml.jackson.core.exc.StreamReadException;
import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.DatabindException;
import com.fasterxml.jackson.databind.ObjectMapper;

public class Execution {

	public static void main(String[] args) throws StreamReadException, DatabindException, IOException   {
		

		FileReader f = new FileReader(new File("D:\\Eclipse 2023 workspace\\API-1\\src\\test\\resources\\Sample1.json"));
		
		ObjectMapper mapper = new ObjectMapper();
		
		RootPOJO readValue = mapper.readValue(f,RootPOJO.class);
		
		
		
		String id = readValue.getId();
		System.out.println(id);
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}
	
}
