package com.sql.connect;

import org.junit.Before;
import org.junit.Test;

public class ConnectInformationTest {

	@Before
	public void setUp() throws Exception {
	}

	@Test
	public void testGet_JDBC_DRIVER() {
		// ConnectInformation.get_JDBC_DRIVER();
		new ConnectInformation();
		System.out.println(ConnectInformation.get_JDBC_DRIVER());
	}

	@Test
	public void testGet_DB_URL() {
		System.out.println(ConnectInformation.get_DB_URL());
		// ConnectInformation.get_DB_URL();
	}

}
