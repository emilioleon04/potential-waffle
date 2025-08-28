import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Ingresa tu nombre:");
        String name = input.nextLine();

        for (int i = 0; i < 3; i++) {
            System.out.println("Hola!, " + name);
        }
    }
}