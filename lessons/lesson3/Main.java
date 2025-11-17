public class Main {
    public static void main(String[] args) {
        
        // “Si la edad es mayor o igual a 18, entonces es mayor de edad; si no, es menor de edad”

        int edad = 20;

        if (edad >= 18){
            System.out.println("Eres mayor de edad");
        } else {
            System.out.println("Eres menor de edad");
        }
        
        
        // Si la nota es mayor o igual a 18, mostrar ‘Excelente’; si la nota es mayor a 11, mostrar ‘Aprobado’;
        // si la nota es menor a 11, mostrar ‘Desaprobado’

        int nota1 = 5;

        if (nota1 >= 18){
            System.out.println("Excelente");
        } else if (nota1 >= 11) {
            System.out.println("Aprobado");
        } else {
            System.out.println("Desaprobado");
        }
        
        
        // Si la nota es 20, mostrar "Nota perfecta"
        // Si la nota es mayor a 11, pero menor que 20, mostrar "Aprobado"
        // Si la nota es menor que 11 y mayor que 0, mostrar "Desaprobado"
        // Si la nota es cualquier otro número, mostrar "Nota inválida"

        int nota2 = 20;

        if (nota2 == 20){
            System.out.println("Nota perfecta");
        } else if (nota2 >= 11 && 2 < 20) {
            System.out.println("Aprobado");
        } else if (nota2 < 11 && nota2 >= 0) {
            System.out.println("Desaprobado");
        } else {
            System.out.println("Nota inválida");
        }
        
        
        // Imprimir en pantalla del 1 al 10

        for(int i = 1; i <= 10; i++){
            System.out.println(i);
        }
        
        
        // Contar del 5 al 1
        
        int contador = 5;
        
        while (contador >= 1){
            System.out.println(contador);
            contador = contador - 1;
        }
        
    }
}