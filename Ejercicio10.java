public class Ejercicio10 {
    public static void main(String[] args) {
        boolean exit = false;
        System.out.println("Vaya introduciendo números: ");
        float num = 0f;
        float sum = 0f;
        int valores = 0;
        while (!exit) {
            try {
                num = Float.parseFloat(System.console().readLine());
                if (num<0) {
                    exit = true;
                } else {
                    valores++;
                    sum +=num;
                }    
            } catch (Exception e) {
                System.out.println("Lo siento, no lo he entendido.");
            }
        }
        System.out.printf("La media de estos número es %.2f%n", sum/valores);
    }
}
