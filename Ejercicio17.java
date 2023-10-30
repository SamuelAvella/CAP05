public class Ejercicio17 {
    public static void main(String[] args) {
        int num = -1;
        while (num<0) {
            System.out.print("Introduzca un número entero positivo: ");
            num = Integer.parseInt(System.console().readLine());
            if (num<0) {
            System.out.println("Error vuelva a introducir el número");
            }
        }
        int suma = 0;
        for (int i = num; i <= (num+100); i++) {
            suma+=i;
        }
        System.out.println("La suma de los 100 siguientes número a "+num+" es igual a "+suma);
    }
}
