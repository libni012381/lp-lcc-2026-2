package beecrowd;
import java.io.IOException;
import java.util.Scanner;

public class MileNove {
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);
        String nome = sc.nextLine();
        double salario = sc.nextDouble();
        double vendas = sc.nextDouble();

        double salariofinal = (salario+(vendas*0.15));

        System.out.printf("TOTAL = R$ %.2f", salariofinal);


            sc.close();

        }

    }

