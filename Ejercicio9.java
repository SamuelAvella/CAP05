public class Ejercicio9 {
    public static int lenghNum (int num) {
        int length = 0;
        while (num/10!=0) {
            num=num/10;
            length++;
        }
        return ++length;
    }
    public static void main(String[] args) {
        boolean correct = false;
        int num = 0;
        while (!correct) {
            try {
                System.out.print("Introduzca un número y le mostrare diré cuantos dígitos tiene: ");
                num = Integer.parseInt(System.console().readLine());
                correct = true;
            } catch (Exception e) {
                System.out.println("Lo siento no le he entendido. Pruebe otra vez.");
            }
        }
        System.out.printf("%d tiene %d digito/s",num,lenghNum(num));
    }
}
