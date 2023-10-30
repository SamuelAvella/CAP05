public class Ejercicio19l2 {
    public static void piramide (String caracter, int altura){
        for (int i = altura; i >= 1; i--) {
            for (int j = 1; j <= (2*altura-i-1); j++) {
                System.out.print(" ");
            }
            for (int j = 1; j <= (2*i-1); j++) {
                System.out.print(caracter);
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
        System.out.print("Por favor, introduzca la altura de la pirámide: ");
        int altura = Integer.parseInt(System.console().readLine());
        System.out.print("Introduzca el carácter de relleno: ");
        String caracter = System.console().readLine();
        piramide(caracter, altura);
    }
}
