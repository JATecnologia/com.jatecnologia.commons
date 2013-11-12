package com.jatecnologia.commons.core.encryption;

import java.math.BigInteger;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

public class EncryptionUtil {
	
	public static String builPasswordSHA256(String password) {		 
		try {
			MessageDigest algoritmo = MessageDigest.getInstance("SHA-256");
						
			algoritmo.update(password.getBytes());                  
           
			String senhaEncriptada = new BigInteger(1, algoritmo.digest()).toString(16);
            
			return senhaEncriptada;
			
		} catch (NoSuchAlgorithmException e) {			
			e.printStackTrace();
		}		
		return password;
	}
}
