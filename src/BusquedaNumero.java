import java.util.Scanner;

public class BusquedaNumero {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Arreglo fijo de 7 enteros
        int[] numeros = {12, 5, 8, 21, 8, 3, 14};
        System.out.println("Oscar Jovani Martinez Aguilera");
        System.out.println("Estudiante de Ingenieria\n");
        System.out.print("Ingrese el número a buscar: ");
        while (!sc.hasNextInt())
        {
            System.out.print("Entrada inválida. Ingrese un número entero: ");
            sc.next();
        }
        int objetivo = sc.nextInt();

        int i = 0;
        boolean encontrado = false;
        while (i < numeros.length)
        {
            if (numeros[i] == objetivo)
            {
                System.out.println("Número encontrado en la posición (índice): " + i);
                encontrado = true;
                break; // termina el while inmediatamente al encontrar el número
            }
            i++;
        }

        if (!encontrado)
        {
            System.out.println("Número no hallado en el arreglo.");
        }

        sc.close();
    }
}
