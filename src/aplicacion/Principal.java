package aplicacion;
import java.util.Scanner;
import dominio.ej2_2_lambda;
public class Principal {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Ingrese un numero: ");
        int n = sc.nextInt();
        System.out.println("El factorial de " + n + " es: " + ej2_2_lambda.factorial(n));
    }
}
