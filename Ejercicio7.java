public class Ejercicio7 {
    public static void main(String[] args) {
        int tries = 1;
        int key;
        boolean succes = false;
        do {
            System.out.print("Introduzca la clave numérica de la caja fuerte: ");
            key = Integer.parseInt(System.console().readLine());
            if (key == 1234) {
                succes = true;
            } else {
                System.out.println("Clave incorrecta");
                tries++;
            }
            
        } while(!succes&&tries<=4);
        if (succes) {
            System.out.println("Ha abierto la caja fuerte.");
        } else {
            System.out.println("Lo siento, ha agotado las 4 oportunidades.");
        }
    }
}