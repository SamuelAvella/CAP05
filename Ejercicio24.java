public class Ejercicio24 {
    public static void main(String[] args) {
        System.out.println("Este programa pinta una pirámide hecha a base de números.");
        System.out.print("Por favor, introduzca la altura de la pirámide: ");
        int altura1 = Integer.parseInt(System.console().readLine());
        int altura2 = 1;
        int espacios = altura1 - 1;
        while (altura2 <= altura1) {
            for (int i = 1; i <= espacios; i++) {
                System.out.print(" ");
            }
            for (int i = 1; i < altura2; i++) {
                System.out.print(i);
            }
            for (int i = altura2; i > 0; i--) {
                System.out.print(i);
            }
            System.out.println();
            altura2++;
            espacios--;
        } 
    }
}
