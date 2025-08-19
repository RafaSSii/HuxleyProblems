//Faça um programa que leia 3 números inteiros e os imprima em ordem crescente.
import java.util.Scanner;

public class AscendingOrder {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite o primeiro número: ");
        int num1 = scanner.nextInt();
        System.out.println("Digite o segundo número: ");
        int num2 = scanner.nextInt();
        System.out.println("Digite o terceiro número: ");
        int num3 = scanner.nextInt();

        if ((num1 > num2) && (num2 > num3)){
            System.out.println(num3 + " " + num2 + " " + num1);
        } else if ((num1 > num2) && (num3 > num1)){
            System.out.println(num2 + " " + num1 + " " + num3);
        } else if ((num3 > num2) && (num2 > num1)){
            System.out.println(num1 + " " + num2 + " " + num3);
        } else if ((num2 > num3) && (num3 > num1)){
            System.out.println(num1 + " " + num3 + " "+ num2);
        } else if ((num1 > num3) && (num3 > num2)){
            System.out.println(num2 + " " + num3 + " "+ num1);
        }

    }
}
