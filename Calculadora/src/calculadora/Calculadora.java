package calculadora;

//Nombre: Angie Natalia Caica Codigo:7004302

import java.util.Scanner;
import java.lang.Math;




public class Calculadora {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int opcion;

        do {
            System.out.println("Seleccione una operación:");
            System.out.println("1. Sumar");
            System.out.println("2. Restar");
            System.out.println("3. Multiplicar");
            System.out.println("4. Dividir");
            System.out.println("5. Coseno");
            System.out.println("6. Seno");
            System.out.println("7. Tangente");
            System.out.println("8. IVA");
            System.out.println("9. Raíz cuadrada");
            System.out.println("10. Potencia");
            System.out.println("0. Salir");
            System.out.print("Ingrese su opción: ");
            opcion = scanner.nextInt();

            switch (opcion) {
                case 1:
                    operar(scanner, "sumar");
                    break;
                case 2:
                    operar(scanner, "restar");
                    break;
                case 3:
                    operar(scanner, "multiplicar");
                    break;
                case 4:
                    operar(scanner, "dividir");
                    break;
                /*case 5:
                    razones(scanner, "coseno");
                    break;
                case 6:
                    razones(scanner, "seno");
                    break;
                case 7:
                    razones(scanner, "tangente");
                    break;
                case 8:
                    calcularIVA(scanner);
                    break;*/
                /*case 9:
                    calcularRaiz(scanner);
                    break;
                case 10:
                    calcularPotencia(scanner);
                    break;*/
                case 0:
                    System.out.println("Va a salir del menu");
                    break;
                default:
                    System.out.println("Opción no válida");
                    break;
            }


        } while (opcion != 0);

        scanner.close();
    }

    private static void operar(Scanner scanner, String operacion) {
        System.out.print("Ingrese el primer número: ");
        double num1 = scanner.nextDouble();
        System.out.print("Ingrese el segundo número: ");
        double num2 = scanner.nextDouble();

        double resultado = 0;
        switch (operacion) {
            case "sumar":
                resultado = num1 + num2;
                break;
            case "restar":
                resultado = num1 - num2;
                break;
            case "multiplicar":
                resultado = num1 * num2;
                break;
            case "dividir":
                if (num2 != 0) {
                    resultado = num1 / num2;
                } else {
                    System.out.println("Error: División por cero.");
                    return;
                }
                break;
        }
        System.out.println("Resultado: " + resultado);
    }
}
    


