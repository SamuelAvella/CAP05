public class Ejercicio15 {
    public static void main(String[] args) {
        System.out.println("Introduzca un número base:");
        int num = Integer.parseInt(System.console().readLine());
        System.out.println("Introduzca un número positivio que sera el exponente:");
        int exp = Integer.parseInt(System.console().readLine());
        System.out.print("Las "+exp+" primeras potencia de "+num+" son: ");
        int potencia=1;
        for (int i = 0; i<exp; i++) {
            potencia *=num;
            System.out.print(potencia+", ");
        }
    }
}
