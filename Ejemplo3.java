import java.util.Scanner;
public class Ejemplo3 {
    public static boolean esMultpilo(int a, int b){
        return (a%b)==0;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Introduce dos números: ");
        int a = Integer.parseInt(System.console().readLine());
        int b = Integer.parseInt(System.console().readLine());
        if (esMultpilo(a, b)) {
            System.out.println(a+" es divisor de "+b);
        } else {
            System.out.println(a+" no es divisor de "+b);
        }
        sc.close();
    }
}
