public class Ejercicio25 {
    public static int inverso (int num){
        int invertido = 0;
        boolean salida = false;
        while (!salida) {
            int digito = num%10;
            invertido = invertido * 10+digito;
            if(num<10)
                salida = true;
            else
                num = num/10;
        }
        return invertido;
    }
    public static void main(String[] args) {
        System.out.print("Introduce un número entero: ");
        int num = Integer.parseInt(System.console().readLine());
        System.out.println("Si escribimos al revés "+num+" tenemos el "+inverso(num));
    }
}