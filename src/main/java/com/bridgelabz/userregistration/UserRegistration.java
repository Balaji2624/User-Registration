// validate first name 

package com.bridgelabz.userregistration;

public class UserRegistration {
    public boolean isValidFirstName(String firstName) {

        String regex = "^[A-Z][a-zA-Z]{2,}$";
        return firstName.matches(regex);
    }

    public static void main(String[] args) {
        UserRegistration userRegistration=new UserRegistration();
        System.out.println(userRegistration.isValidFirstName("balaji"));
    }
}
