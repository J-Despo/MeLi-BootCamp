import java.util.Scanner;

public class Ejercicio05
{

    public static void main(String[] args) {
        //33-133-233-303-313- n=5, m=2, d=3
        System.out.print("Ingrese la cantidad de números:");
        Scanner scanner = new Scanner(System.in);
        int cantidadNumeros = scanner.nextInt();
        System.out.print("Ingrese la cantidad de digitos:");
        int cantidadDigitos = scanner.nextInt();
        System.out.print("Ingrese el numero de digito a buscar:");
        char tipoDigito = scanner.next().charAt(0);
        int cantNumeros = 0;
        int numero = 1;
        char[] numeroAEvaluar;
        while(cantNumeros < cantidadNumeros) {
            int contadoraDigitos = 0;
            numeroAEvaluar = Integer.toString((numero)).toCharArray();
            for (int i = 0; i < numeroAEvaluar.length; i++) {
                if(numeroAEvaluar[i] == tipoDigito){
                    contadoraDigitos++;
                }
            }
            if(contadoraDigitos == cantidadDigitos)
            {
                System.out.println(numero);
                cantNumeros++;
            }
            numero++;
        }

    }
}


