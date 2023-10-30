public class Ejercicio2 {
    public static void main(String[] args) {
        System.out.println("Los números múltiplos de 5 de 0 a 100:");
        int i = 1;
        while (i <=100) {
            if(i%5==0){
                System.out.print(i+", ");
            }
            i++;
        }
    }
}
