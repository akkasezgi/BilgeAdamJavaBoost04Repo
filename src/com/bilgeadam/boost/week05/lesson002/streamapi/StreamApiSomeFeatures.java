package com.bilgeadam.boost.week05.lesson002.streamapi;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.stream.Collectors;

public class StreamApiSomeFeatures {

	public static void main(String[] args) {
	
		
		List <User> users = new ArrayList<>();
		
		users.add(new User(56,"Samet"));
        users.add(new User(2,"Ahmet"));
        users.add(new User(3,"Zehra"));
        users.add(new User(4,"Murat"));
        users.add(new User(5,"Yildiz"));
        users.add(new User(6,"Levent"));
        users.add(new User(7,"Elvan"));
		

        users.stream().forEach(user -> System.out.println(user));
       
        // birden fazla işlem için 
//        users.stream().forEach(user -> {
//        	System.out.println(user);
//        	System.out.println("Java 8");
//        });
        
        // her bir user icin tanımladıgımız talk metodu cagır
        users.stream().forEach(user -> user.talk());
        
        users.stream().forEach(User::talk);   //method referance 
        
        
        // user ıd 5ten büyük olan kaç kişi var 
        
        long count = users.stream().filter(user -> user.id>5).count();
        System.out.println(count);
        
        // filtreledigim elemanları listeleme 
        
        List<User> filteredList = users.stream()
        .filter(user -> user.id>5)
        .collect(Collectors.toList());
        
        filteredList.stream().forEach(user -> user.talk());
        
        // map user üzerinde değişiklik yapıp onları yeni birer elemana maplememizi saglar
        
        Set<User> mappedList = users.stream()
        .map(user -> new User(user.getId()+100,user.getName()))
        .collect(Collectors.toSet());
        
        mappedList.stream().forEach(user -> System.out.println(user));
        System.out.println(users);
        
                
        Map<Integer, String> userMap = users.stream().collect(Collectors.toMap(user -> user.id,user -> user.name));
      
        userMap.forEach((key, value) -> System.out.println(key + " - " + value));
        
        
	}

}
