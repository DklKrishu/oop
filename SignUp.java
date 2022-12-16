package week3;

import java.util.Scanner;

@SuppressWarnings("unused")
public class SignUp {
    private int signal;
    public SignUp() {
        while (signal != 2) {
            System.out.println("Please enter 1 for SignUp.\nPlease enter 2 to Exit.");
            Scanner scanner = new Scanner(System.in);
            signal = scanner.nextInt();
            // signup process
            if (signal == 1) {
                SignUpProcess signUpProcess = new SignUpProcess();
            } else if (signal == 3) {
                System.out.println("Thank you for using the Application.");
            }
        }
        System.out.println("Thank you for using the Application.");
    }
}
