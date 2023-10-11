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
                throw new NullPointerException();
            }
            if (password.length() < 6){
                throw new IllegalArgumentException();
            }
            if (!DataUsername.equals(userName) || !DataPassword.equals(password)){
                throw new SecurityException();
            }
            System.out.println("Login Success!");
        } catch (NullPointerException e) {
            System.out.println("Username and/or Password field is empty");
        } catch (IllegalArgumentException e) {
            System.out.println("Password is less then 6");
        } catch (SecurityException e) {
            System.out.println("Usernme or Password is not valid");
        }
    }
    }