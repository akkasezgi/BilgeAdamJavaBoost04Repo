package com.bilgeadam.boost.week06.lesson002.openclosed;

public class PasswordHasher {

	
	public String hashPassword(String password, HashingType hashingType) {
		String hashedPassword = null;	
	
		if(HashingType.BASE64.equals(hashingType)) {
			
			hashedPassword = "hashed with Base64";
			
		}else if(HashingType.MD5.equals(hashingType)) {
			
			hashedPassword = "hashed with MD5";
		}
		
		return hashedPassword;
	 //    password.hash();
	}
	
	
}
