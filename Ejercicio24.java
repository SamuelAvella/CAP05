public class Ejercicio24 {
    public static void main(String[] args) {
        System.out.println("Este programa pinta una pirámide hecha a base de números.");
        System.out.print("Por favor, introduzca la altura de la pirámide: ");
        int alturadeseada = Integer.parseInt(System.console().readLine());
        int alturacontador = 1;
        int espacios = alturadeseada - 1;
        while (alturacontador <= alturadeseada) {
            for (int i = 1; i <= espacios; i++) {
                System.out.print(" ");
            }
            for (int i = 1; i < alturacontador; i++) {
                System.out.print(i);
            }
            for (int i = alturacontador; i > 0; i--) {
                System.out.print(i);
            }
            System.out.println();
            alturacontador++;
            espacios--;
        } 
    }
}
