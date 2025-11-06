package Exemplos;

public class funcoesMatematicas {
    public static void main(String[] args) {

        double x= 3.0; // Lembrar sempre de declarar o valor double com as casas decimais!
        double y= 4.0;
        double z= -5.0;
        double A, B, C; // Aqui A, B e C serão variáveis para testarmos as funções matemáticas

        System.out.println("x= "+x);
        System.out.println("y= "+y);
        System.out.println("z= "+z);
        // print dos valores para melhor visualização no console

        A= Math.sqrt(x);
        B= Math.sqrt(y);
        C= Math.sqrt(25.0);
        // Math.sqrt calcula raiz quadrada
        System.out.println("A raiz quadarada de "+x+" = "+A);
        System.out.println("B raiz quadarada de "+y+" = "+B);
        System.out.println("C raiz quadarada de 25 ="+C);
        // print do resultado

        A= Math.pow(x, y);
        B= Math.pow(x, 2.0);
        C= Math.pow(5.0, 2.0);
        // Math.pow calcula potência (primeiro número elevado ao segundo número)
        System.out.println(x+" elevado a "+y+" = "+A);
        System.out.println(x+" ao  quadrado = "+B);
        System.out.println("5 ao  quadrado = "+C);
        // print do resultado

        A= Math.abs(y);
        B= Math.abs(z);
        /* Math.abs mostra o valor absoluto
        Valor absoluto é a distância de um número em uma reta numérica por ex -5 até 0 a distância é  5 */
        System.out.println("Valor absoluto de "+y+" = "+A);
        System.out.println("Valor absoluto de "+z+" = "+B);
        // print do resultado
    }
}
