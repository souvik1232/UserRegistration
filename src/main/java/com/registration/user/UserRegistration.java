package com.registration.user;

import java.util.regex.Pattern;

public class UserRegistration {
    public boolean firstName(String pattern,String firstName){
        if (Pattern.matches(pattern,firstName))
            return true;
        else
            return false;
    }
    public boolean lastName(String pattern,String lastName){
        if (Pattern.matches(pattern,lastName))
            return true;
        else
            return false;
    }
    public boolean email(String pattern,String email){
        if (Pattern.matches(pattern,email))
            return true;
        else
            return false;
    }
    public boolean phone(String pattern,String phone){
        if (Pattern.matches(pattern,phone))
            return true;
        else
            return false;
    }
}
