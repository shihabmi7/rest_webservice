package com.rest.webservice;

import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;	
import javax.ws.rs.core.MediaType;
import org.json.JSONObject;

/**
 * 
 * @author shohrab.uddin
 * URL to access the two methods of this class will be
 * http://localhost:8080/rest_webservice/classpath/postmethodpath
 * http://localhost:8080/rest_webservice/classpath/getmethodpath
 */

@Path("/classpath") //path to access this class
public class RestWebService {
	JSONObject jObj = new JSONObject();

	@POST //This is a post method
	@Path("/postmethodpath")//path to access this method
	@Produces(MediaType.APPLICATION_JSON) //this method produces/returns JSON format data
	@Consumes(MediaType.APPLICATION_JSON) //this method consumes/receives JSON format data
	public String postMethod(String data){ 
		String retrunJsonString = Utility.constuctJsonPostData(data);
		
		return retrunJsonString;
	}
	
	
	@GET //this is a get method
	@Path("/getmethodpath") //path to access the method
	@Produces(MediaType.APPLICATION_JSON)
	public String getMethod(){	
		System.out.println("hello");
    	return Utility.constuctJsonGetData();
	}
}
