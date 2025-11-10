import java.util.Scanner;

public class Main {
    static void greet() {
        System.out.println("Hola, no retorno algun valor.");
    }

    static int sum(int a, int b) {         
        return a + b;
    }

    static boolean isAdult(int age) {      
        return age >= 18;
    }

    static void title(String t) {         
        System.out.println("\n=== " + t + " ===");
    }



    public static void main(String[] args) {
        Utils.title("Métodos");
        Utils.greet();
        int r = Utils.sum(8, 5);
        System.out.println("8 + 5 = " + r);
        System.out.println("¿20 es adulto? " + Utils.isAdult(20));

        Utils.title("Entrada/Salida con Scanner");
        Scanner sc = new Scanner(System.in);

        System.out.print("¿Cómo te llamas? ");
        String name = sc.nextLine();

        System.out.print("¿Edad? ");
        int age = sc.nextInt();
        sc.nextLine(); // limpia el salto de línea pendiente

        System.out.println("Hola " + name + ", " + (Utils.isAdult(age) ? "eres mayor de edad." : "eres menor de edad."));

        Utils.title("Introducción a la POO");
        Pet pet = new Pet("Michi", 2);
        pet.greetOwner(name);
        pet.speak();
        pet.birthday();
        System.out.println(pet);

        sc.close();
    }
}