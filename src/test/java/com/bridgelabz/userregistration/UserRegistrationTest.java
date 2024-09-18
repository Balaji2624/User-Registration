package com.bridgelabz.userregistration;

import junit.framework.Assert;
import org.junit.jupiter.api.Test;

public class UserRegistrationTest {
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
}
