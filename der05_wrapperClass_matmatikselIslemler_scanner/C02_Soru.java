package der05_wrapperClass_matmatikselIslemler_scanner;

import java.util.Scanner;

public class C02_Soru {
    public static void main(String[] args) {
//  SORU:kullanıcıdan 3 basamaklı pozitif bir tamsayı al rakamlarını topla.
//        Scanner scan=new Scanner(System.in);{
//            System.out.println("lutfen 3 basamaklı pozitif bir tamsayı gir!");
//            int sayi=scan.nextInt();
//            int birlerB=0;
//            int rakamlarToplami=0;
//
//            birlerB=sayi%10;//123 ise==>3
//
//            rakamlarToplami=rakamlarToplami+birlerB;//0+3=3
//
//            sayi=sayi/10;//12
//            birlerB=sayi%10;//2
//
//            rakamlarToplami=rakamlarToplami+birlerB;//2+3=5
//
//            sayi=sayi/10;//1
//            birlerB=sayi%10;//1
//
//            rakamlarToplami=rakamlarToplami+birlerB;//5+1=6
//
//            sayi=sayi/10;//1/10==>0,1 oda 0 dır.
//            birlerB=sayi%10;// 0 dır.
//
//            System.out.println("rakamlar toplamı: " +rakamlarToplami);
//            }

// SORU:kullanıcıdan 4 basamaklı pozitif bir tamsayı al rakamlarını çarp.
        Scanner scan=new Scanner(System.in);
        System.out.println("Lütfen rakamlarını carpacağım 3 basamaklı sayıyı giriniz!");
        int sayi=scan.nextInt();

        int birlerB=1;//çarpmalarda etkisiz eleman 1 dir.
        int toplamCarpim=1;
        //girilen sayı mesela 153 olsun,
        birlerB=sayi%10;//3

        toplamCarpim=toplamCarpim*birlerB;//0*5=0
        sayi=sayi/10;//5 ten kurtuldun, 15 kaldı.
        birlerB=sayi%10;//1,5 1 kaldı
        toplamCarpim=toplamCarpim*birlerB;
        sayi=sayi/10;//0,1 1 kaldı
        birlerB=sayi%10;//0

        toplamCarpim=toplamCarpim*birlerB;
        System.out.println("rakamlarınızın çarpımı:"+toplamCarpim);












    }

}
