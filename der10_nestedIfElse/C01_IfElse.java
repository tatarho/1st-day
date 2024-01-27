package der10_nestedIfElse;

import java.util.Scanner;

public class  C01_IfElse {
    public static void main(String[] args) {
//***********************************************************************************************************
//SORU: Kullanıcıdan cinsiyet ve yaş  iste ,erkek ise 65 yaşında ,kadın ise 61 yaşında emekli oluyor.
// durumlarını yazdır.
        Scanner scan = new Scanner(System.in);
        System.out.println("Lütfen cinsiyetinizi 'kadın' ya da 'erkek' şeklinde giriniz");
        String cinsiyet = scan.nextLine();
        System.out.println("Lütfen yaşınızı sayı olarak giriniz");
        double yas = scan.nextInt();
        if (cinsiyet.equalsIgnoreCase("kadın")) {

            if((yas<0)||(yas>90)){System.out.println("hatalı yaş girişi");}

            else if (yas == 61) {System.out.println(" yaşınız " + yas + "  olduğu için emekli olma hakkını elde etmişsiniz.");}
            else if (yas > 61) {System.out.println("emekli olma hakkını " + (yas - 61) + " yıl önce elde etmişsiniz.");}
            else if (yas < 61) {System.out.println("emekli olma hakkınıza " + ( 61-yas ) + " yıl var.");}

        }
        //else{System.out.println("yanlış cinsiyet girişi ");}

        if (cinsiyet.equalsIgnoreCase("erkek")) {

            if((yas<0)||(yas>90)){System.out.println("hatalı yaş girişi");}

            else if (yas == 65) {System.out.println(" yaşınız " + yas + "  olduğu için emekli olma hakkını elde etmişsiniz.");}
            else if (yas > 65) {System.out.println("emekli olma hakkını " + (yas - 65) + " yıl önce elde etmişsiniz.");}
            else if (yas < 65) {System.out.println("emekli olma hakkınıza " + ( 65-yas ) + " yıl var.");}


        }
        else{System.out.println("yanlış cinsiyet girişi ");}
    }

}