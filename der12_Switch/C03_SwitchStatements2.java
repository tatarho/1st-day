package der12_Switch;

import java.util.Scanner;

public class C03_SwitchStatements2 {
    public static void main(String[] args) {
        //Kullanıcıdan Gün numarası alıp Karşılığında hafta içi yada haftasonu yazdır.
        Scanner scan=new Scanner(System.in);
        System.out.println("lütfen gün numarası girin");
        int gunu= scan.nextInt();

        switch(gunu) {//long,double,float,bool olamaz.

            case 1:
            case 2:
            case 3:
            case 4:
            case 5:
                System.out.println("Haftaiçi");
                break;
            case 6:
            case 7:
                System.out.println("Haftasonu");
                break;
            default:
                System.out.println("girilen Gün Numarası Hatalıdır");
        }
    }
}
