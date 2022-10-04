package com.bilgeadam.boost.week06.lesson002.openclosed;

public class MD5Hasher implements IPasswordHasher{

	@Override
	public String hashPassword(String password) {
		
		return "hashed with base64";
	}

}
