public class Ejercicio25 {
    public static void main(String[] args) {
        System.out.print("Introduce un número entero: ");
        int num = Integer.parseInt(System.console().readLine());
        int i = num;
        int inverso = 0;
        while (i>0) {
            inverso = (inverso*10)+(i%10);
            i /= 10;
        }
        System.out.println("Si escribimos al revés " +num+ " tenemos el " +inverso);
    }
}