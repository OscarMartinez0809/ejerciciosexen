import java.util.Scanner;

public class GeneradorSecuencia
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Oscar Jovani Martinez Aguilera");
        System.out.println("Estudiante de Ingenieria\n");
        System.out.print("Ingrese un entero positivo N: ");
        int N = sc.nextInt();
        generarSecuencia(N);
        sc.close();
    }
    public static void generarSecuencia(int N)
    {
        for (int k = 1; k <= N; k++)
        {
            if (k % 2 == 0)
            {
                System.out.println("Par --> " + k);
            } else
            {
                System.out.println("Impar --> " + k);
            }
        }
    }
}
