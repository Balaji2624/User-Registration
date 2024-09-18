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
}
