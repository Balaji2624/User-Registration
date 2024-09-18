// Test first Name

package com.bridgelabz.userregistration;

import junit.framework.Assert;
import org.junit.jupiter.api.Test;

public class UserRegistrationTest {
    // test first name
    @Test
    public void testValidFirstName() {
        UserRegistration user=new UserRegistration();
        boolean result=user.isValidFirstName("Balaji");
        Assert.assertTrue(result);
    }
    @Test
    public void testInvalidFirstName() {
        UserRegistration user=new UserRegistration();
        boolean result=user.isValidFirstName("balaji");
        Assert.assertFalse(result);
    }

    // test last name
    @Test
    public void testValidLastName() {
        UserRegistration user=new UserRegistration();
        boolean result=user.isValidLastName("Sapkal");
        Assert.assertTrue(result);
    }

    @Test
    public void testInvalidLastName() {
        UserRegistration user=new UserRegistration();
        boolean result=user.isValidLastName("sapkal");
        Assert.assertFalse(result);
    }

    // test email
    @Test
    public void testValidEmails() {
        UserRegistration user=new UserRegistration();
        boolean result=user.isValidEmail("abc.xyz@bl.co.in");
        Assert.assertTrue(result);
    }

    @Test
    public void testInvalidEmails() {
        UserRegistration user=new UserRegistration();
        boolean result=user.isValidEmail("abc.xyz@bl");
        Assert.assertFalse(result);
    }

    // test mobile number
    @Test
    public void testValidMobileNumber() {
        UserRegistration user=new UserRegistration();
        boolean result=user.isValidMobileNumber("91 9919819801");
        Assert.assertTrue(result);
    }

    @Test
    public void testInvalidMobileNumber() {
        UserRegistration user=new UserRegistration();
        boolean result=user.isValidMobileNumber("123 9919819801");
        Assert.assertFalse(result);
    }
}
