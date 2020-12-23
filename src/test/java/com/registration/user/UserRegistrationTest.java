package com.registration.user;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class UserRegistrationTest {
    UserRegistration userRegistration = new UserRegistration();
    //UserCase1
    @Test
    public void firstNameTest(){
        boolean result = userRegistration.firstName("^[A-Z]{1}[a-z]{2,}$","Souvik");
        Assert.assertEquals(true,result);

    }
    //UserCase2
    @Test
    public void lastNameTest() {
        boolean result = userRegistration.lastName("^[A-Z]{1}[a-z]{2,}$","Mandal");
        Assert.assertEquals(true,result);
    }
    //UserCase3
    @Test
    public void emailTest() {
        boolean result = userRegistration.email("^[a-zA-Z0-9\\-\\+\\.]+.([a-zA-Z0-9])*@([a-z0-9]+.[a-z]{2,}.([a-z]{2,})?)$","souvik199831@gmail.com");
        Assert.assertEquals(true,result);
    }
    //UserCase4
    @Test
    public void phoneTest() {
        boolean result = userRegistration.phone("^[0-9]{2}[ ]?[0-9]{10}$","917550167198");
        Assert.assertEquals(true,result);
    }
    //UserCase5
    @Test
    public void passwordTest() {
        boolean result = userRegistration.password("^(?=.{8,}$)(?=.*[A-Z])[a-zA-Z0-9]","");
        Assert.assertEquals(true,result);
    }
}