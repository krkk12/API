package org.ObjectMapper_Write;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;

import com.fasterxml.jackson.core.exc.StreamWriteException;
import com.fasterxml.jackson.databind.DatabindException;
import com.fasterxml.jackson.databind.ObjectMapper;


public class Serialization {

	
	public static void main(String[] args) throws StreamWriteException, DatabindException, IOException {
		
		Topping topping6 = new Topping("Olympics Gold", "Yes");
		Topping topping1 = new Topping("Copa America", "Yes");
		Topping topping2 = new Topping("La Finalisma", "Yes");
		Topping topping3 = new Topping("World Cup", "Yes");
		Topping topping4 = new Topping("Quitter", "No");
		Topping topping5 = new Topping("Legend?", "Definitely Yessssssssssss");
		
		
		ArrayList<Topping> topping = new ArrayList<Topping>();
		topping.add(topping3);
		topping.add(topping6);
		topping.add(topping1);
		topping.add(topping2);
		topping.add(topping4);
		topping.add(topping5);
		
		Batter batter = new Batter("LM10", "Dribbler");
		Batter batter1 = new Batter("LM10", "False Nine");
		Batter batter2 = new Batter("LM10", "PlayMaker");
		Batter batter3 = new Batter("LM10", "GOAT");
		
		ArrayList<Batter> b = new ArrayList<Batter>();
		b.add(batter);
		b.add(batter1);
		b.add(batter2);
		b.add(batter3);
		
		Batters batters = new Batters(b);
		
		File f = new File(System.getProperty("user.dir")+"\\src\\test\\resources\\WrittenFile.json");
		RootPOJO rootPojo = new RootPOJO("LM10", "Football", "Lionel Andres Messi",batters, topping);
		ObjectMapper mapper = new ObjectMapper();
		mapper.writeValue(f, rootPojo);
		
		
		
		
		
		
		
		
		
		
	}
	

	
}
