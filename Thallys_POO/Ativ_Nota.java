package Thallys_POO;
import javax.xml.transform.Result;
import java.util.Scanner;
public class Ativ_Nota {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite a nota do aluno: ");
        int Nota = scanner.nextInt();
        int Result = nota(Nota);
        showResult(Result);
        scanner.close();
    }

    public static int nota(int x){
        int Aux;
        if (x >= 10) {
            Aux = 0;
        } else {
            Aux = 1;
        }
        return Aux;
    }
    public static void showResult(int value){
        if(value == 0) {
            System.out.printf("O Aluno foi Aprovado com Nota Maxima!");
        }else {
            System.out.println("O Aluno não foi Aprovado com Nota Maxima!");
        }
    }
}

