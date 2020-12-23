package com.registration.user;

import java.util.regex.Pattern;

public class UserRegistration {
    public boolean firstName(String pattern,String firstName){
        if (Pattern.matches(pattern,firstName))
            return true;
        else
            return false;
    }
}
