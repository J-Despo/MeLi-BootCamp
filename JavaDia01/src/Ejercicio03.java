import java.util.Scanner;

public class Ejercicio03 {
    public static boolean esPrimo(int numero)
    {
        int contador = 2;
        boolean primo=true;
        while ((primo) && (contador!= numero)){
            if (numero % contador == 0)
                primo = false;
            contador++;
        }
        return primo;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Ingrese el numero a determinar si es Primo: ");
        int n = scanner.nextInt();

        System.out.println("El numero: " +n+ " es Primo= "+ esPrimo(n));


        scanner.close();
    }
}