import java.util.Scanner;

public class ContaEspacosEVogais {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        String[] strSplit = str.split(" ");
        char[] arrVogais = {'a', 'e', 'i', 'o', 'u'};
        int espacosEmBranco = strSplit.length - 1, quantVogais = 0;

        for (String item : strSplit) {

            //TODO: Implemente condições (laços) adequados para que possamos contar os espaços em brancos e as vogais que existem na string.
            //Dica: Você pode utilizar o Character.toLowerCase em sua condição:
            for (int i = 0; i < item.length(); i++) {
                char c = Character.toLowerCase(item.charAt(i));
                if (c == ' ') {
                    espacosEmBranco++;
                } else {
                    for (char vogal : arrVogais) {
                        if (c == vogal) {
                            quantVogais++;
                            break;
                        }
                    }
                }
            }

        }
        System.out.println("Espacos em branco: " + espacosEmBranco + " Vogais: " + quantVogais);
    }
}
