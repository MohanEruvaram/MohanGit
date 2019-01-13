package com.Techm;

import org.bson.Document;

import com.mongodb.MongoClient;
import com.mongodb.client.FindIterable;
import com.mongodb.client.MongoCollection;
import com.mongodb.client.MongoDatabase;

/**
 * Hello world!
 *
 */
public class App {
	public static void main(String[] args) {
		MongoClient mongoClient = new MongoClient("localhost", 27017);
		MongoDatabase db = mongoClient.getDatabase("Mohan");
		MongoCollection<Document> collection = db.getCollection("Mohan");
		long count = collection.count();
		FindIterable<Document> find = collection.find();
		for (Document docm : find) {
			String json = docm.toJson();

		}

	}
}
