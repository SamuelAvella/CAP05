public class Ejercicio14 {
    public static int exponent (int num, int exp){
        int potencia=1;
        for (int i = 0; i<exp; i++) {
            potencia *=num;
        }
        return potencia;
    }
    public static void main(String[] args) {
        System.out.println("Introduzca un número base:");
        int num = Integer.parseInt(System.console().readLine());
        System.out.println("Introduzca un número positivio que sera el exponente:");
        int exp = Integer.parseInt(System.console().readLine());
        System.out.println("La potencia de "+num+" ^ "+exp+" = "+exponent(num, exp));
    }
}
