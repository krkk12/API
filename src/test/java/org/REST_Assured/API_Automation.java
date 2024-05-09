package org.REST_Assured;

import org.json.simple.JSONObject;

import io.restassured.RestAssured;
import io.restassured.http.Method;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;

public class API_Automation {

	public static void main(String[] args) {

		/*
		 * GET-QueryParameter
		 * 
		 * //creating req body RestAssured.baseURI="https://reqres.in/";
		 * RequestSpecification requestSpecification = RestAssured.given();
		 * 
		 * //attach query parameter requestSpecification.queryParam("page", "2");
		 * 
		 * //createresponse body Response response =
		 * requestSpecification.request(Method.GET, "/api/users/");
		 * 
		 * int statusCode = response.statusCode(); System.out.println(statusCode);
		 * 
		 * String asPrettyString = response.getBody().asPrettyString();
		 * System.out.println(asPrettyString);
		 * 
		 */

		/*
		 * GET-PathParameter
		 * 
		 * RestAssured.baseURI="https://reqres.in/"; RequestSpecification
		 * requestSpecification = RestAssured.given();
		 * 
		 * requestSpecification.pathParam("id", "2");
		 * 
		 * Response response =
		 * requestSpecification.request(Method.GET,"/api/users/{id}");
		 * 
		 * System.out.println(response.statusCode());
		 * System.out.println(response.getBody().asPrettyString());
		 * 
		 */

		
		/*			POST
		 * 
		 * RestAssured.baseURI="https://reqres.in/"; RequestSpecification
		 * requestSpecification = RestAssured.given();
		 * 
		 * create contents to POST and add it to reqspec 
		 * JSONObject jsonObject = new JSONObject(); 
		 * jsonObject.put("name", "AndresDurai"); 
		 * jsonObject.put("job","PA");
		 *  requestSpecification.body(jsonObject.toJSONString());
		 * 
		 * Response response = requestSpecification.request(Method.POST,"/api/users/");
		 * 
		 * System.out.println(response.statusCode());
		 * System.out.println(response.getBody().asPrettyString());
		 * 
		 * 
		 */
		
		/*			PUT
		 * 
		 * RestAssured.baseURI="https://reqres.in/"; 
		 * RequestSpecification requestSpecification = RestAssured.given();
		 * 
		 * //Attach PathParameter
		 * requestSpecification.pathParam("job", "QA");
		 * 
		 * Response response = requestSpecification.request(Method.PUT,"/api/users/{job}");
		 * 
		 * System.out.println(response.statusCode());
		 * System.out.println(response.getBody().asPrettyString());
		 * 
		 */
		
		/*		DELETE
		 * 
		 * RestAssured.baseURI="https://reqres.in/"; 
		 * RequestSpecification requestSpecification = RestAssured.given();
		 * 
		 * requestSpecification.pathParam("id","2");
		 * 
		 * Response response = requestSpecification.request(Method.DELETE,"/api/users/{id}");
		 * 
		 * System.out.println(response.statusCode());
		 * System.out.println(response.getBody().asPrettyString());
		 * 
		 * 
		 */
		
		
		
		
		
		
		
		
		
		
		
		

	}

}
