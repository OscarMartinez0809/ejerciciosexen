import java.util.Scanner;

public class creacionfunciones
{
    public static void main(String[] args)
    {
        float[] calificaciones = solicitarCalificaciones();
        float promedioBase = calcularPromedio(calificaciones);
        float promedioFinal = aplicarFactorAjuste(promedioBase);
        mostrarResultado(promedioFinal);
    }

    // final --> constante no puede cambiar
    // static --> pertenencia a una clase y no al objeto
    // static final --> constante de clase ( valor fijo )
    static final float U_S = 100.0f; // Valor máximo permitido

    public static float[] solicitarCalificaciones()
    {
        Scanner scanner = new Scanner(System.in);
        float[] calificaciones = new float[5]; // mi arreglo
        int i = 0;

        while (i < 5)
        {
            System.out.print("Ingresa la calificación #" + (i + 1) + ": ");
            try {
                float entrada = Float.parseFloat(scanner.nextLine());
                if (entrada < 0)
                {
                    System.out.println("La calificación debe ser positiva.");
                    //break --> rompe un ciclo while
                    // continue --> salta esto y continua dentro del ciclo
                    continue;
                }
                if (entrada > U_S)
                {
                    System.out.println("La calificación excede el máximo permitido (" + U_S + ")");
                    entrada = U_S;
                }
                calificaciones[i] = entrada; // guardar lo que ingresa usuario
                i++;
            } catch (NumberFormatException e) // hacer exepcion a errores si meto texto enves de numero
            {
                System.out.println("Entrada inválida. Ingresa un número válido.");
            }
        }
        return calificaciones;
    }

    public static float calcularPromedio(float[] calificaciones)
    {
        float sumaTotal = 0.0f;
        // tomar valores ingresados en calificaciones
        //for (int i = 0; i < calificaciones.length; i++)
        for (float nota : calificaciones) // mi bucle
        {
            sumaTotal += nota;
        }
        return sumaTotal / calificaciones.length;
    }

    public static float aplicarFactorAjuste(float promedioBase)
    {
        float F_A = (promedioBase < 60.0f) ? 2.0f : 0.0f;
        return promedioBase + F_A;
    }

    public static void mostrarResultado(float promedioFinal)
    {
        System.out.printf("\n El promedio final del estudiante es: %.2f\n", promedioFinal);
    }
}
