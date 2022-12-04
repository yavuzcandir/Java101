import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);

        int km;
        double total,startPrice=10,priceKm=2.20;

        System.out.print("gidilen kilometreyi giriniz: ");
        km = inp.nextInt();

        total = startPrice+(km*priceKm);

        total = (total<20) ? 20 : total;

        System.out.println("ücretiniz: "+ total);

    }
}