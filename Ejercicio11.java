public class Ejercicio11 {
    public static int lenghNum (long num) {
        int length = 0;
        while (num/10!=0) {
            num=num/10;
            length++;
        }
        return ++length;
    }
    public static void main(String[] args) {
        System.out.println("Vaya introduciendo números:");
        int num = Integer.parseInt(System.console().readLine());
        int longitudMayor = lenghNum((long)Math.pow(num+4,3));
        System.out.printf("%"+(longitudMayor-2)/2+"s%s%"+(longitudMayor-2)/2+"s|%"+(longitudMayor-2)/2+"s%s%"+(longitudMayor-2)/2+"s|%"+(longitudMayor-2)/2+"s%s%"+(longitudMayor-2)/2+"s%n", "","n ","","","n\u00b2","","","n\u00b3","");
        for (int i = 1; i <= 5; i++) {
            System.out.printf("%"+(longitudMayor-1)+"d |%"+(longitudMayor-1)+"d |%"+longitudMayor+"d%n", num, num*num, num*num*num);
        }
    }   
}