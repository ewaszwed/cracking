//1.9
package com.algoritms;

public class StringRotation {
    
    public static boolean isRotation(String s1, String s2){        
        if(s1.length() == s2.length() && s1.length() > 0){            
            String s2s2 = s2 + s2;           
            return isSubstring(s1, s2s2);            
        }
        return false;
    }
    
    private static boolean isSubstring(String subStringCan, String bigString){        
        return bigString.toLowerCase().contains(subStringCan.toLowerCase());
      
    }
    
}
