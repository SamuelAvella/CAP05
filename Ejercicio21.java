public class Ejercicio21 {
    public static void main(String[] args) {
        System.out.println("Por favor, vaya introduciendo números enteros.");
        System.out.println("Puede terminar mediante la introducción de un número negativo.");
        int num;
        int contador = 0;
        int suma = 0;
        int contadorimpares = 0;
        int ParAlto = 0;
        do {
            num = Integer.parseInt(System.console().readLine());
            if (num >= 0) {
                contador++;
                if ((num % 2) != 0) {
                suma += num;
                contadorimpares++;
                } else {
                if (num > ParAlto)
                ParAlto = num;
                }
            }
        } while (num >= 0);
        System.out.println("Se han registrado " + contador + " números");
        System.out.println("La media de los impares es " + suma/contadorimpares);
        System.out.println("El máximo de los pares es " + ParAlto);
    }
}
