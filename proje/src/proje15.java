import java.util.Scanner;

public class proje15 {

    public static void main(String[] args) {

        Scanner giris=new Scanner(System.in);
        int a,b;
        double x1;
        System.out.println("Birinci dereceden denklemin kökünü bulma");
        System.out.println("ax+b=0\n");
        System.out.print("a değerini giriniz=");
        a=giris.nextInt();
        System.out.print("b değerini giriniz=");
        b=giris.nextInt();
        x1=-b/a;
        System.out.println("x1="+x1);
    }
}
