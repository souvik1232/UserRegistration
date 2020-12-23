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
        boolean result = userRegistration.firstName("^[A-Z]{1}[a-z]{2,}$","Mandal");
        Assert.assertEquals(true,result);
    }
}