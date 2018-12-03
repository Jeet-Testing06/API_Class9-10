package org.testing.utilities;

import java.io.IOException;

import org.testng.Assert;

import com.jayway.restassured.response.Response;

public class ResponseParsing {
	
	public static void Response_Content_Compare(Response res, PropertiesRead pr, String ExpectedValue, String key) throws IOException
	{
		
		String ActualValue = res.jsonPath().get(pr.ReadProperty(key));
		Assert.assertEquals(ActualValue, ExpectedValue);
		System.out.println("Actual and Expected value matches");
		
	}

}
