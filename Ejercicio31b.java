public class Ejercicio31b {
    public static int solicitarHora(){
        boolean validado = false;
        int altura = 0;
        while (!validado) {
            try {
                System.out.print("Introduzca la altura de la L: ");
                altura = Integer.parseInt(System.console().readLine());
                if (altura<3) {
                    System.out.println("Por favor, introduzca una altura correcta [h>3]:");
                } else {
                    validado = true;
                }
            } catch (Exception e) {
                System.out.println("Por favor, introduzca una altura correcta [h>3]:");
            }
        }
        return altura;
    }
    public static void pintarELE (int altura){
        for (int i = 1; i <= altura; i++)
            if (i<altura) 
                System.out.println("*");
            else if(i==altura) 
                for (int j = 0; j < (altura/2)+1; j++) 
                    System.out.print("*");
                    System.out.print(" ");
    }
    public static void main(String[] args) {
        
    }
}
