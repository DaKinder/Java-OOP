package org.example;

import java.security.Key;
import java.util.HashMap;
import java.util.Map;

public class Employee {
    public static boolean checkAccount(Integer idNumber, String password){
        Map <Integer, String> map = new HashMap<>();
        map.put( 101, "qwerty" );
        map.put( 102, "3692" );
        map.put( 103, "йцукен" );
        map.put( 104, "123123" );
        if(password.equals(map.get(idNumber))){return true;}
        else return false;
    }
}
