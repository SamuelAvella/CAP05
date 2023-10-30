public class Ejercicio27 {
    public static void main(String[] args) {
        System.out.print("Introduce un número entero positivo: ");
        int num = Integer.parseInt(System.console().readLine());
        int counter = 0;
        int sum = 0;
        System.out.print("Los múltiplos de 3 entre 1 y "+num+" son:");
        for (int i = 1; i <= num; i++) {
            if (i%3==0) {
                System.out.print(i+" ");
                sum=sum+i;
                counter++;
            }
        }
        System.out.println("");
        System.out.printf("Entre 1 y %d hay %d múltiplos de 3 %n",num,counter);
        System.out.printf("La suma de todos los múltiplos de 3 anteriores es igual a %d",sum);
    }
}
