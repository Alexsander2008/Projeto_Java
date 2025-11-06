package Atv12_ExerciciosSobreEstruturaSequencial;
import java.util.Locale;
import java.util.Scanner;
public class exercicio_04 {
    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc= new Scanner(System.in);

        int func;
        System.out.println("Type the employee number: ");
        func= sc.nextInt();

        double hor;
        System.out.println("Type the number of worked hours: ");
        hor= sc.nextDouble();

        double val;
        System.out.println("Type how much the employee receive for hours: ");
        val= sc.nextDouble();

        double salr= hor*val;

        System.out.printf("The salary of the employee "+func+" is: U$ %.2f %n", salr);

        sc.close();
    }
}
