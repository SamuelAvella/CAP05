public class Ejercicio28 {
    public static int factorial (int num){
        int i = 1;
        int factorial = 1;
        do {
            factorial*=i;
            i++;
        } while (i<=num);
        return factorial;
    }
    public static void main(String[] args) {
        try {
            int num = 0;
            do {
                System.out.print("Por favor, introduzca un número entero: ");
                num = Integer.parseInt(System.console().readLine());
                if (num<0) {
                    System.out.println("Por favor, introduzca un número entero positivo.");
                }
            } while (num<0);
            System.out.printf("!%d = %d",num,factorial(num));
        } catch (Exception e) {
            System.out.println("Se ha producido un error inténtelo de nuevo.");
        }
    }
}
