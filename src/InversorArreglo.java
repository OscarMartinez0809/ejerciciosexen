import java.util.Scanner;

public class InversorArreglo
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int[] numeros = new int[5];
        System.out.println("Oscar Jovani Martinez Aguilera");
        System.out.println("Estudiante de Ingenieria\n");
        System.out.println("Ingrese 5 números enteros:");
        for (int i = 0; i < numeros.length; i++)
        {
            System.out.print("Número " + (i + 1) + ": ");
            // colocar numero 0 + 1 = 1
            // numero 1 + 1 = 2
            while (!sc.hasNextInt())
            {
                System.out.println("Entrada inválida. Escriba un numero entero.");
                sc.next();
                System.out.print("Número " + (i + 1) + ": ");
            }
            numeros[i] = sc.nextInt();
        }

        System.out.println("\nArreglo original:");
       for  (int i = 0; i < numeros.length; i++)
       // length --> atributo
           // recorrer desde el valor inicial
        {
            System.out.print(numeros[i] + (i < numeros.length - 1 ? " - " : ""));
        }

        System.out.println("\n\nArreglo invertido:");
        for (int i = numeros.length - 1; i >= 0; i--)
        //  recorre el arreglo desde el último índice hasta el primero
        {
            System.out.print(numeros[i] + (i > 0 ? " - " : ""));
        }
        System.out.println();

        sc.close();
    }
}
