package com.registration.user;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class UserRegistrationTest {
    UserRegistration userRegistration = new UserRegistration();
    //UserCase1
    @Test
    public void firstNameTestShouldReturnTrue(){
        boolean result = userRegistration.firstName("^[A-Z]{1}[a-z]{2,}$","Souvik","Happy");
        Assert.assertEquals(true,result);

    }
    @Test
    public void firstNameTestShouldReturnFalse(){
        boolean result = userRegistration.firstName("^[A-Z]{1}[a-z]{2,}$","sou","Happy");
        Assert.assertEquals(false,result);

    }
    //UserCase2
    @Test
    public void lastNameTestShouldReturnTrue() {
        boolean result = userRegistration.lastName("^[A-Z]{1}[a-z]{2,}$","Mandal","Happy");
        Assert.assertEquals(true,result);
    }
    @Test
    public void lastNameTestShouldReturnFalse() {
        boolean result = userRegistration.lastName("^[A-Z]{1}[a-z]{2,}$","man","Happy");
        Assert.assertEquals(false,result);
    }
    //UserCase3
    @Test
    public void emailTestShouldReturnTrue() {
        boolean result = userRegistration.email("^[a-zA-Z0-9\\-\\+\\.]+.([a-zA-Z0-9])*@([a-z0-9]+.[a-z]{2,}.([a-z]{2,})?)$","souvik199831@gmail.com","Happy");
        Assert.assertEquals(true,result);
    }
    @Test
    public void emailTestShouldReturnFalse() {
        boolean result = userRegistration.email("^[a-zA-Z0-9\\-\\+\\.]+.([a-zA-Z0-9])*@([a-z0-9]+.[a-z]{2,}.([a-z]{2,})?)$","souvik199831#gmail.com","Happy");
        Assert.assertEquals(false,result);
    }
    //UserCase4
    @Test
    public void phoneTestShouldReturnTrue() {
        boolean result = userRegistration.phone("^[0-9]{2}[ ]?[0-9]{10}$","917550167198","Happy");
        Assert.assertEquals(true,result);
    }
    @Test
    public void phoneTestShouldReturnFalse() {
        boolean result = userRegistration.phone("^[0-9]{2}[ ]?[0-9]{10}$","91550167198","Happy");
        Assert.assertEquals(false,result);
    }
    //UserCase8
    @Test
    public void passwordTestShouldReturnTrue() {
        boolean result = userRegistration.password("^(?=.{8,}$)(?=.*\\d)(?=.*[A-Z])([a-zA-Z0-9]+[\\@\\#\\^])","souvik123A@","Happy");
        Assert.assertEquals(true,result);
    }
    @Test
    public void passwordTestShouldReturnFalse() {
        boolean result = userRegistration.password("^(?=.{8,}$)(?=.*\\d)(?=.*[A-Z])([a-zA-Z0-9]+[\\@\\#\\^])","souvik123A","Happy");
        Assert.assertEquals(false,result);
    }
}