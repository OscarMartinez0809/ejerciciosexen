import java.util.Scanner;

public class Clase19
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);

        // 1. Entradas requeridas y validación con while
        int[] numeros = new int[3];
        int i = 0;
        while (i < 3)
        {
            System.out.print("Ingresa un número entero mayor que 0: ");
            int num = sc.nextInt();
            if (num > 0)
            {
                numeros[i] = num;
                i++;
            } else
            {
                System.out.println("Número inválido. Debe ser mayor que 0.");
            }
        }

        // 2. Transformación condicional con for y if-else
        for (int j = 0; j < numeros.length; j++)
        {
            if (numeros[j] % 2 == 0)
            { // número par
                numeros[j] += 5;
            } else
            { // número impar
                numeros[j] -= 1;
            }
        }

        // 3. Cálculo final: suma de elementos transformados
        int suma = 0;
        for (int num : numeros)
        {
            suma += num;
        }

        int VCF = suma * 3;

        // 4. Mostrar resultado
        System.out.println("El VCF es: " + VCF);
    }
}
