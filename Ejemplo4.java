import java.util.Scanner;
public class Ejemplo4 {
    public static boolean esPrimo(int contador){
        boolean primo = true;
        if (contador<2) {
           primo=false; 
        } else {
            for(int i = 2;i<=(contador/2) && primo;i++){
                if(contador%i==0)
                    primo = false;
            }
        }
        return primo;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("¿Cuantos primos quieres?: ");
        int numprimos = sc.nextInt();
        int contador = 0;
        int i = 0;
        while(i<=numprimos){
            if(esPrimo(i)){
                contador++;
                System.out.print(i+" ");
            }
            i++;
        }
        sc.close();
    }
}
