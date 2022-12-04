import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);

        int a,b,c;
        double environment,area;


        System.out.print("üçgenin ilk kenarını giriniz: ");
        a= inp.nextInt();
        System.out.print("üçgenin ikinci kenarını giriniz: ");
        b= inp.nextInt();

        System.out.print("üçgenin üçüncü kenarını giriniz: ");
        c = inp.nextInt();

        environment = (a+b+c)/2;
        area = Math.sqrt( environment*(environment-a)*(environment-b)*(environment-c));

        System.out.print("üçgeninizin alanı: " + area);



    }
}