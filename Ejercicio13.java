public class Ejercicio13 {
    public static void main(String[] args) {
        System.out.println("Por favor, introduzca 10 números enteros: ");
        int negativos = 0, positivos = 0;
        for (int i = 0; i < 10; i++) {
            int num = Integer.parseInt(System.console().readLine());
            if (num < 0) {
                negativos++;
            } else {
                positivos++;
            }
        }
        System.out.println("Ha introducido " + positivos + " positivos y " + negativos + " negativos");
    }
}
