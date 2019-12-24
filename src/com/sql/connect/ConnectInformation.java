package com.sql.connect;

import java.util.ResourceBundle;

public class ConnectInformation {
	private static ResourceBundle bundle = ResourceBundle.getBundle("ConnectStyle");
	private static String DRIVER = bundle.getString("DRIVER");
	private static String URL = bundle.getString("URL");

	public static String get_DRIVER() {
		return DRIVER;
	}

	public static String get_URL() {
		return URL;
	}
}
