package der09_ıfElseStatements;

import java.util.Scanner;

public class C02_BirimCevirme {
    public static void main(String[] args) {
        //*****************************************************************
        //Soru:Kullanıcıdan mesafeyi km olarak al
        //bunu çevirmek istedği birimi sor.
        //hangi birime çevirmek istiyorsa çevir ve yazdır.
        //bunun dışındaa bir ifade girierse "kayıtlı değil" yazdır.

        Scanner scan = new Scanner(System.in);
        System.out.println("Lütfen çevirmek istediğiniz ölçüyü km olarak yazınız");
        double mesafekm = scan.nextDouble();

        System.out.println(" çevirmek istediğiniz birimi m yada cm şeklinde yazınız");
        String birim = scan.next();

        if (birim.equalsIgnoreCase("m")) {
            System.out.println("mesafe  :" + mesafekm * 1000 + "  metredir");
        }else if (birim.equalsIgnoreCase("cm")) {
                   System.out.println("mesafe  :" + mesafekm *100000 + "  santimetredir");
        }else {
            System.out.println("girilen birim ,\nyada mesafe yanlıştır.");
        }

    }
}
