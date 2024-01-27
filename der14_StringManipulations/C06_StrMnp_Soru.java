package der14_StringManipulations;

import javax.swing.*;
import java.util.Scanner;


public class C06_StrMnp_Soru {
    public static void main(String[] args) {
//        //kullanıcıdan bir mail adresi al
//        //@ içermiyorsa"@ içermiyor"
//        //@gmail içermiyorsa"mail gmail içermiyo"
//        //@gmail.com ile bitmiyorsa"@gmail.com ile bitmeli" yazdır.
        Scanner scanner = new Scanner(System.in);
//        System.out.println("Lütfen mail adersini ..@mail.com şeklinde giriniz");
//        String mail = scanner.nextLine();
//
////       if (!mail.contains("@")) {System.out.println("@ içermiyor");}
////
////       else if (!mail.contains("@gmail")){System.out.println("@gmail içermiyor.");}
////
////       else if (!mail.endsWith("@gmail.com")){ System.out.println("mailinizin sonu @gmail.com ile bitmiyor."); }
////
////       else{ System.out.println("mailiniz doğru girilmiştir."); }
////
////       //if else kullanırsak;++++ sı sonuna mailiniz doğru girilmiştir ifadesi yazdırabiliriz
////        //                  ;---- si ilk şarı karşılamıyorsa diğerlerini gezmez.
//
//        int flag=0;
//        if (!mail.contains("@")) {System.out.println("@ içermiyor");flag++;}
//
//        else if (!mail.contains("@gmail")){System.out.println("@gmail içermiyor.");flag++;}
//
//       else if (!mail.endsWith("@gmail.com")){ System.out.println("mailinizin sonu @gmail.com ile bitmiyor."); }
//       else{
//            System.out.println("geçersiz giriş");
//       }
//        if(flag==0){System.out.println("mailiniz doğru girilmiştir.");
//        }
//
//
//        //       //bağımsız if kullanırsak;++++ sı bütün seçenekleri gezer
////        //                  ;---- si flag kullanırsak ancak mailiniz doğru girilmiştir ifadesi yazdırabiliriz
//
//        System.out.println("1.......................................");
//
//       //*************************************************************************
//        // *Soru:Kullanıcıdan isim ve soy ismini ayrı ayrı alın
//        //        isim daha uzun ise
//        //        isim ve soy ismin ilkharflerini büyük kalanlarını küçük olarak yazdırın
//        //        soy isim uzun ise
//        //        isimin ilkharfini büyük kalanlarını küçük soy ismi büyük yazdırın
//
//        System.out.println("Lütfen isminizi giriniz");
//        String isim=scanner.nextLine();
//        System.out.println("lütfen soyadınızı giriniz");
//        String soyisim=scanner.nextLine();
////        char ilkharfisim=isim.charAt(0);
////        char ilkharfsoyisim=soyisim.charAt(0);
////        String kalanisim=isim.substring(1,isim.length());
////        String kalansoyisim=soyisim.substring(1,soyisim.length());
////        String kucukkalanisim=kalanisim.toLowerCase();
////        String kucukkalansoyisim=kalansoyisim.toLowerCase();
////        String buyuksoyisim=soyisim.toUpperCase();
//
//
////        if(isim.length()>soyisim.length()){
////            System.out.println(Character.toUpperCase(ilkharfisim)+kucukkalanisim+" "+Character.toUpperCase(ilkharfsoyisim)+kucukkalansoyisim);
////        } else{
////            System.out.println(Character.toUpperCase(ilkharfisim)+kucukkalanisim+" "+buyuksoyisim);
//        if(isim.length()>soyisim.length()){
//            System.out.println(isim.substring(0,1).toUpperCase()+isim.substring(1).toLowerCase()
//                    +" "+
//                    (soyisim.substring(0,1).toUpperCase()+soyisim.substring(1).toLowerCase()));
//
//        }if(isim.length()<soyisim.length()){
//
//            System.out.println(isim.substring(0,1).toUpperCase()+isim.substring(1).toLowerCase()
//            +" " +soyisim.toUpperCase());
//        }
//
//        System.out.println("2..............................................");
//
//
//        //*************************************************************************
//        //        soru:
////        Kullanıcıdan bir cümle al
////        Stringin uzunluğu (index) çift sayı ise
////        tam ortasına :) ekle
////        tek sayı ise
////        tam ortasındaki harfi sil yerine :( yazdır.
////
//        System.out.println("lütfen bir cümle giriniz");
//        String cumles = scanner.nextLine();
//
//        if (cumles.length() % 2 == 0) {
//
//            cumles = cumles.substring(0, cumles.length() / 2)
//                    + ":)" +
//                    cumles.substring(cumles.length() / 2);
//
//        } else {
//            cumles = cumles.substring(0, cumles.length() / 2)
//                    + ":(" +
//                    cumles.substring((cumles.length() + 1) / 2);
//
//        }
//        System.out.println(cumles);
//
//
//        System.out.println("3.......................................");

        //***********************************************************************
        // **soru:Kullannıcıdan isim soyisim ve kredi kkartı no al
        //        görünürIsim olarak A****** N***** şeklinde
        //         sadece ilk harflaer görünsün
        //        görünür kart no:**** **** **** 1234 olsun

        System.out.println("lütfen isim giriniz");
        String ad= scanner.nextLine();
        String adkalan=ad.substring(1);
        adkalan=adkalan.replaceAll("\\w","*");

        System.out.println("ve soyisim giriniz.");
        String soyad=scanner.nextLine();
        String soyadkalan=soyad.substring(1);
        soyadkalan=soyadkalan.replaceAll("\\w","*") ;

        System.out.println("lütfen kart no giriniz.");
        String kartno= scanner.nextLine();

        String kartnoce=kartno.substring(0,14);
        kartnoce=kartnoce.replaceAll("\\d","*");


        System.out.println(ad.substring(0,1).toUpperCase()+adkalan+" "+soyad.substring(0,1).toUpperCase()+soyadkalan+"\n"+kartnoce+kartno.substring(kartno.length()-4));



        System.out.println("4.......................................");





        }


    }

