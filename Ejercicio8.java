public class Ejercicio8 {
    public static void main(String[] args) {
        System.out.print("Introduzca un número: ");
        int i = Integer.parseInt(System.console().readLine());
        for (int j = 1; j <= 10; j++) {
            System.out.println(i+"*"+j+" = "+i*j);
        }
    }
}
