package com.registration.user;

import java.util.regex.Pattern;

public class UserRegistration {
    public boolean firstName(String pattern,String firstName,String mood){
        if (mood.equals("Happy")) {
            if (Pattern.matches(pattern, firstName))
                return true;
            else
                return false;
        }
        else
            return false;
    }
    public boolean lastName(String pattern,String lastName,String mood){
        if (mood.equals("Happy")) {
            if (Pattern.matches(pattern, lastName))
                return true;
            else
                return false;
        }
        else
            return false;
    }
    public boolean email(String pattern,String email,String mood){
        if (mood.equals("Happy")) {
            if (Pattern.matches(pattern,email))
                return true;
            else
                return false;
        }
        else
            return false;
    }
    public boolean phone(String pattern,String phone,String mood){
        if (mood.equals("Happy")) {
            if (Pattern.matches(pattern, phone))
                return true;
            else
                return false;
        }
        else
            return false;
    }
    public boolean password(String pattern,String password,String mood){
        if (mood.equals("Happy")) {
            if (Pattern.matches(pattern, password))
                return true;
            else
                return false;
        }
        else
            return false;
    }
}
