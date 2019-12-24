package com.sql.connectTest;

import org.junit.Before;
import org.junit.Test;

import com.sql.connect.ConnectInformation;

public class ConnectInformationTest {

	@Before
	public void setUp() throws Exception {
	}

	@Test
	public void testGet_DRIVER() {
		// ConnectInformation.get_JDBC_DRIVER();
		new ConnectInformation();
		System.out.println(ConnectInformation.get_DRIVER());
	}

	@Test
	public void testGet_URL() {
		System.out.println(ConnectInformation.get_URL());
		// ConnectInformation.get_DB_URL();
	}

}
