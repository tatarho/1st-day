package der10_nestedIfElse;

import java.util.Scanner;

public class C02_nestedifels {
    public static void main(String[] args) {
//SORU: Kullanıcıdan cinsiyet ve yaş  iste ,erkek ise 65 yaşında ,kadın ise 61 yaşında emekli oluyor.
// durumlarını yazdır.
        Scanner scan = new Scanner(System.in);
        System.out.println("lütfen cinsiyet giriniz");
        String cinsiyet = scan.nextLine();
        System.out.println("lütfen yaşınızı giriniz");
        double yas = scan.nextDouble();

        if(yas > 100 || yas < 0){System.out.println("Geçersiz yaş girişi");}
        else if(!(cinsiyet.equalsIgnoreCase("Bayan") || cinsiyet.equalsIgnoreCase("bay"))){
            System.out.println("Geçersiz cinsiyet girişi");}
        else if (cinsiyet.equalsIgnoreCase("Bayan")&&yas>61) {System.out.println("emekli olma hakkını " + (yas-61) + " yıl önce elde etmişsiniz.");}
        else if (cinsiyet.equalsIgnoreCase("Bayan")&&yas==61) {System.out.println(" yaşınız " + yas + "  olduğu için emekli olma hakkını elde etmişsiniz.");}
        else if (cinsiyet.equalsIgnoreCase("Bayan")&&yas<61) {System.out.println("emekli olmanıza daha " + (61-yas) + "  yıl var.");}
        else if (cinsiyet.equalsIgnoreCase("Bay")&&yas<65) {System.out.println("emekli olmanıza daha " + (65-yas) + "  yıl var.");}
        else if (cinsiyet.equalsIgnoreCase("Bay")&&yas==65) {System.out.println(" yaşınız " + yas + "  olduğu için emekli olma hakkını elde etmişsiniz.");}
        else if (cinsiyet.equalsIgnoreCase("Bay")&&yas<65) {System.out.println("emekli olmanıza daha " + (65-yas) + "  yıl var.");}

    }
}
