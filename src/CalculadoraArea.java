import java.util.Scanner;

public class CalculadoraArea
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        boolean salir = false;

        System.out.println("Calculadora");
        System.out.println("Oscar Jovani Martinez Aguilera");
        System.out.println("Estudiante de Ingenieria\n");
        System.out.println("Elige una opcion");
        System.out.println("1 - Círculo");
        System.out.println("2 - Rectángulo");
        System.out.print("Opción (1/2): ");

        // ! negacion
        // hasNextInt --> verifica si el siguiente numero es entero
        if (!sc.hasNextInt())
        {
            System.out.println("Opción no válida. Se esperaba 1 o 2.");
            sc.close(); // cerrar sino es asi
            return;
        }
        int opcion = sc.nextInt();
        // guardar

        switch (opcion)
        {
            case 1:
            {
                // Área del círculo
                System.out.print("Ingrese el radio: ");
                if (!sc.hasNextDouble())
                {
                    System.out.println("Entrada no válida. Se esperaba un número.");
                    break;
                }
                double radio = sc.nextDouble(); // guardar decimales

                if (radio < 0)
                {
                    System.out.println("El radio no puede ser negativo.");
                    break;
                }
                double area = Math.PI * radio * radio;
                System.out.println("operacion: " + "3.142 *: " + radio + ": * : " + radio);
                System.out.printf("Área del círculo: %.1f unidades cuadradas%n", area);
                compararCon100(area);
                break;
            }
            case 2:
            {
                // Área del rectángulo
                System.out.print("Ingrese la base: ");
                if (!sc.hasNextDouble())
                {
                    System.out.println("Entrada no válida. Se esperaba un número.");
                    break;
                }
                double base = sc.nextDouble();

                System.out.print("Ingrese la altura: ");
                if (!sc.hasNextDouble())
                {
                    System.out.println("Entrada no válida. Se esperaba un número.");
                    break;
                }
                double altura = sc.nextDouble();

                if (base < 0 || altura < 0)
                {
                    System.out.println("La base y la altura no pueden ser negativas.");
                    break;
                }
                double area = base * altura;
                System.out.println("Operacion =:" + base + "*" + altura);
                System.out.printf("Área del rectángulo: %.1f unidades cuadradas%n", area);
                compararCon100(area);
                break;
            }
            default:
                System.out.println("Opción no válida. Use 1 para círculo o 2 para rectángulo.");
        }

        while (!salir)
        {
            // Preguntar si desea salir
            System.out.print("¿Desea salir? (si para salir, otra tecla para continuar): ");
            sc.nextLine(); // limpiar el salto de línea pendiente
            String resp = sc.nextLine(); // validar respuesta
            if (resp.equalsIgnoreCase("si"))
            {
                salir = true;
            }
            System.out.println();
            sc.close();
            System.out.println("Programa terminado.");
        }
    }

    private static void compararCon100(double area)
    {
        if (area > 100.0)
        {
            System.out.println("El área es mayor que 100 unidades cuadradas.");
        } else if (area < 100.0)
        {
            System.out.println("El área es menor que 100 unidades cuadradas.");
        } else
        {
            System.out.println("El área es exactamente igual a 100 unidades cuadradas.");
        }
    }
}