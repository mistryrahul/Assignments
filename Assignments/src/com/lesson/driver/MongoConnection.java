package com.lesson.driver;

import com.mongodb.MongoClient;
import com.mongodb.MongoClientURI;
import com.mongodb.MongoCredential;
import com.mongodb.client.MongoDatabase;

// MOngoDb COnnector
public class MongoConnection {
	
	static String user_id="root";
	static String password="admin123";
	static String database_name="lesson";
	
	static MongoClient mongoclient=null;
	static MongoDatabase mongodatabase;
	static MongoCredential credential; 
	
	static 
	{
//		String uri="mongo --port 27017  --authenticationDatabase \"admin\" -u '"+user_id+"' -p '"+password+"'";
//		String uri="mongodb://localhost/";
		
	     mongoclient = new MongoClient( "localhost" , 27017 );
		
		credential = MongoCredential.createCredential(user_id, database_name,password.toCharArray()); 
		
		System.out.println("Connected to the database successfully");  
		
//		MongoClientURI mongoUri = new MongoClientURI(uri);
//		 mongoclient = new MongoClient(mongoUri);
	}
	
	public static MongoDatabase getConnection()
	{ 
	    try {
	    	
		 mongodatabase = mongoclient.getDatabase(database_name);
	    }
	    catch (Exception e) {
		 System.out.println("Connection Problem Occured");
		 
		 System.out.println("=-=-=-=-=-=-=-=-=-=-===-=-=");
		  System.out.println(e.getMessage());
		 System.out.println("=-=-=-=-=-=-=-=-=-=-===-=-=");
//		 e.printStackTrace();
		}
		return mongodatabase;
	}	
	
	
	
}
