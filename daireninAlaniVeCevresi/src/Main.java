import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner inp = new Scanner(System.in);

        double pi=3.14,r,a,area,environment;


        System.out.print("dairenin yarıçapı giriniz: ");
        r = inp.nextDouble();

        System.out.print("dairenizin merkez açısının ölçüsünü giriniz: ");
        a = inp.nextDouble();

        environment = (pi*(r*r)*a)/360;
        System.out.println("dairenizin çevresi: " + environment);

        area = (pi*r*r);
        System.out.print("dairenizin alanı: " + area);





    }
}