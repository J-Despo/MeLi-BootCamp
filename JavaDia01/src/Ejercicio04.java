import java.util.Scanner;

public class Ejercicio04 {

    public static boolean esPrimo(int numero)
    {
        int contador = 2;
        boolean primo=true;
        while ((primo) && (contador!=numero)){
            if (numero % contador == 0)
                primo = false;
            contador++;
        }
        return primo;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Hasta que Numero entero: ");
        int n = scanner.nextInt();


        for (int i = 1; i <= n; i++)
        {
            boolean ok = esPrimo(i);
            if(ok)
            {
                System.out.println(i);
            }

        }

        scanner.close();
    }
}