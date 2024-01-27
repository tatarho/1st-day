package der12_Switch;

import java.util.Scanner;

public class C02_SwitchStatements {
    public static void main(String[] args) {
        //Kullanıcıdan Gün numarası alıp Karşılığında gün adını yazdır.
        Scanner scan=new Scanner(System.in);
        System.out.println("lütfen gün numarası girin");
        int gunu= scan.nextInt();

        switch(gunu) {

            case 1:
                System.out.println("Pazartesi"); break;
            case 2:
                System.out.println("Salı");  break;
            case 3:
                System.out.println("Çarşamba");break;
            case 4:
                System.out.println("Perşembe");break;
            case 5:
                System.out.println("Cuma");break;
            case 6:
                System.out.println("Cumartesi");break;
            case 7:
                System.out.println("Pazar");break;
            default:
                System.out.println("girilen Gün Numarası Hatalıdır");
        }

    }
}
