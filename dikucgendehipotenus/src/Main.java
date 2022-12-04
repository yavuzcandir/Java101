import java.util.Scanner;


public class Main {
    public static void main(String[] args) {

        Scanner sayi = new Scanner(System.in);

        double a,b,c;
        System.out.print("dikey uzunluğu giriniz: ");
        a =sayi.nextDouble();

        System.out.print("yatay uzunluğu giriniz: ");
        b = sayi.nextDouble();

        c = Math.sqrt((a*a)+(b*b));
        System.out.print("üçgenin hipotenüsü: " + c );
    }
}