package der11_ternaryOperator;

import java.util.Scanner;

public class C01_NestedTernary {
    public static void main(String[] args) {
//**************************************************************************************
//Kullanıcıdan bir sayı iste,sayıyı kontrol et,5 e tam bölünüyorsa ve bölünemez yazdır.


        Scanner scan=new Scanner(System.in);
//        System.out.println("bir pozitif tamsayı giriniz");
//        int sayi=scan.nextInt();
//
//        System.out.println(sayi%5==0?"sayı 5 in tam katıdır.":"5 in tam katı değildir.");
//
////**************************************************************************************
////Kullanıcıdan bir harf iste,harfi kontrol et, küçükse büyüğe çevir,büyükse aynısını yazdır.
//        System.out.println("bir harf giriniz");
//        char harf=scan.next().charAt(0);
//
//        System.out.println(Character.isUpperCase(harf)?harf:Character.toUpperCase(harf));
//
////**************************************************************************************
////Kullanıcıdan not iste,50 veya büyükse geçtin değise kaldın yazdır.
//        System.out.println("notu giriniz");
//        double not=scan.nextDouble();
//
//        System.out.println(not>=50?"geçtin":"kaldın");

//**************************************************************************************
//Kullanıcıdan tamsayı iste,pozitifse ? çift sayı: değise değil yazdır.
//                          pozitif değilse?3 basamaklı: 3 basamaklı değil yazdır.

        System.out.println("tamsayı giriniz");
        int a =scan.nextInt();
//
//        System.out.println(a>=0?"çift sayı":"çift sayı değil");
//        System.out.println(a<0?"3 basamaklı":"3 basamaklı değil");
        System.out.println(a>0? a%2==0? "çift sayı":"çift sayı değil":a<-100 && a>-1000?  "üç basamaklı":"üç basamaklı değil");




    }//ocs sınavı
}
