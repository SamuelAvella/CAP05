public class Ejercicio36 {
    public static long inverso (long valor){
        long invertido = 0;
        boolean salida = false;
        while (!salida) {
            int digito = (int)valor%10;
            invertido = invertido * 10+digito;
            if(valor<10)
                salida = true;
            else
                valor = valor/10;
        }
        return invertido;
    }
    public static long solicitaValor(String question, String error){
        boolean validado = false;
        long valor = 0;
        while (!validado) {
            try {
                System.out.print(question);
                valor = Long.parseLong(System.console().readLine());
                validado = true;
            } catch (Exception e) {
                System.out.print(error);
            }            
        }
        return valor;
    }
    public static void main(String[] args) {
        boolean validado = false;
        long valor = 0;
        while (!validado) {
            valor = solicitaValor("Por favor, introduzca un valor", "Error, vuelva a introducirlo");
            if (valor<0)
                System.out.println("Error");
            else
                validado = true;
        }
    }
}
