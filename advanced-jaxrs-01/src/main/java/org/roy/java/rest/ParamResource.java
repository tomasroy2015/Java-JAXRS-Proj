package org.roy.java.rest;

import javax.inject.Singleton;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.QueryParam;
import javax.ws.rs.core.MediaType;

@Path("{pathParam}/paramTest")
public class ParamResource {
	@PathParam("pathParam") private String pathParamEample;
	@QueryParam("query") private String queryParamExample;
	
	@GET
	@Produces(MediaType.TEXT_PLAIN)
	public String testMethod(){
		return "It works path param used "+pathParamEample+" and query Param used "+queryParamExample;
	}

}
