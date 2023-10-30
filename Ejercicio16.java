public class Ejercicio16 {
    public static boolean Primo(int num){
        boolean primo = true;
        for(int i = 2;i<=(num/2) && primo;i++){
            if(num%i==0)
                primo = false;
        }
        return primo;
    }
    public static void main(String[] args) {
        System.out.print("Introduce un número entero: ");
        int num = Integer.parseInt(System.console().readLine());
        if (Primo(num)) {
            System.out.print("El número "+num+" es primo");
        } else {
            System.out.print("El número "+num+" no es primo");
        }
    }
}

