import java.util.Random;
import java.util.Scanner;

public class RANDOM
{
    // function to generate password
    static String generate_password(int size) {
        // collection of characters that can be used in password
        String chars = "abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ1234567890!@#$%^&*()_+-/.,<>?;':\"[]{}\\|`~";

        String password = "";
        // creating object of Random class
        Random rnd = new Random();
        // looping to generate password
        while (password.length() < size) {
            // get a random number between 0 and length of chars
            int index = (int) (rnd.nextFloat() * chars.length());
            // add character at index to password
            password += chars.charAt(index);
        }
        return password;
    }
    static String password_strength(String password) {
        int strength = 0;
        if (password.length() >= 8) {
            strength += 1;
        }
        if (password.matches(".*[A-Z].*")) {
            strength += 1;
        }
        if (password.matches(".*[a-z].*")) {
            strength += 1;
        }
        if (password.matches(".*[0-9].*")) {
            strength += 1;
        }
        if (password.matches(".*[!@#$%^&*()_+-/.,<>?;':\"{}\\|`~].*")) {
            strength += 1;
        }
        if (strength == 1) {
            return "Very Weak";
        } else if (strength == 2) {
            return "Weak";
        } else if (strength == 3) {
            return "Medium";
        } else if (strength == 4) {
            return "Strong";
        } else if (strength == 5) {
            return "Very Strong";
        }
        return "Very Weak";
    }

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the size of password: ");
        int size = sc.nextInt();
        sc.close();

        // calling function to generate password
        String password = generate_password(size);
        // printing the password
        System.out.println(password); 

        // calling function to check password strength
        System.out.println("Password Strength: " + password_strength(password));
    }
}

