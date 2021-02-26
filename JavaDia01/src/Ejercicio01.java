import java.util.Scanner;

public class Ejercicio01
{
    public static boolean esPar(int x)
    {
        return x % 2 == 0;
    }

    public static void main(String[] args)

    {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Ingrese un numero entero: ");
        int n = scanner.nextInt();

        for( int i = 1; i < n; i++)
        {
            boolean ok = esPar(i);

            if( ok )
            {
                System.out.println(i);
            }
        }

        scanner.close();
    }

}
