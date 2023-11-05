public class Ejercicio32 {
    public static void main(String[] args) {
        System.out.print("Por favor, introduzca un número entero positivo: ");
        long num = Long.parseLong(System.console().readLine());
        System.out.print("Dígitos pares: ");
        int invertido = 0;
        boolean salida1 = false;
        while (!salida1) {
            int digito1 = (int)num%10;
            invertido = invertido * 10+digito1;
            if(num<10)
                salida1 = true;
            else
                num = num/10;
        }
        int digito2;
        boolean salida2 = false;
        int suma = 0;
        while (!salida2) {
            digito2 = (int) invertido%10;
            if (digito2%2==0) {
                System.out.print(digito2+" ");
                suma += digito2;
            }
            if(invertido<10)
                salida2 = true;
            else
                invertido = invertido/10;
        }
        System.out.println("");
        System.out.println("La suma de los dígitos pares es: "+suma);
    }
}
