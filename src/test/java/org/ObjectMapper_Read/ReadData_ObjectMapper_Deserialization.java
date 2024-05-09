package org.ObjectMapper_Read;

import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;

import com.fasterxml.jackson.core.exc.StreamReadException;
import com.fasterxml.jackson.databind.DatabindException;
import com.fasterxml.jackson.databind.ObjectMapper;

public class ReadData_ObjectMapper_Deserialization {

	public static void main(String[] args) throws StreamReadException, DatabindException, IOException {

		FileReader fd = new FileReader(
				new File(System.getProperty("user.dir")+"\\src\\test\\resources\\Sample.json"));
	
		ObjectMapper mapper = new ObjectMapper();

		RootPOJO readValue = mapper.readValue(fd, RootPOJO.class);
		System.out.println(readValue.getId());
		System.out.println(readValue.getType());
		System.out.println(readValue.getName());
		System.out.println(readValue.getPpu());
		System.out.println();

		Batters batters = readValue.getBatters();
		ArrayList<Batter> batter = batters.getBatter();
		for (int i = 0; i < batter.size(); i++) {
			System.out.print(batter.get(i).getId().concat("\t"));
			System.out.println(batter.get(i).getType());
		}
		System.out.println();

		ArrayList<Topping> topping = readValue.getTopping();
		for (int i = 0; i < topping.size(); i++) {
			System.out.print(topping.get(i).getId().concat("\t"));
			System.out.println(topping.get(i).getType());
		}

	}

}
