import java.util.Scanner;

public class PromedioDinamico
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        double[] calificaciones = new double[5];

        // Llenar el arreglo pidiendo al usuario
        System.out.println("Oscar Jovani Martinez Aguilera");
        System.out.println("Estudiante de Ingenieria");
        System.out.println("Ingrese las 5 calificaciones");
        for (int i = 0; i < 5; i++)
        {
            System.out.print("Calificación " + (i + 1) + ": ");
            calificaciones[i] = sc.nextDouble();
        }

        // Llamar a la función y mostrar el resultado
        double promedio = calcularPromedio(calificaciones);
        System.out.println("\nEl promedio de las 5 calificaciones es: " + promedio);

        sc.close();
    }
    public static double calcularPromedio(double[] notas)
    {
        double suma = 0;
        for (int i = 0; i < notas.length; i++)
        {
            suma += notas[i];
        }
        return suma / notas.length;
    }
}