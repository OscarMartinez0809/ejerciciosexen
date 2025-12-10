import java.util.Scanner;

public class OperacionesMath {
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);
        double numero; //

        // 🛡️ Validación: el número debe ser positivo
        do {
            System.out.print("Ingresa un número POSITIVO para aplicar operaciones matemáticas: ");
            numero = scanner.nextDouble();

            if (numero <= 0) {
                System.out.println("El número debe ser mayor que cero. Intenta nuevamente.\n");
            }
        } while (numero <= 0);

        System.out.println("\nExplorando operaciones de la clase Math:\n");

        // 1. Valor absoluto
        System.out.println("1.- Math.abs(x): Devuelve el valor absoluto (sin signo)");
        System.out.println("    Resultado: " + Math.abs(numero));

        // 2. Raíz cuadrada
        System.out.println("2.- Math.sqrt(x): Calcula la raíz cuadrada");
        System.out.println("    Resultado: " + Math.sqrt(numero));

        // 3. Potencia al cuadrado
        System.out.println("3.- Math.pow(x, 2): Eleva el número al cuadrado");
        System.out.println("    Resultado: " + Math.pow(numero, 2));

        // 4. Potencia al cubo
        System.out.println("4.- Math.pow(x, 3): Eleva el número al cubo");
        System.out.println("    Resultado: " + Math.pow(numero, 3));

        // 5. Logaritmo natural
        System.out.println("5.- Math.log(x): Logaritmo natural (base e)");
        System.out.println("    Resultado: " + Math.log(numero));

        // 6. Logaritmo base 10
        System.out.println("6.- Math.log10(x): Logaritmo en base 10");
        System.out.println("    Resultado: " + Math.log10(numero));

        // 7. Exponencial
        System.out.println("7.- Math.exp(x): Calcula e^x (exponencial)");
        System.out.println("    Resultado: " + Math.exp(numero));

        // 8. Redondeo hacia abajo
        System.out.println("8.- Math.floor(x): Redondea hacia abajo al entero más pequeño");
        System.out.println("    Resultado: " + Math.floor(numero));

        // 9. Redondeo hacia arriba
        System.out.println("9.- Math.ceil(x): Redondea hacia arriba al entero más grande");
        System.out.println("    Resultado: " + Math.ceil(numero));

        // 10. Redondeo al entero más cercano
        System.out.println("10.- Math.round(x): Redondea al entero más cercano");
        System.out.println("     Resultado: " + Math.round(numero));

        // 11. Seno
        System.out.println("11.- Math.sin(x): Calcula el seno (en radianes)");
        System.out.println("     Resultado: " + Math.sin(numero));

        // 12. Coseno
        System.out.println("12.- Math.cos(x): Calcula el coseno (en radianes)");
        System.out.println("     Resultado: " + Math.cos(numero));

        // 13. Tangente
        System.out.println("13.- Math.tan(x): Calcula la tangente (en radianes)");
        System.out.println("     Resultado: " + Math.tan(numero));

        // 14. Convertir a radianes
        System.out.println("14.- Math.toRadians(x): Convierte grados a radianes");
        System.out.println("     Resultado: " + Math.toRadians(numero));

        // 15. Convertir a grados
        System.out.println("15.- Math.toDegrees(x): Convierte radianes a grados");
        System.out.println("     Resultado: " + Math.toDegrees(numero));

        // 16. Número aleatorio
        System.out.println("16.- Math.random(): Genera un número aleatorio entre 0.0 y 1.0");
        System.out.println("     Resultado: " + Math.random());

        // 17. Constante PI
        System.out.println("17.- Math.PI: Constante matemática π (pi)");
        System.out.println("     Valor: " + Math.PI);

        // 18. Constante E
        System.out.println("18.- Math.E: Constante matemática e (base de logaritmos naturales)");
        System.out.println("     Valor: " + Math.E);

        scanner.close();
    }
}
