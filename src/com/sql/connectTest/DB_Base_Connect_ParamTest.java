package com.sql.connectTest;

import org.junit.Before;
import org.junit.Test;

import com.sql.connect.DB_Base_Connect_Param;

public class DB_Base_Connect_ParamTest {

	@Before
	public void setUp() throws Exception {
	}

	@Test
	public void testGet_user() {
		System.out.println(DB_Base_Connect_Param.get_Student_ID());
		// DB_Base_Connect_Param.get_user();
	}

	@Test
	public void testGet_password() {
		System.out.println(DB_Base_Connect_Param.get_Student_PW());
		// fail("Not yet implemented");
	}

}
