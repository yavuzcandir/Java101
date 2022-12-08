import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner inp= new Scanner(System.in);

        double armut=2.14,elma=3.67,domates=1.11,muz=0.95,patlican=5.00,ucret;
        double armutKg,elmaKg,domatesKg,muzKg,patlicanKg;

        System.out.print("kaç kilo armut aldınız: ");
        armutKg = inp.nextDouble();

        System.out.print("kaç kilo elma aldınız: ");
        elmaKg = inp.nextDouble();

        System.out.print("kaç kilo domates aldınız: ");
        domatesKg = inp.nextDouble();

        System.out.print("kaç kilo muz aldınız: ");
        muzKg = inp.nextDouble();

        System.out.print("kaç kilo patlaıcan aldınız: ");
        patlicanKg = inp.nextDouble();

        ucret =(armutKg*armut)+(elmaKg*elma)+(domatesKg*domates)+(muzKg*muz)+(patlicanKg*patlican);
        System.out.println(ucret);




    }
}