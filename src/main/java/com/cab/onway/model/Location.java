package com.cab.onway.model;

import com.google.code.morphia.annotations.Entity;

@Entity(noClassnameStored = true)
public class Location {
	
	private double lat;
	private double lng;
	
	
	public double getLat() {
		return lat;
	}
	public void setLat(double lat) {
		this.lat = lat;
	}
	public double getLng() {
		return lng;
	}
	public void setLng(double lng) {
		this.lng = lng;
	}

	
	

}
