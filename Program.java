package App_password.Program;

import java.util.Scanner;
import App_password.Password;

public class Program {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Insira sua senha:");
        int password = sc.nextInt();

        Password password1 = new Password();
        // Verifica a senha e exibe a resposta
        System.out.println(password1.verifyPassword(password));

        sc.close();
    }
}
