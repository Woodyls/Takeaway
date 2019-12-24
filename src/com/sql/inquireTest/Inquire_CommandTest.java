package com.sql.inquireTest;

import org.junit.Before;
import org.junit.Test;

import com.sql.inquire.Inquire_Command;

public class Inquire_CommandTest {

	@Before
	public void setUp() throws Exception {
	}

	@Test
	public void testSelect_Student() {
		System.out.println(Inquire_Command.Select_Student());
	}

}
