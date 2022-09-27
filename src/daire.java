import java.util.Scanner;

public class daire {
    public static void main(String[] args) {

    int r;
    double pi=3.14;

    Scanner inp = new Scanner(System.in);
    System.out.print("Dairenin yarıçapını giriniz:");
    r =inp.nextInt();
    double  alan = pi * r * r , cevre= 2 * pi * r;

    System.out.println("Dairennin Alanı: " + alan);
    System.out.println("Dairennin Cevresi: " + cevre);

    int aci;
    System.out.print("Dilimin acisini giriniz:");
    aci =inp.nextInt();

    double acininalani = alan*aci/360 ;
    System.out.println("Daire diliminin Alanı: " + acininalani);


    }
}
