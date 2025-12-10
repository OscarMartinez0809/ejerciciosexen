import java.util.Scanner;

public class ContadorVocales
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        char[] letras = new char[10];
        System.out.println("Oscar Jovani Martinez Aguilera");
        System.out.println("Estudiante de Ingenieria\n");
        System.out.println("Ingrese 10 letras minúsculas :");
        for (int i = 0; i < letras.length; i++)
        {
            System.out.print("Letra " + (i + 1) + ": ");
            String entrada = sc.next();

            // Validar que el usuario escribió exactamente un carácter y que sea letra minúscula
            // validar que se ingrese 1 sola letra por texto
            // !Character.isLowerCase(entrada.chadAt(0))) devuelve verdadero si no es minuscula
            // bucle
            // || operador lodigo OR , 1 de las 2 debe ser en este caso falso
            while (entrada.length() != 1 || !Character.isLowerCase(entrada.charAt(0)))
            {
                System.out.println("Entrada inválida. Escriba una sola letra minúscula.");
                System.out.print("Letra " + (i + 1) + ": ");
                entrada = sc.next();
            }

            letras[i] = entrada.charAt(0);
            // charAt --> metodo de instancia
            // extraer y devolver un caracter de tipo char
        }

        int contadorVocales = 0;
        for (char c : letras)
        {
            // Comprobar si c es vocal
            if (c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u')
            {
                contadorVocales++;
            }
        }

        System.out.println("\nArreglo ingresado:");
        for (int i = 0; i < letras.length; i++)
        {
            System.out.print(letras[i] + (i < letras.length - 1 ? " - " : ""));
        }

        System.out.println("\n\nTotal de vocales encontradas: " + contadorVocales);
        sc.close();
    }
}
