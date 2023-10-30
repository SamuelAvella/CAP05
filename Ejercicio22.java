public class Ejercicio22 {
    public static void main(String[] args) {
        System.out.println("Todos los primos entre 2 y 100");
        Boolean primo = true;
        for (int num = 2; num <= 100; num++) {
            primo = true;
            for (int i = 2; i < num/2; i++) {
                if (num%i==0) {
                    primo = false;
                }
            }
            if (primo==true) {
                System.out.print(num+" ");
            }
        }
    }
}
