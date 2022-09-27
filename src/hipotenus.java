import java.util.Scanner;

public class hipotenus {
    public static void main(String[] args) {
        double a, b, c, u, A;

        Scanner inp = new Scanner(System.in);
        System.out.print("a Kenar Uzunlugunu Giriniz: ");
        a = inp.nextDouble();

        System.out.print("b kenar Uzunlugunu Giriniz: ");
        b = inp.nextDouble();

        System.out.print("c kenar Uzunlugunu Giriniz: ");
        c = inp.nextDouble();

        u = (a+b+c)/2;
        A = Math.sqrt(u*(u-a)*(u-b)*(u-c));
        System.out.print("u :" +u);
        System.out.println(" Alan :" +A);






    }
}
