package com.reader.com;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class Configuration_Reader {

	public static Properties prop;
	
	public Configuration_Reader() throws IOException {
		File f = new File("C:\\Users\\DELL PC\\eclipse-workspace\\AdactinHotelProject\\src\\test\\java\\com\\configuration\\com\\Configuration.properties");
		FileInputStream fis =new FileInputStream(f);
		prop = new Properties();
		prop.load(fis);
	}
	
	public String getURL() {
		String url = prop.getProperty("url");
		return url;
	}
	
	public String getUsername() {
		String username = prop.getProperty("username");
		return username;
	}
	public String getPassword() {
		String password = prop.getProperty("password");
		return password;
	}
	public String getLocation() {
		String location = prop.getProperty("location");
		return location;
	}
	
	public String getHotel() {
		String hotel = prop.getProperty("hotel");
		return hotel;
	}
	
	public String getRoomtype() {
		String roomtype = prop.getProperty("roomtype");
		return roomtype;
	}
	
	public String getRoomnos() {
		String roomnos = prop.getProperty("roomnos");
		return roomnos;
	}
	
	public String getCheckInDate() {
		String checkInDate = prop.getProperty("checkInDate");
		return checkInDate;
	}
	
	public String getCheckOutDate() {
		String checkOutDate = prop.getProperty("checkOutDate");
		return checkOutDate;
	}
	
	public String getAdultroom() {
		String adultroom = prop.getProperty("adultroom");
		return adultroom;
	}
}
