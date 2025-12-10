import java.util.Scanner;

public class ValidarContrasena
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);

        String contrasenaCorrecta = "ingenieria2025"; // contraseña fija
        int intentos = 3;
        int intento = 0;
        boolean accesoConcedido = false;
        System.out.println("Oscar Jovani Martinez Aguilera");
        System.out.println("Estudiante de Ingenieria\n");
        while (intento < 3)
        {
            System.out.print("Ingrese la contraseña: ");
            String usuario = sc.nextLine();

            //equalsIgnoreCase --> ignorar mayuscula o minuscula
            if (usuario.equalsIgnoreCase(contrasenaCorrecta))
            {
                System.out.println("Acceso concedido");
                accesoConcedido = true;
                break;
            } else
            {
                intento ++;
                System.out.println("Contraseña incorrecta. Intentos: " + intento + " de " + intentos);

            }
        }

        // !accesoConcedido --> “no acceso concedido”
        if (!accesoConcedido)
        {
            System.out.println("Acceso denegado. Contacte a soporte.");
        }
        sc.close();
    }
}
