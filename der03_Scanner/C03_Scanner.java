package der03_Scanner;

import java.util.Scanner;

public class C03_Scanner //Kullanıcıdan 1 kelime iste,ilk harfini yazdır.
{
    public static void main(String[] args)
    {
//        Scanner scan=new Scanner(System.in);
//        System.out.println("Bir kelime yazınız");
//        char ilkHarf=scan.next().charAt(0);
//
//        //Kullanıcı "Ahmet" yazdı
//        // string içindeki karakterler index le tutulur.
//        // karakterler sırasıyla 0,1,2,3..diye devam eder.
//        //biz ahmet in ilk harfini almak için yukarıdaki objeyi kullanırız.
//        System.out.println("ilk harf:" +ilkHarf+" dir.");

//        Scanner scan=new Scanner(System.in);
//
//        System.out.println("Bir adet String değer yazınız!");
//        String deger=scan.nextLine();
//        System.out.println(deger + "bir string değerdir.");
//
//        System.out.println("Bir adet int değer yazınız!");
//        int deger1=scan.nextInt();
//        System.out.println(deger1 + "bir integer değerdir.");

// ++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++
// ++++++++++++++++++++++++++++++++++++++SCANNER LA DÖRT İŞLEM YAPMAK++++++++++++++++++++++++++++++++++++++++++++
//        Scanner scan = new Scanner(System.in);
//        System.out.println("Bir adet ondalıklı değer giriniz!");
//        double deger = scan.nextDouble();
//        System.out.println("girdiğiz değer: " + deger + " " + "dir.");
//
//        System.out.println("Bir adet tam sayı değeri giriniz");
//        int deger2 = scan.nextInt();
//        System.out.println("girdiğiniz değer: " + deger2 + " " + "dir.");
//
//        System.out.println("Bu " + deger + " ve " + deger2 + " sayıları için, ");
//        System.out.println("Toplamını istiyorsanız: T, ");
//        System.out.println("Çarpımını istiyorsanız: Ç, ");
//        System.out.println("Farkını istiyorsanız: F ve");
//        System.out.println("Büyüğünün küçüğüne bölünmesini istiyorsanız :B yazınız!,");
//
//        String T=scan.next();
//        {System.out.println("büyük harfle T yazmalısınız.");}
//
//        double toplam=(deger+deger2); System.out.println("T : "+toplam+" dir.");
//        String Ç=scan.next();double carpim=(deger*deger2); System.out.println("T : "+carpim+" dir.");
//        String F=scan.next();double fark=(deger-deger2); System.out.println("T : "+fark+" dir.");
//        String B=scan.next();double bolme=(deger/deger2); System.out.println("T : "+bolme+" dir.");

// ++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++
// ++++++++++++++++++++++++++++++++++++++SCANNER LA KAYDINIZ ALINMIŞTIR++++++++++++++++++++++++++++++++++++++++++++

       Scanner scan=new Scanner(System.in);

        System.out.println("Bayım lütfen alt alta olacak şekilde adınızı, soyadınızı ve yaşınızı yazar mısınız?");
        String ad=scan.nextLine();
        String soyad=scan.nextLine();
        int yas=scan.nextInt();
        System.out.println(ad.charAt(0)+" "+soyad+", "+yas+" dır.");


        System.out.println("Adınız: "+ad+" dır.");
        System.out.println("Soyadınız: "+soyad+" dır.");
        System.out.println("Yaşınız: "+yas+" dır.");


        System.out.println("Kaydınız alınmıştır bayım!");

// ++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++
// ++++++++++++++++++++++++++++++++++++++SCANNER LA ALAN HESABI++++++++++++++++++++++++++++++++++++++++++++++++++



        System.out.println("BAYIM DİKDÖRTGENİNİZİN UZUN KENAR ÖLÇÜSÜNÜ GİRER MİSİNİZ?");

        double a =scan.nextDouble();

        System.out.println("a=  "+a);
        System.out.println("DİKDÖRTGENİNİZİN KISA KENAR ÖLÇÜSÜNÜ GİRİN BAKİİM!");

        double b=scan.nextDouble();
        System.out.println("b=  "+b);
        double alan= a*b;
        double cevre=(a+b)*2;
        System.out.println(alan+" DİKDÖRTGENİNİZİN ALANIDIR!");
        System.out.println(cevre+" DİKDÖRTGENİNİZİN ÇEVRESİDİR!");

        System.out.println("Alanını ve çevresini hesaplatmak istediğiniz dairenin yarıçapını giriniz!");
        double yaricap=scan.nextDouble();
        double alanDaire=Math.PI*yaricap*yaricap;
        System.out.println("Alan: "+alanDaire);
        double cevreDaire=Math.PI*(yaricap*2)   ;
        System.out.println("Çevre: "+cevreDaire);

        System.out.println("lütfen sırasıyla isminizi, soyisminizi ve ");

// ++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++
// ++++++++++++++++++++++++++++++++++++++SCANNER LA KAYDINIZ ALINMIŞTIR++++++++++++++++++++++++++++++++++++++++++++
    }
}

