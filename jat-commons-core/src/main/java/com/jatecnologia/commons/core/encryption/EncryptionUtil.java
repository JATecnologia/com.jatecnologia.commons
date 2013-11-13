package com.jatecnologia.commons.core.encryption;

import java.math.BigInteger;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

public class EncryptionUtil {
	
	public static final String MD5 = "MD5";
	public static final String SHA1 = "SHA-1";
	public static final String SHA256 = "SHA-256";
	
	public static String generatePasswordSHA256(String password) {		 
		try {
			MessageDigest algorithm = MessageDigest.getInstance(SHA256);
						
			algorithm.update(password.getBytes());                  
           
			String encryptedPassword = new BigInteger(1, algorithm.digest()).toString(16);
            
			return encryptedPassword;
			
		} catch (NoSuchAlgorithmException e) {			
			e.printStackTrace();
		}		
		return password;
	}
}
