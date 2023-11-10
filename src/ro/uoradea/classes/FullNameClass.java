package ro.uoradea.classes;

public class FullNameClass {
    private String firstName;
    private String lastName;
    public FullNameClass(String firstName, String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;
    }
    // Your code goes here
    public String printFullName(){
        return this.firstName +" "+this.lastName;
    }
}


