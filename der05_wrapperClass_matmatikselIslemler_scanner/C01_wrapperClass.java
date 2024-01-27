package der05_wrapperClass_matmatikselIslemler_scanner;

public class C01_wrapperClass {
    //primitive data türleri küçük harfle başlar.
    // 1-char;sadece bir karakter alır ve 'a' şeklinde gösterilir
    // 2-booleon; true/ false şeklinde gösterilir.
    // 3-byte;-128 ile +122 ye kadar değer alır.
    // 4-short;tamsayıları ifade eder.
    // 5-integer;tamsayıları ifade eder.
    // 6-long;tamsayıları ifade eder.
    // 7-double;ondalıklı sayıları ifade eder.
    // 8-float;ondalıklı sayıları ifade eder.
    //EĞER BUNLARI BÜYÜK HARFLE BAŞLATIRSAK KARŞIMIZA KOYU HARFLERLE YAZILMIŞ
    // HAZIR METOD SEÇENEKLER GELİR BU SEÇENEKLERİ GETİRME DURUMUNA wrapper class DENİR.
    //

    public static void main(String[]args) {
    String str="Java";
    System.out.println(str.toUpperCase());//JAVA

    int sayiP=20;//int bir primitive dir. bundan dolayı
                   //sayiP yazdığımızda hazır metod gelmez.

    Integer sayiM=30;
        System.out.println(Integer.MAX_VALUE);// 2147483647 dir.
        System.out.println(Integer.MIN_VALUE);//  -2147483648 dir.

   char karekP='a';
   Character karekW='b';
        System.out.println(Character.isDigit(karekP));// false çünkü 'a' sayı mı diye sorduk.
        System.out.println(Character.isLowerCase(karekW));// true diyecektir çünkü 'b' küçük harf mi diye sorduk.

   //SORU: Aşağıdaki string değerleri toplayınız.
        String str1="1234";
        String str2="1000";
        String toplam=str1+str2;
        System.out.println(toplam);//  12341000 toplamadı metin(string) olarak algıladığından yanyana yazdı.

        System.out.println(Integer.valueOf(str1)+Integer.valueOf(str2)); //topladı çünkü wrapperClass yaptık.
    }
}
