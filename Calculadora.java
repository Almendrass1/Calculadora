import java.util.Scanner;

public class Calculadora{
    public static void main(String[] args) {
        System.out.println("Bienvenido a la calculadora");
        System.out.print("Ingrese el primer número: ");
        double num1 = new Scanner(System.in).nextDouble();

        System.out.print("Ingrese el segundo número: ");
        double num2 = new Scanner(System.in).nextDouble();

        System.out.println("""
                            Seleccione una operación:
                            1. Suma
                            2. Resta
                            3. Multiplicación
                            4. División""");

        int opcion = new Scanner(System.in).nextInt();

        double resultado;
        switch (opcion) {
            case 1:
                resultado = num1 + num2;
                System.out.println("El resultado de la suma es: " + resultado);
                break;
            case 2:
                resultado = num1 - num2;
                System.out.println("El resultado de la resta es: " + resultado);
                break;
            case 3:
                resultado = num1 * num2;
                System.out.println("El resultado de la multiplicación es: " + resultado);
                break;
            case 4:
                if (num2 != 0) {
                    resultado = num1 / num2;
                    System.out.println("El resultado de la división es: " + resultado);
                } else {
                    System.out.println("Error: No se puede dividir entre 0.");
                }
                break;
            default:
                System.out.println("Opción no válida.");
        }
    }
}
