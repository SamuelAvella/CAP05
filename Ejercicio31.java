public class Ejercicio31 {
    public static void main(String[] args) {
        System.out.print("Introduzca la altura de la L: ");
        int altura = Integer.parseInt(System.console().readLine());
        for (int i = 1; i <= altura; i++) {
            if (i<altura) {
                System.out.println("*");
            } else if(i==altura) {
                for (int j = 0; j < (altura/2)+1; j++) {
                    System.out.print("*");
                    System.out.print(" ");
                }
            }
        }
    }
}
