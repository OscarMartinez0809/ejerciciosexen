import java.util.Scanner;

public class ClasificadorCalificaciones {

    // Función que recibe una calificación (0-100) y devuelve la categoría

    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Oscar Jovani Martinez Aguilera");
        System.out.println("Estudiante de Ingenieria\n");
        System.out.print("Ingrese la calificación (0-100): ");
        // Validar entrada: debe ser entero y estar entre 0 y 100
        int nota = sc.nextInt();

        while (nota < 0 || nota > 100)
        {
            System.out.println("La calificación debe estar entre 0 y 100.");
            System.out.print("Ingrese la calificación (0-100): ");
            while (!sc.hasNextInt())
            {
                System.out.println("Entrada inválida. Escriba un número entero entre 0 y 100.");
                sc.next();
                System.out.print("Ingrese la calificación (0-100): ");
            }
            nota = sc.nextInt();
        }
        String resultado = clasificarCalificacion(nota);
        System.out.println("Resultado: " + resultado);
        sc.close();
    }
    public static String clasificarCalificacion(int nota)
    {
        if (nota >= 90 && nota <= 100)
        {
            return "Sobresaliente";
        } else if (nota >= 80 && nota <= 89)
        {
            return "Notable";
        } else if (nota >= 70 && nota <= 79)
        {
            return "Aprobatorio";
        } else
        { // 0-69
            return "Reprobatorio";
        }
    }
}
