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

     // validate mobile number
     public boolean isValidMobileNumber(String mobileNumber) {

         String regex = "^[0-9]{2} [0-9]{10}$";
         return mobileNumber.matches(regex);
     }

     // validate password rule-1
     public boolean isValidPassword(String password) {

         String regex = "^.{8,}$";
         return password != null && password.matches(regex);
     }

     // validate password rule-2
     public boolean isValidPasswordRule2(String password) {

         String regex = "^(?=.*[A-Z]).{8,}$";
         return password != null && password.matches(regex);
     }

     // validate password rule-3
     public static boolean isValidPasswordRule3(String password) {

         String regex = "^(?=.*[A-Z])(?=.*\\d).{8,}$";
         return password != null && password.matches(regex);
     }

     // validate password rule-4
     public static boolean isValidPasswordRule4(String password) {

         String regex = "^(?=.*[A-Z])(?=.*[0-9])(?=.*[!@#$%^&*()_+\\-=\\[\\]{};':\"\\\\|,.<>\\/?]).{8,}$";

         int specialCharCount = password.replaceAll("[A-Za-z0-9]", "").length();

         return password != null && password.matches(regex) && specialCharCount == 1;
     }
    public static void main(String[] args) {
        UserRegistration userRegistration=new UserRegistration();
        System.out.println(userRegistration.isValidFirstName("balaji"));
        System.out.println(userRegistration.isValidLastName("Sapkal"));
        System.out.println(userRegistration.isValidEmail("abc.xyz@bl.co.in"));
        System.out.println(userRegistration.isValidMobileNumber("91 9919819801"));
        System.out.println(userRegistration.isValidPassword("pass"));
        System.out.println(userRegistration.isValidPasswordRule2("Password"));
        System.out.println(userRegistration.isValidPasswordRule3("Password1"));
        System.out.println(userRegistration.isValidPasswordRule4("Password12"));
    }
}
