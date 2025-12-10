import java.util.Scanner;

public class ConversorUnidades
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);

        // Leer el valor numérico a convertir
        System.out.println("Oscar Jovani Martinez Aguilera");
        System.out.println("Estudiante de Ingenieria\n");
        System.out.print("Ingrese el valor a convertir: ");
        while (!sc.hasNextDouble())
        {
            System.out.println("Entrada inválida. Escriba un número.");
            sc.next(); // descarta entrada si no es  numéro
            System.out.print("Ingrese el valor a convertir: ");
        }
        double valor = sc.nextDouble();

        // Mostrar menú
        System.out.println("Elija la conversión:");
        System.out.println("1 - Kilómetros a Millas");
        System.out.println("2 - Centígrados a Fahrenheit");
        System.out.println("3 - Metros a Pies");
        System.out.print("Opción (1/2/3): ");

        // Leer opción y validar como entero
        // bucle de validación de entrada
        // el programa no avanza hasta que el usuario introduzca un dato del tipo esperado
        while (!sc.hasNextInt())
        {
            System.out.println("Opción inválida. Escriba 1, 2 o 3.");
            sc.next();
            System.out.print("Opción (1/2/3): ");
        }
        int opcion = sc.nextInt();

        // Ejecutar conversión usando switch
        switch (opcion) // validar opcion numerica
        {
            case 1: // km -> mi
                double millas = valor * 0.621371; // operacion
                System.out.printf("%.4f km = %.4f millas%n", valor, millas);
                break;
            case 2: // C -> F
                double fahrenheit = valor * 9.0 / 5.0 + 32.0;
                System.out.printf("%.2f °C = %.2f °F%n", valor, fahrenheit);
                break;
            case 3: // m -> pies
                double pies = valor * 3.28084;
                System.out.printf("%.4f m = %.4f ft%n", valor, pies);
                break;
            default:
                System.out.println("Opción no válida. Ejecute el programa otra vez y elija 1, 2 o 3.");
        }

        sc.close();
    }
}
