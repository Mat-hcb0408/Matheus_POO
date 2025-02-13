package App_password;
import App_password.Password.Password;

import java.util.Scanner;

public class Program {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);


        System.out.println("Insira sua senha:");
        int password= sc.nextInt();

        if (password==1234){
            System.out.println("Acesso liberado!");
        }else{
            System.out.println("Acesso negado.");
        }
    }
}