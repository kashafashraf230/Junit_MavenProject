package org.example;

public class Contact {
    private String firstName;
    private String lastName;
    private String phoneNumber;

    public Contact(String firstName, String lastName, String phoneNumber) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.phoneNumber = phoneNumber;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public void validateFirstName(){

        if (this.firstName.isBlank()){

            throw new RuntimeException("First Name cannot be null");
        }
    }

    public void validateLastName(){

        if (this.lastName.isBlank()){

            throw new RuntimeException("Last Name cannot be null");
        }
    }

    public void validatePhoneNumber(){

        if (this.phoneNumber.isBlank()){

            throw new RuntimeException("Phone Number cannot be null");
        }

        if (this.phoneNumber.length() != 11){
            throw new RuntimeException("Phone Number should be 11 digit long");
        }


        if (this.phoneNumber.matches("\\d") ){
            throw new RuntimeException("Phone Number should only contain digits");
        }


        if (this.phoneNumber.startsWith("0")){
            throw new RuntimeException("Phone Number should start with 0");
        }
    }
}
