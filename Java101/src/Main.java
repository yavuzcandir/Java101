import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner inp = new Scanner(System.in);
            double kdv,urunfiyat,kdvlifiyat,kdvlifiyat2;
            kdv = 0.18;

        System.out.print("ürünün fiyatını giriniz: ");
          urunfiyat =  inp.nextDouble();
            kdvlifiyat = (urunfiyat*kdv);

        System.out.print("KDV tutarınız: ");
        System.out.println(kdvlifiyat);

        kdvlifiyat2 = urunfiyat + kdvlifiyat;
        System.out.print("KDV'li fiyat: ");
        System.out.print(kdvlifiyat2);




    }
}