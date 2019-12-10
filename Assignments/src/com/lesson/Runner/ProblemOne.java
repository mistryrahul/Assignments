package com.lesson.Runner;

import com.squareup.okhttp.Response;
import com.squareup.okhttp.ResponseBody;

import java.util.ArrayList;

import org.bson.Document;

import com.lesson.driver.MongoConnection;
import com.mongodb.BasicDBObject;
import com.mongodb.client.FindIterable;
import com.mongodb.client.MongoCollection;
import com.mongodb.client.MongoDatabase;
import com.mongodb.operation.OrderBy;
import com.squareup.okhttp.OkHttpClient;
import com.squareup.okhttp.Request;

public class ProblemOne {

	public static void main(String[] args) {

         
		Request request = null;
		Response response = null;
		int resp_code=0;
		String responce_json=null;		
		OkHttpClient client = new OkHttpClient();
        
		
//		Storing Urls in ArrayList
		ArrayList<String> url_list = new ArrayList<String>();
		
		url_list.add("http://api.openweathermap.org/data/2.5/weather?q=London,uk&APPID=ed3c5a41ce\r\n" + 
				"8bfed69d296d8ac5fcb2a0");
		url_list.add("http://api.openweathermap.org/data/2.5/weather?q=Kudepsta,ru&APPID=ed3c5a41c\r\n" + 
				"e8bfed69d296d8ac5fcb2a0");
		url_list.add("http://api.openweathermap.org/data/2.5/weather?q=Williston,za&APPID=ed3c5a41ce\r\n" + 
				"8bfed69d296d8ac5fcb2a0");
		url_list.add("http://api.openweathermap.org/data/2.5/weather?q=Koffiefontein,za&APPID=ed3c5a\r\n" + 
				"41ce8bfed69d296d8ac5fcb2a0");
		url_list.add("http://api.openweathermap.org/data/2.5/weather?q=Xiaoshi,cn&APPID=ed3c5a41ce\r\n" + 
				"8bfed69d296d8ac5fcb2a0");
		url_list.add("http://api.openweathermap.org/data/2.5/weather?q=Usera,es&APPID=ed3c5a41ce8\r\n" + 
				"bfed69d296d8ac5fcb2a0");
		url_list.add("http://api.openweathermap.org/data/2.5/weather?q=Kaulsdorf,de&APPID=ed3c5a41c\r\n" + 
				"e8bfed69d296d8ac5fcb2a0");
		url_list.add("http://api.openweathermap.org/data/2.5/weather?q=Edgware,uk&APPID=ed3c5a41c\r\n" + 
				"e8bfed69d296d8ac5fcb2a0");
		url_list.add("http://api.openweathermap.org/data/2.5/weather?q=Pevensey,uk&APPID=ed3c5a41\r\n" + 
				"ce8bfed69d296d8ac5fcb2a0");
		url_list.add("http://api.openweathermap.org/data/2.5/weather?q=Himeville,za&APPID=ed3c5a41c\r\n" + 
				"e8bfed69d296d8ac5fcb2a0");
		
		
		
		try {
			 
			MongoDatabase mdb=null;
			 
//			Fetching the data from the Urls and Inserting into MOngoDb
					for(String urls : url_list)
					{
						   
								resp_code=0;
							    response = null;	
							    responce_json=null;
							    
								request = new Request.Builder()
								  .url(urls)
								  .get()
								  .build();
						          
								 
										 
								 response = client.newCall(request).execute();
								 
				
												 responce_json = response.body().string();
												 resp_code = response.code();
												 
												 if(resp_code==200) {
													 
													 if(mdb==null)
									                 mdb = MongoConnection.getConnection();
													 
									             MongoCollection collection = mdb.getCollection("Assignment2");
												 Document data_to_insert = Document.parse(responce_json);
												 collection.insertOne(data_to_insert);			
												 
												      System.out.println("-=-=-=-=Successfully Excuted-=-=-=-=");
												 }
												 else
												 {
													   System.out.println("Some Error Occured");
													   System.out.println("URL ->"+urls);
												 }
					  	
					}
					
			// Get the name of the city with Minimum tempreture ()
										
					if(mdb==null)
		                 mdb = MongoConnection.getConnection();
			      
					MongoCollection Tmpcollection = mdb.getCollection("Assignment2");
					
					FindIterable<Document> dumps = Tmpcollection.find().sort(new BasicDBObject("main.temp_min",+1)).limit(1);
					System.out.println("CITY with Minimum Tempreture");
					
					for(Document d : dumps)
					{
						System.out.println(d.get("name"));
					}
					
		   // get the name of the city with Maximum tempreture 			
					
					if(mdb==null)
		                 mdb = MongoConnection.getConnection();
			      
					MongoCollection Tmpcollection2 = mdb.getCollection("Assignment2");
					FindIterable<Document> dumps2 = Tmpcollection2.find().sort(new BasicDBObject("main.temp_max",-1)).limit(1);
					
					System.out.println("CITY with Maximum Tempreture");
					
					for(Document d2 : dumps2)
					{
						System.out.println(d2.get("name"));
					}
		
			}
			catch (Exception e) {
				System.out.println("---Error Occurein Main--");
				e.printStackTrace();
			}

	}

}
