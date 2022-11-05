import java.util.Scanner;

public class notOrtalamasi {
    public static void main(String[] args) {

    Scanner input = new Scanner(System.in);


        int matematik, fizik, kimya, turkce, tarih, muzik;

            System.out.print("Matematik notunu giriniz: ");
                matematik = input.nextInt();

            System.out.print("Fizik notunu giriniz: ");
                fizik =  input.nextInt();

            System.out.print("Kimya notunu giriniz: ");
                kimya = input.nextInt();

            System.out.print("Türkçe notunu giriniz: ");
                turkce = input.nextInt();

            System.out.print("Tarih notunu giriniz: ");
                tarih = input.nextInt();

            System.out.print("Müzik notunu giriniz: ");
                muzik = input.nextInt();

        int ortalama = ((matematik+fizik+kimya+turkce+tarih+muzik)/6);
            System.out.println( "Not ortalamanız:  "+ortalama);


            boolean sonuc=ortalama>=60;
            String gec=(sonuc) ? "TEBRİKLER! SINIFI GEÇTİNİZ." : "SINIFTA KALDINIZ.";
        System.out.println(gec);









    }
}
