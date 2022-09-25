import java.util.Scanner;

public class gectikaldıodev {
    public static void main(String[] args) {
        int mat, fizik, kimya, turkce, tarih, muzik;

        Scanner inp = new Scanner(System.in);
        System.out.print("Matematik Notunuzu Giriniz: ");
        mat = inp.nextInt();

        System.out.print("fizik Notunuzu Giriniz: ");
        fizik = inp.nextInt();

        System.out.print("kimya Notunuzu Giriniz: ");
        kimya = inp.nextInt();

        System.out.print("Turkce Notunuzu Giriniz: ");
        turkce = inp.nextInt();

        System.out.print("Tarih Notunuzu Giriniz: ");
        tarih = inp.nextInt();

        System.out.print("Muzik Notunuzu Giriniz: ");
        muzik = inp.nextInt();

        int toplam = (mat+fizik+kimya+turkce+tarih+muzik);
        double sonuc = toplam/6.0 ;
        System.out.print(sonuc);

        boolean kosul = sonuc >= 60;
        String gecme = kosul ? "Sınıfı Geçti" : "Sınıfta Kaldı";
        System.out.println(gecme);



    }
}

