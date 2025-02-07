package Matheus_POO;
import java.util.Scanner;
public class PositivoNegativo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Insira um numero:");
        int x=sc.nextInt();
        sc.close();
        int resultado=PositivoNegativo(x);
        ShowResult(resultado,x);
    }
    public static int PositivoNegativo(int x){
        int aux;
        if (x>0){
            aux=0;
        }else if(x<0){
            aux=1;
        }else{
            aux=2;
        }
        return aux;
    }
    public static void ShowResult(int value,int x){
        if (value==0){
            System.out.println(x+">0");
        }else if(value==1){
            System.out.println(x+"<0");
        }else{
            System.out.println(x+"=0");
        }
    }
}
