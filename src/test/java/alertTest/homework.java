package alertTest;
import java.util.Scanner;

public class homework {

    public static void main(String[] args) {
        String DataUsername = "user1";
        String DataPassword = "123qwe";

        try{
            Scanner data = new Scanner(System.in);
            System.out.println("Enter Username: ");
            String userName = data.nextLine();
            if (userName == null || userName.isEmpty()){
                throw new NullPointerException();
            }
            System.out.println("enter password: ");
            String password = data.nextLine();
            if (password == null || password.isEmpty()) {
                throw new NullPointerException("Password cant be empty");
            }
            if (password.length() < 6){
                throw new IllegalArgumentException("Password is less then 6");
            }
            if (!DataUsername.equals(userName) || !DataPassword.equals(password)){
                throw new SecurityException("Usernme or Password is not valid");
            }
            System.out.println("Login Success!");
        } catch (NullPointerException | IllegalArgumentException | SecurityException e) {
            throw new RuntimeException(e);
        }
    }
    }