package Desafios_de_Programação_Lógica;

import java.util.Scanner;

public class exercicio_01 {
    public static void main(String[] args) {
        int n1=0, n2=1, n3=n1+n2, num;
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite quantos números deseja saber da sequencia de fibonacci");
        num=sc.nextInt();

        if (num==1){
            System.out.println("0");
        }
        else if (num==2) {
            System.out.println("0");
            System.out.println("1");
        }
        else if (num>2) {
            System.out.println("0");
            System.out.println("1");

            for (int i = 3; i <= num; i++) {
                Boolean primo= true;

                if (n3<2){
                    primo= false;
                }
                else
                    for (int div=2; div<n3; div++)
                        if (n3%div==0){
                            primo= false;
                            break;
                        }
                        else {
                            primo=true;
                        }


                if (primo) {
                    System.out.println(n3+"*");
                }
                else
                    System.out.println(n3);

                n1 = n2;
                n2 = n3;
                n3 = n1 + n2;
            }
        }
        sc.close();
    }
}