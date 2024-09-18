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

    // test password
    @Test
    public void testValidPasswords() {
        UserRegistration user=new UserRegistration();
        boolean result=user.isValidPassword("password");
        Assert.assertTrue(result);
    }

    @Test
    public void testInvalidPasswords() {
        UserRegistration user=new UserRegistration();
        boolean result=user.isValidPassword("pass");
        Assert.assertFalse(result);
    }

    // test password rule-2
    @Test
    public void testValidPasswordsRule2() {
        UserRegistration user=new UserRegistration();
        boolean result=user.isValidPasswordRule2("Password");
        Assert.assertTrue(result);
    }

    @Test
    public void testInvalidPasswordsRule2() {
        UserRegistration user=new UserRegistration();
        boolean result=user.isValidPasswordRule2("pass");
        Assert.assertFalse(result);
    }

    // validate password rule-3
    @Test
    public void testValidPasswordsRule3() {
        UserRegistration user=new UserRegistration();
        boolean result=user.isValidPasswordRule3("Password1");
        Assert.assertTrue(result);
    }

    @Test
    public void testInvalidPasswordsRule3() {
        UserRegistration user=new UserRegistration();
        boolean result=user.isValidPasswordRule3("password");
        Assert.assertFalse(result);
    }

    // test sample email
    @Test
    public void EmailCorrectTest() {
        UserRegistration user=new UserRegistration();
        boolean result=user.isValidSampleEmail("abc.xyz@bl.co.in");
        Assert.assertTrue(result);
    }
    @Test
    public void EmailIncorrectTest() {
        UserRegistration user=new UserRegistration();
        boolean result=user.isValidSampleEmail("abc.com");
        Assert.assertFalse(result);
    }
}
