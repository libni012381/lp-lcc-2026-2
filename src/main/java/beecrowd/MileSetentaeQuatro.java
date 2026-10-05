package beecrowd;
import java.util.Scanner;


public class MileSetentaeQuatro {
     static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = Integer.parseInt(sc.nextLine());
        if (N == 0) {
            System.out.print("NULL");
        } else if (N % 2 == 0) {
            if (N>0){
            System.out.print("EVEN POSITIVE");
        } else if (N<0) {
                System.out.print("EVEN NEGATIVE");
            }

            } else if (N % 2 != 0) {
            if (N>0){
                System.out.print("ODD POSITIVE");}
            else{
                System.out.print("ODD NEGATIVE");
            }
        }

    }
}