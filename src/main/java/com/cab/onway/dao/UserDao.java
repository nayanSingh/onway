package com.cab.onway.dao;

import com.cab.onway.common.config.ConnectionFactory;
import com.cab.onway.model.Location;
import com.google.code.morphia.Datastore;

public class UserDao {

	public static void saveLocation(Location location) {
		Datastore datastore = ConnectionFactory.getInstance().getDataBase();
		datastore.save(location);

	}
}
