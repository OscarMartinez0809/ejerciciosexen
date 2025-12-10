import java.util.Scanner;

public class SumaRangos
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Oscar Jovani Martinez Aguilera");
        System.out.println("Estudiante de Ingenieria\n");
        System.out.print("A (inicio): ");
        int A = sc.nextInt();
        System.out.print("B (fin): ");
        int B = sc.nextInt();

        while (A > B)
        {
            System.out.println("Error: A debe ser <= B. Intente de nuevo.");
            System.out.print("A (inicio): ");
            A = sc.nextInt();
            System.out.print("B (fin): ");
            B = sc.nextInt();
        }
        //StringBuilder --> clase que permite concatenar 2 cosas separadas
        StringBuilder linea = new StringBuilder(); //Objeto de esa clase --> linea
        int suma = 0; // inicializar suma igual a 0
        for (int i = A; i <= B; i++) // recorrer valor incial hasta valor final
        {
            suma += i;
            /*
            - toma el valor actual de suma, le suma el valor de i
            y guarda el resultado de nuevo en suma

            */
            linea.append(i); //metodo de la clase
            // este añade texto al final del contenido actual
            if (i < B) linea.append(" + "); //añade el + despues de verificar que sea i menor que valor final
        }

        // Imprime la línea de números en una sola fila, luego una línea horizontal y la suma centrada a la derecha
        System.out.println(linea.toString());
        for (int i = 0; i < linea.length(); i++) System.out.print("-");
        //recorre un bucle desde i = 0 hasta i
        // sea menor que linea.length() y, en cada recorrido, imprime un guion - sin salto de línea
        System.out.println();
        System.out.println("Suma = " + suma);
        //imprimir resultado

        sc.close();
    }
}