import java.util.Scanner;

public class vucutkitleindeksi {
    public static void main(String[] args) {
        double m, kg, vki;

        Scanner inp = new Scanner(System.in);
        System.out.print("Lütfen Boyunuzu metre cinsinden giriniz: ");
        m = inp.nextDouble();

        System.out.print("Lütfen kilonuzu giriniz: ");
        kg = inp.nextDouble();

        vki = (kg/(m*m));
        System.out.print("Vucut kitle endeksiniz :" +vki);


    }
}
