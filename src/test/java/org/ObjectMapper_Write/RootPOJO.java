package org.ObjectMapper_Write;

import java.util.ArrayList;

public class RootPOJO {

	private String id;

	private String type;

	private String name;

	private Batters batters;

	private ArrayList<Topping> topping;

	public RootPOJO(String id, String type, String name, Batters batters, ArrayList<Topping> topping) {
		super();
		this.id = id;
		this.type = type;
		this.name = name;
		this.batters = batters;
		this.topping = topping;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}



	public Batters getBatters() {
		return batters;
	}

	public void setBatters(Batters batters) {
		this.batters = batters;
	}

	public ArrayList<Topping> getTopping() {
		return topping;
	}

	public void setTopping(ArrayList<Topping> topping) {
		this.topping = topping;
	}


	
	
	
	
	
	
}
