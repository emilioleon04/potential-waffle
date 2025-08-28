import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Ingresa tu nombre:");
        String name = input.nextLine();

            System.out.println("Hola!, " + name);

            Scanner user = new Scanner(System.in);
        System.out.println("Ingresa tu edad:");
        int edad = user.nextInt();

        if  (edad >= 18) {
            System.out.printf("Felicidades!, " + name + " puedes votar en la elecciones!");
        }

    }
}