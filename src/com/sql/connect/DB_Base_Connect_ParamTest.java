package com.sql.connect;

import org.junit.Before;
import org.junit.Test;

public class DB_Base_Connect_ParamTest {

	@Before
	public void setUp() throws Exception {
	}

	@Test
	public void testGet_user() {
		System.out.println(DB_Base_Connect_Param.get_user());
		// DB_Base_Connect_Param.get_user();
	}

	@Test
	public void testGet_password() {
		System.out.println(DB_Base_Connect_Param.get_password());
		// fail("Not yet implemented");
	}

}
