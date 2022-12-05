import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner inp = new Scanner(System.in);

        int weight;
        double indeks,size;

        System.out.print("lütfen boyunuzu metre cinsinden giriniz: ");
        size = inp.nextDouble();

        System.out.print("lütfen kilonuzu kilogram olarak giriniz giriniz: ");
        weight = inp.nextInt();

        indeks = (weight/(size*size));
        System.out.print("Vucüt kitle endeksiniz: " + indeks);

    }
}