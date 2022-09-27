import java.util.Scanner;

public class manav {
    public static void main(String[] args) {
        double a, e, d, m, p, t;

        Scanner inp = new Scanner(System.in);
        System.out.print("Armut Kaç kilo: ");
        a = inp.nextDouble();

        System.out.print("Elma Kaç kilo: ");
        e = inp.nextDouble();

        System.out.print("Domates Kaç kilo: ");
        d = inp.nextDouble();

        System.out.print("Muz Kaç kilo: ");
        m = inp.nextDouble();

        System.out.print("Patlıcan Kaç kilo: ");
        p = inp.nextDouble();

        t = ((a*2.14)+(e*3.67)+(d*1.11)+(m*0.95)+(p*5));
        System.out.print("Toplam Tutar :" +t);




    }
}
