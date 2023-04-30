import java.io.IOException;
import java.util.Scanner;

public class Triangulo {
    public static void main(String[] args) throws IOException {
        Scanner leitor = new Scanner(System.in);
        double A = leitor.nextDouble();
        double B = leitor.nextDouble();
        double C = leitor.nextDouble();
        double maior;
        double soma;
        boolean triangulo;

//TODO: Implemente a condição necessária para o cálculo do triângulo:
//Dica: Você pode utilizar o String.format() na formatação do texto.
        triangulo = A < B + C && B < A + C && C < A + B;

        if (triangulo) {
            soma = A + B + C;
            System.out.printf("Perimetro = %.1f\n", soma);
        } else {
            soma = ((A + B) * C) / 2;
            System.out.printf("Area = %.1f\n", soma);
        }

    }

}
