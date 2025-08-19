import java.util.Scanner;

public class Huxley_3121 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Cave base (square meters): ");
        double caveBase = scanner.nextDouble();
        System.out.println("Cave height: ");
        double caveHeight = scanner.nextDouble();

        double caveBaseSize = caveBase * caveBase;
        double perfectSize = caveBaseSize * caveHeight;

        System.out.println("The perfect size of the cave is: "+ perfectSize);
    }
}
