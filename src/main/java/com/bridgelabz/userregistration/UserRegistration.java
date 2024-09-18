// validate first name 

package com.bridgelabz.userregistration;

public class UserRegistration {
    // validate first name
    public boolean isValidFirstName(String firstName) {

        String regex = "^[A-Z][a-zA-Z]{2,}$";
        return firstName.matches(regex);
    }
     // validate last name
     public boolean isValidLastName(String lastName) {

         String regex = "^[A-Z][a-zA-Z]{2,}$";
         return lastName.matches(regex);
     }

     // validate email
     public boolean isValidEmail(String email) {

         String regex = "^[a-zA-Z]{3}(\\.[a-zA-Z]{3})?@[a-zA-Z]{2}\\.[a-zA-Z]{2}(\\.[a-zA-Z]{2})?$";
         return email.matches(regex);
     }
    public static void main(String[] args) {
        UserRegistration userRegistration=new UserRegistration();
        System.out.println(userRegistration.isValidFirstName("balaji"));
        System.out.println(userRegistration.isValidLastName("Sapkal"));
        System.out.println(userRegistration.isValidEmail("abc.xyz@bl.co.in"));
    }
}
