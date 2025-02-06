package Thallys_POO;
import java.util.Scanner;

public class Ativ_1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Insira um numero: ");
        int x = sc.nextInt();

        int Result = PositivoNegativo(x);

    }
    public static int PositivoNegativo(int z) {
        if (z > 0) {
            System.out.printf("O numero é Positivo: "+ z);
        } else if (z < 0) {
            System.out.printf("O numero é Negativo: "+ z);
        }else {
            System.out.printf("O numero é Nulo: "+ z);
        }
        return z;
    }
}
