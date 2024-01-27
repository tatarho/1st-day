package der09_ıfElseStatements;

import java.util.Scanner;

public class C03_VucutKitleEndexi {
    public static void main(String[] args) {
//        soru:
//        kullanıcıdan kilo[ kg]ve boyunu.(m) isteyin
//        vke hesaplayın (kilo * 10000 / boy * boy)
//        vke 30 dan fazla çıkarsa obezsiniz
//        25 - 30 kilolusunuz
//        20 - 25 normalsiniz
//        20 den az sa zayıfsınız yazdırı.

        Scanner scan = new Scanner(System.in);
        System.out.println("Lütfen boyunuzu cm cinsinden giriniz");
        int boy = scan.nextInt();
        System.out.println("Lütfen kilonuzu kg cinsinden giriniz");
        double kilo = scan.nextDouble();
        double vke = kilo * 10000 / (boy * boy);

        if (vke>50||vke<10) {
            System.out.println("geçersiz bilgi girişi");
        }
       else  if (vke >= 30) {
            System.out.println("kitle endexiniz " + vke + " ve 30+ olduğu için obezsiniz");
        }
        else if (vke >=25) {
            System.out.println("kitle endexiniz " + vke + " ve 25-30 olduğu için kilolusunuz ");
        }
        else if (vke >=20) {
            System.out.println("kitle endexiniz " + vke + " ve 20-25 olduğu için  normalsiniz");
        }
       else {
            System.out.println("kitle endexiniz " + vke + " ve 20- olduğu için zayıfsınız ");
        }
//        else {
//            System.out.println("");
//        }

    }
}
