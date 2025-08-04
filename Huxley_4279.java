//pegue todos os 10 primeiros múltiplos do número da entrada, sem usar condicional(if)
import java.util.Scanner;

public class Huxley_4279 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Qual número deseja ver os 10 múltiplos? ");
        int num1 = scanner.nextInt();

        scanner.close();

        for (int i = 0; i < 11; i++){
            int resultado = num1 * i;
            System.out.println(resultado);
        }
        
    }
}
