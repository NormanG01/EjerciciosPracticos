import java.util.Scanner;

public class Disco {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Ingrese su edad: ");
        int edad = scanner.nextInt();
        System.out.println("Ingrese su género (M/F): ");
        String genero = scanner.next();
        if (edad < 18) {
            System.out.println("Lo siento, no puedes entrar a la disco por playo.");
        } else if (genero.equals("F")) {
            System.out.println("Puedes entrar a la disco.");
            if (edad >= 20) {
                System.out.println("Puedes consumir bebidas alcohólicas.");
            } else {
                System.out.println("No puedes consumir bebidas alcohólicas.");
            }
        } else if (genero.equals("M")) {
            System.out.println("¿Portas armas? (S/N): ");
            String armas = scanner.next();
            if (armas.equals("S")) {
                System.out.println("Lo siento, no puedes entrar a la disco.");
            } else {
                System.out.println("Puedes entrar a la disco.");
                if (edad >= 20) {
                    System.out.println("Puedes consumir bebidas alcohólicas.");
                } else {
                    System.out.println("No puedes consumir bebidas alcohólicas.");
                }
            }
        }
    }
}