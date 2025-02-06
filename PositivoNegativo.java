package Matheus_POO;
import java.util.Scanner;
public class PositivoNegativo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Insira um numero:");
        int x=sc.nextInt();
        sc.close();
        int resultado=PositivoNegativo(x);

    }
    public static int PositivoNegativo(int x){
        if (x>0){
            System.out.printf(x+">0");
        }else if(x<0){
            System.out.printf(x+"<0");
        }else{
            System.out.println(x+"=0");
        }
        return x;
    }
}
