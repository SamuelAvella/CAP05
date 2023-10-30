public class Ejercicio8I2 {

    public static void table (int num){
        for (int i = 0; i <= 10; i++) {
            System.out.printf("%d x %d = %d\n",num, i, num*i);
        }
    }
    public static void main(String[] args) {
        boolean correct = false;
        while (!correct) {
            try {
                System.out.print("Introduzca un número y le mostrare la tabla de multiplicar: ");
                int num = Integer.parseInt(System.console().readLine());
                table(num);
            } catch (Exception e) {
                System.out.println("Lo siento no le he entendido. Pruebe otra vez.");
            }
        }
    }
}
