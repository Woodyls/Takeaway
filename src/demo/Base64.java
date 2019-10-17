package demo;

import sun.misc.BASE64Decoder;
import sun.misc.BASE64Encoder;

public class Base64 {

	// 加密
	public static String getEncryptBASE64(String str) throws Exception {
		return encryptBASE64(str.getBytes());
	}

	// 解密
	public static String getDecryptBASE64(String str) throws Exception {
		return new String(decryptBASE64(str));
	}

	
	public static byte[] decryptBASE64(String key) throws Exception {
		return (new BASE64Decoder()).decodeBuffer(key);
	}

	public static String encryptBASE64(byte[] key) throws Exception {
		return (new BASE64Encoder()).encodeBuffer(key);
	}
}
