public class Ejercicio29 {
    public static void main(String[] args) {
        int a = 0, b = 0;
        try {
            while (a<=0 && b<=0) {
                System.out.print("Por favor, introduzca un número entero positivo: ");
                a = Integer.parseInt(System.console().readLine());
                System.out.print("Ahora introduzca otro número entero positivo, para que se muestren los números positivos menores al anterior y que no sean divisibles por este: ");
                b = Integer.parseInt(System.console().readLine());
            }
        } catch (Exception e) {
            System.out.println("Se ha producido un error, intentelo de nuevo.");
        }
        System.out.printf("números positivos menores a %d y que no son divisibles por %d %n",a,b);
        for (int i = a-1; i > 0 ; i--) {
            if (i%b!=0) {
                System.out.print(i+" ");
            }
        }
    }
}
