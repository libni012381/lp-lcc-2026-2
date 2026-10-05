package beecrowd;
import java.util.Scanner;

public class MileCentoeTrintaeQuatro {
    public static void main(String []args) {
        Scanner sc = new Scanner(System.in);


        int gas = 0;
        int alcool = 0;
        int diesel = 0;


        int n= sc.nextInt();
        while (n!=4){
        if (n == 1){
            alcool++;
        }else if (n==2){
            gas++;
        }else if (n==3){
            diesel++;
        }
            n = sc.nextInt();
        }
        System.out.println("MUITO OBRIGADO");
        System.out.println("Alcool: "+alcool);
        System.out.println("Gasolina: "+ gas);
        System.out.println("Diesel: "+diesel);



    }





}
