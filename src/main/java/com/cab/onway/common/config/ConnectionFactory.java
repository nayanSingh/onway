package com.cab.onway.common.config;

import com.google.code.morphia.Datastore;
import com.google.code.morphia.Morphia;
import com.mongodb.Mongo;

public class ConnectionFactory {

	private static ConnectionFactory instance = new ConnectionFactory();

	private ConnectionFactory() {

	}

	public Datastore getDataBase() {
		Datastore datastore = null;
		try {
			String dbName = new String(Config.dbName);
			Mongo mongo = new Mongo();
			Morphia morphia = new Morphia();
			datastore = morphia.createDatastore(mongo, dbName);
		} catch (Exception e) {

		}
		return datastore;
	}

	public static ConnectionFactory getInstance() {
		return instance;
	}

}
