import java.util.Scanner;

public class Login_ThreeTries {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        String Username = "Sumit";
        String Password = "Raj";


        for (int i=1; i<=3; i++){
            System.out.print("Enter Username: ");
            String username = sc.nextLine();
            System.out.print("Enter Password: ");
            String password = sc.nextLine();

            if (username.equals(Username)){
                if (password.equals(Password)){
                    System.out.println("Login Successful!!!!!!!!!!!!");
                    break; // Exit the loop if login is successful
                }else {
                    System.out.println("Invalid Password!!!!!!!!!!!!");
                }
            } else {
                System.out.println("Invalid Username!!!!!!!!!!!");
            }
        }
    }
}
