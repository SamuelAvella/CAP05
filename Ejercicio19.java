public class Ejercicio19 {
    public static void main(String[] args) {
        System.out.print("Por favor, introduzca la altura de la pirámide: ");
        int altura = Integer.parseInt(System.console().readLine());
        System.out.print("Introduzca el carácter de relleno: ");
        String caracter = System.console().readLine();
        int base = 1;
        int ancho = 1;
        int espacios = altura;
        while (base<=altura) {
            for (int i = 0; i < espacios; i++) {
                System.out.print(" ");
            }
            for (int i = 0; i < ancho; i++) {
                System.out.print(caracter);
            }
            base++;
            espacios--;
            ancho+=2;
            System.out.println();
        }
    }
}
