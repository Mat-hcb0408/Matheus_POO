package Matheus_POO;
import java.util.Scanner;
public class Senha {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Insira sua senha: ");
        int senha= sc.nextInt();
        sc.close();
        int confirmacao=Acesso(senha);
    }
    public static int Acesso (int senha) {
        if (senha == 1234) {
            System.out.println("acesso liberado");
        } else {
            System.out.println("acesso negado");
        }
        return senha;
    }
}