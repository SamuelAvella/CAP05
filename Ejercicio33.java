public class Ejercicio33 {
    public static int solicitaValor(String question, String error){
        boolean validado = false;
        int valor = 0;
        while (!validado) {
            try {
                System.out.print(question);
                valor = Integer.parseInt(System.console().readLine());
                validado = true;
            } catch (Exception e) {
                System.out.println(error);
            }            
        }
        return valor;
    }
    public static void pintarU (int altura){
        for (int i = 1; i <= altura; i++) {
            if (i<altura) {
                System.out.print("* ");
                for (int j = 1; j < altura; j++)
                    System.out.print("  ");
                System.out.print("*");
            } else {
                System.out.print("  ");
                for(int j = 1; j < altura; j++)
                    System.out.print("* ");
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
        int altura = solicitaValor("Introduzca la altura de la U: ", "Por favor, introduzca una altura correcta");
        pintarU(altura);
    }
}
