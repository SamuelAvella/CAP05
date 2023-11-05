public class Ejercicio30 {
    public static String solicitarDia (){
        boolean validado = false;
        String dia = "";
        while (!validado) {
            try {
                System.out.print("Día: ");
                dia = System.console().readLine();
                dia = dia.toLowerCase();
                switch (dia) {
                    case "lunes":
                    case "martes":
                    case "miércoles":
                    case "miercoles":
                    case "jueves":
                    case "viernes":
                    case "sabado":
                    case "sábado":
                    case "domingo":
                        validado = true;
                        break;
                    default:
                        break;
                }
            } catch (Exception e) {

            }
        }
        return dia;
    }
    public static int solicitarHora(){
        boolean validado = false;
        int hora=0;
        while (!validado) {
            try {
                System.out.print("Hora: ");
                hora = Integer.parseInt(System.console().readLine());
                if (hora<0 || hora >23) {
                    System.out.println("Por favor, introduzca una hora correcta [0..23]:");
                } else {
                    validado = true;
                }
            } catch (Exception e) {
                System.out.println("Por favor, introduzca una hora correcta [0..23]:");
            }
        }
        return hora;
    }
    public static int convertirDia (String dia){
        boolean validado = false;
        int diaInt = 0;
        while (!validado) {
            try {
                switch (dia) {
                    case "lunes":
                    diaInt = 1;
                    case "martes":
                    diaInt = 2;
                    case "miércoles":
                    case "miercoles":
                    diaInt = 3;
                    case "jueves":
                    diaInt = 4;
                    case "viernes":
                    diaInt = 5;
                    case "sabado":
                    case "sábado":
                    diaInt = 6;
                    case "domingo":
                    diaInt = 7;
                        validado = true;
                        break;
                    default:
                        break;
                }
            } catch (Exception e) {

            }
        }
        return diaInt;
    }
    public static void main(String[] args) {
        System.out.print("Por favor, introduzca la primera hora:");
        String dia1 = solicitarDia();
        int dia1Int = convertirDia(dia1);
        int hora1 = solicitarHora();
        System.out.print("Por favor, introduzca la segunda hora:");
        String dia2 = solicitarDia();
        int dia2Int = convertirDia(dia2);
        int hora2 = solicitarHora();
        if (dia1Int > dia2Int || (dia1Int == dia2Int && hora1 > hora2)) {
            System.out.println("Lo siento el dái de inicio debe ser anterior al día fin.");
        } else {
            
        }
    }
}
