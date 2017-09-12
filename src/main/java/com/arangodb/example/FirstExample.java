package com.arangodb.example;

import com.arangodb.ArangoDB;
import com.arangodb.ArangoDatabase;

public class FirstExample {

	public static void main(String[] args) {
		ArangoDB arangoDB = new ArangoDB.Builder().build();

		ArangoDatabase database = arangoDB.db();

		User user = database.collection("users").getDocument("1873", User.class);

		System.out.println(user);
	}

}
