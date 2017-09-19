package org.klfmedia.servie;

import java.io.FileWriter;
import java.util.ArrayList;
import java.util.List;

import org.json.simple.JSONObject;
import org.klfmedia.dto.WineDetails;

public class KlfService {

	public String search(WineDetails wd, int productNumber)
	{
		
		return wd.getProductName();
	}
	
	
	
	public void getListFifty(List<WineDetails> list)
	{  
	  
		list.forEach((temp) -> {
				System.out.println(temp.getDetails());
			});
		   
	  }
	
	public String searchSaveJson(WineDetails wd, int productNumber)
	{
		
		JSONObject obj = new JSONObject();
		obj.put("productId",wd.getProductID());
		obj.put("productName",wd.getProductName());
		obj.put("price",wd.getPrice());
		
		
		 try (FileWriter file = new FileWriter("f:\\test.json")) {

	            file.write(obj.toJSONString());
	            file.flush();

	        } catch (Exception e) {
	            e.printStackTrace();
	        }
		 System.out.println("Object is saved to JSON");
		return wd.getDetails();
	}

	
	
	
	
	
	
}
