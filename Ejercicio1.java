public class Ejercicio1{
    public static void main(String[] args) {
        System.out.println("Los números múltiplos de 5 de 0 a 100:");
        for (int i = 5;i<=100;i++){
            if(i%5==0)
                System.out.print(i+", ");
        }
    }
}