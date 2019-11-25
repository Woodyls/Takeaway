package com.encryption;

import org.junit.Before;
import org.junit.Test;

public class Base64Test {

	@Before
	public void setUp() throws Exception {
	}

	@Test
	public void testGetEncryptBASE64() {
		try {
			System.out.println("1:" + Base64.getEncryptBASE64("屠龙宝刀屠尽天下"));
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	@Test
	public void testGetDecryptBASE64() {
		try {
			System.out.println("2:" + Base64.getDecryptBASE64(Base64.getEncryptBASE64("屠龙宝刀屠尽天下")));
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
