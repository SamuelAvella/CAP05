public class Ejercicio32b {
    public static long inverso (long num){
        long invertido = 0;
        boolean salida = false;
        while (!salida) {
            int digito = (int)num%10;
            invertido = invertido * 10+digito;
            if(num<10)
                salida = true;
            else
                num = num/10;
        }
        return invertido;
    }
    public static long solicitaValor(){
        boolean validado = false;
        long num = 0;
        while (!validado) {
            try {
                System.out.print("Por favor, introduzca un número correcto: ");
                num = Integer.parseInt(System.console().readLine());
                validado = true;
            } catch (Exception e) {
                System.out.print("Por favor, introduzca un número correcto: ");
            }            
        }
        return num;
    }
    public static String printPares (long num){
        String res = "";
        boolean salida = false;
        while (!salida) {
            int digito = (int)num%10;
            if (digito%2==0) {
                res+=digito+" ";
            }
            if(num<10)
                salida = true;
            else
                num = num/10;
        }
        return res;
    }
    public static int sumPares (long num){
        int sum;
        return 2;
    }
    public static void main(String[] args) {
        long num = solicitaValor();
        num = inverso(num);
        System.out.printf("Dígitos pares: %s%n",printPares(num));
        System.out.printf("Suma de los pares: %d",sumPares(num));
    }
}
