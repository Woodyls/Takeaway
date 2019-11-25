package com.sql.connect;

import org.junit.Before;
import org.junit.Test;

import com.character.Student;

public class Connect_PoolTest {

	@Before
	public void setUp() throws Exception {
	}

	@Test
	public void testGetConnection() {
		Student stu = new Student("test1", "12346");
		Connect_Pool.getConnection(stu);
	}

}
