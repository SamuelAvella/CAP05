public class Ejercicio18 {
    public static void main(String[] args) {
        int num1, num2;
        do {
            System.out.print("Escribe el primer número entero: ");
            num1 = Integer.parseInt(System.console().readLine());
            System.out.print("Escribe el primer número entero: ");
            num2 = Integer.parseInt(System.console().readLine());
        } while (num1==num2);
        if (num1<num2) {
            for (int i = num1; i < num2 ; i+=7) {
                System.out.print(i+" ");
            }
            System.out.print(num2);
        } else {
            for (int i = num2; i < num1 ; i+=7) {
                System.out.print(i+" ");
            }
            System.out.print(num1);
        }
    }
}
