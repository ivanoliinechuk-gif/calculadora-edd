import java.util.Scanner;

public class Calculadora {
        // Valida el rango [-99999...99999]
    public static boolean esValido(int numero) {
        return numero >= -99999 && numero <= 99999;
    }

    public static int sumar(int a, int b) {
        return a + b;
    }

    public static int restar(int a, int b) {
        return a - b;
    }

    public static int multiplicar(int a, int b) {
        return a * b;
    }

    public static double potencia(int base, int exponente) {
        return Math.pow(base, exponente);
    }
        //bububu 
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Introduce el primer numero entero [-99999...99999]: ");
        int num1 = scanner.nextInt();

        System.out.print("Introduce el segundo numero entero [-99999...99999]: ");
        int num2 = scanner.nextInt();

        if (!esValido(num1) || !esValido(num2)) {
            System.out.println("Error: solo se permiten enteros de hasta 5 digitos [-99999...99999].");
            scanner.close();
            return;
        }

        System.out.println("Selecciona operacion: 1-Suma, 2-Resta, 3-Multiplicacion, 4-Potencia");
        int opcion = scanner.nextInt();

        switch (opcion) {
            case 1:
                System.out.println("Resultado: " + sumar(num1, num2));
                break;
            case 2:
                System.out.println("Resultado: " + restar(num1, num2));
                break;
            case 3:
                System.out.println("Resultado: " + multiplicar(num1, num2));
                break;
            case 4:
                System.out.println("Resultado: " + potencia(num1, num2));
                break;
            default:
                System.out.println("Operacion no permitida.");
        }

        scanner.close();
    }
}