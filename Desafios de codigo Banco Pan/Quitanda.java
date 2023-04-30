import java.text.DecimalFormat;
import java.util.Scanner;

public class Quitanda {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        int morangos = input.nextInt();
        int macas = input.nextInt();

        double precoMorango = morangos <= 5 ? 2.5 : 2.2;
        double precoMaca = macas <= 5 ? 1.8 : 1.5;

//TODO: Implemente as condições necessárias para retornar o preço a ser pago pelo cliente, conforme a tabela de preços do seu Zé:
        double precoTotal = (morangos * precoMorango) + (macas * precoMaca);

        if ((morangos + macas) > 8 || precoTotal > 25) {
            precoTotal *= 0.9;
        }

        DecimalFormat df = new DecimalFormat("#.##");
        System.out.println(df.format(precoTotal).replace(",", "."));
    }
}
