import java.util.Scanner;

public class Huxley_3891 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Escreva a primeira nota: ");
        double Nota1 = scanner.nextDouble();
        System.out.println("Escreva a segunda nota:");
        double Nota2 = scanner.nextDouble();
        System.out.println("Escreva a terceira nota: ");
        double Nota3 = scanner.nextDouble();

        double Media = (Nota1 + Nota2 + Nota3) / 3;
        double mediaPonderada1 = ((Nota1 * 2) + (Nota2 * 2) + (Nota3 * 3)) / 7;
        double mediaPonderada2 = ((Nota1 * 1) + (Nota2 * 2) + (Nota3 * 2)) / 5;

        System.out.println("Sua média foi: "+ Media);
        System.out.println("Sua média ponderada 1 foi: "+ mediaPonderada1);
        System.out.println("Sua média ponderada 2 foi: "+ mediaPonderada2);
    }
}
