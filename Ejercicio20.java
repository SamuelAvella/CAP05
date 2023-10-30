public class Ejercicio20 {
    public static void main(String[] args) {
        System.out.print("Por favor, introduzca la altura de la pirámide: ");
        int altura = Integer.parseInt(System.console().readLine());
        System.out.print("Introduzca el carácter de relleno: ");
        String caracter = System.console().readLine();
        int altura2 = 1;
        int espacios1 = altura - 1;
        int espacios2 = 0;
        while (altura2 < altura) {
            for (int i = 1; i <= espacios1; i++) {
                System.out.print(" ");
            }
            System.out.print(caracter);
            for (int i = 1; i < espacios2; i++) {
                System.out.print(" ");
            }
            if (altura2>1) {
                System.out.print(caracter);
            }
            System.out.println();
            altura2++;
            espacios1--;
            espacios2 += 2;
        }
        for (int i = 1; i < altura2*2; i++) {
            System.out.print(caracter);
        }
    }
}
