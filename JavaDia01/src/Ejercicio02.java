import java.util.Scanner;

public class Ejercicio02 {
    public static boolean esPar(int x) {
        return x % 2 == 0;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Que sean multiplos de: ");
        int n = scanner.nextInt();

        System.out.print("Hasta que Numero entero: ");
        int m = scanner.nextInt();

        System.out.println("\nMúltiplos de  " + n + " desde 1 hasta " + m + " : ");

        for (int i = 1; i <= m; i++)
        {
            if (i % n == 0)
            {
                System.out.println(i);

            }
        }

        scanner.close();
    }
}