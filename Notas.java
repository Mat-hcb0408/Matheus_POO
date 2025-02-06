package Matheus_POO;
import java.util.Scanner;
public class Notas {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Insira a primeira nota: ");
        double n1 = sc.nextDouble();
        System.out.println("Insira a segunda nota: ");
        double n2 = sc.nextDouble();
        sc.close();
        double result=Aprovacao(n1,n2);
        ShowResult(result);
    }

    public static double Aprovacao(double n1,double n2){
        double media = (n1 + n2) / 2;
        return media;
    }
    public static void ShowResult(double media){
        if (media >= 7) {
            System.out.println("O aluno foi aprovado");
        } else {
            System.out.println("O aluno NÃO foi aprovado");
        }
    }
}