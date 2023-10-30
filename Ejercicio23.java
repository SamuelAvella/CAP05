public class Ejercicio23 {
    public static void main(String[] args) {
        System.out.println("Por favor, vaya introduciendo números.");
        System.out.println("El programa terminará cuando la suma de los números sea mayor que 10000.");
        int num;
        int suma = 0;
        int cont = 0;
        do {
            num = Integer.parseInt(System.console().readLine());
            suma += num;
            cont++;
        } while (suma <= 10000);
        System.out.println("Ha introducido un total de " + cont + " números.");
        System.out.println("La suma total es " + suma + ".");
        System.out.println("La media es " + suma / cont + ".");
            }
}
