package emailapp;

import java.util.Scanner;

public class Email {
    private String firstName;
    private String lastName;
    private String password;
    private int defaultPasswordLength = 10;
    private String department;
    private String email;
    private int mailboxCapacity;
    private String alternateEmail;
    private String companySuffix;

    //Constructor to receive first and last name
    public Email(String firstName, String lastName,String companySuffix){
        this.firstName = firstName; //this refers to the class variable
        this.lastName = lastName;

        //System.out.println("Email created for " + this.firstName + " " + this.lastName );

        //Calling method to enter department
        this.department = setDepartment();
        //System.out.println("Employee departmet is " + this.department);

        //Calling method to generate random password
        //this.password = randomPassword(defaultPasswordLength);
        randomPassword(defaultPasswordLength);
        System.out.println("Your temporary password is: " + getPassword());

        //Combine information to generate e-mail
        setCompanySuffix(companySuffix);
        if (department.equals("")) {
            email = firstName.toLowerCase() + lastName.toLowerCase() + "@"  + getCompanySuffix().toLowerCase() + ".com";
        }
        else {
            email = firstName.toLowerCase() + lastName.toLowerCase() + "@" + department + "." + getCompanySuffix() + ".com";
        }

        //System.out.println("The employee e-mail is: " + email);
    }
    //Asking for department
    private String setDepartment(){
        System.out.print("DEPARTMENT CODES \n1 for Sales \n2 for Development \n3 for Accounting \n0 for none\nEnter employee department: ");
        Scanner in =new Scanner(System.in);
        int departmentChoice = in.nextInt();
        if (departmentChoice == 1 ) {return "sales";}
        else if (departmentChoice == 2) {return "dev";}
        else if (departmentChoice == 3){return "acc";}
        else  {return "";}

    }
    //Displaying information
    public String showInfo () {
        return "DISPLAY NAME: " + getFirstName() + " " + getLastName() +
                "\nCOMPANY EMAIL: " + getEmail() +
                "\nPASSWORD: " + getPassword() +
                "\nMAILBOX CAPACITY: " + getMailboxCapacity() + "MB" +
                "\nALTERNATE E-MAIL: " + getAlternateEmail() ;

    }

    //Generating random password
    private void randomPassword(int length){
        String passwordSet = "ABECDEFGHIJKLMNOPQRSTUVWXYZ1234567890$#!@^&*()";
        char[] password = new char[length];
        for (int i = 0; i < length; i++){
            int rand = (int) (Math.random() * passwordSet.length());
            //System.out.println(rand );
            password[i] = passwordSet.charAt(rand);
           // System.out.println(password[i] );
        }
        //return new String(password);
        setPassword(String.copyValueOf(password));
        //System.out.println(String.copyValueOf(password) );
    }
    //Setting mailbox capacity
    public void setMailboxCapacity(int capacity){
        this.mailboxCapacity = capacity;
    }
    //Setting Company suffix
    public void setCompanySuffix(String companySuffix){
        this.companySuffix = companySuffix;
    }
    //Setting alternate e-mail
    public void setAlternateEmail (String alternateEmail){
        this.alternateEmail = alternateEmail;
    }
    //Setting password
    public void setPassword(String password){
        this.password = password;
    }
    //Getting mailboxCapasity
    public int getMailboxCapacity(){
        return this.mailboxCapacity;
    }
    //Getting password
    public String getPassword(){
        return  this.password;
    }
    //Getting alternate email
    public String getAlternateEmail(){ return this.alternateEmail;}
    //Getting company suffix
    public String getCompanySuffix() {
        return companySuffix;
    }
    //Getting employee email
    public String getEmail() {
        return email;
    }
    //Getting employee name
    public String getFirstName(){
        return firstName;
    }
    //Getting employee last name
    public String getLastName() {
        return lastName;
    }


}
