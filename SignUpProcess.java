package week3;

import java.util.Scanner;

public class SignUpProcess {
    private String name;
    private String username;
    private String password1;
    private String password2;
    private String DateOfBirth;

    public SignUpProcess(){
        Scanner scanner = new Scanner(System.in);

        //taking inputs
        System.out.println("Please enter your full name: ");
        this.name = scanner.nextLine();
        System.out.println("Please enter your mobile number (username): ");
        this.username = scanner.nextLine();
        System.out.println("Please enter your password: ");
        this.password1 = scanner.nextLine();
        System.out.println("Please confirm your password: ");
        this.password2 = scanner.nextLine();
        System.out.println("Please enter your Date of Birth #DD/MM/YYYY (No space): ");
        this.DateOfBirth = scanner.nextLine();
        signUp();
    }

    public void signUp(){
        Validation validate = new Validation();
        boolean valName = validate.validateName(this.name);
        boolean valContact = validate.validateContact(this.username);
        boolean valPassword = validate.validateCheckPassword(this.password1, this.password2);
        boolean valPasswordMatch = validate.validatePassword(this.password1);
        if (valName && valPassword && valContact && valPasswordMatch){
            System.out.println("You have successfully signed up.\n");
        } else {
            System.out.println("Some of the input fields are not valid.\n");
            if (!valName) {
                System.out.println("Your name must have more than 4 letters.\nPlease start again.");
            }
            if (!valContact) {
                System.out.println("Your contact number is invalid.\nPlease start again.");
            }
            if (!valPassword) {
                System.out.println("Your passwords are not matching.\nPlease start again.");
            }
            if(!valPasswordMatch){
                System.out.println("Your password does not matches the format");
            }
        }

    }


}
