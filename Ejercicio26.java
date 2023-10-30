public class Ejercicio26 {
    public static void main(String[] args) {
        System.out.print("Introduzca un número entero: ");
        int num = Integer.parseInt(System.console().readLine());
        System.out.print("Introduzca un dígito: ");
        int digito = Integer.parseInt(System.console().readLine());
        System.out.print("Contando de izquierda a derecha, el " + digito + " aparece dentro de " +num + " en las siguientes posiciones: ");
        int numero = num;
        int inverso = 0;
        int longitud = 0;
        int posicion = 1;
        if (numero == 0) {
            longitud = 1;
        }
        try {
            while (numero > 0) {
                inverso = (inverso * 10) + (numero % 10);
                numero /= 10;
                longitud++;
            }
            while (inverso > 0) {
                if ((inverso % 10) == digito) {
                    System.out.print(posicion + " ");
                }
                inverso /= 10;
                posicion++;
        }
        } catch (Exception e) {
            System.out.print("Ha ocurrido un error inesperado, inténtelo de nuevo");
        }
        System.out.println();
    }
}
