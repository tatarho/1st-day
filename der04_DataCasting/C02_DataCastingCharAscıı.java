package der04_DataCasting;

import java.util.Scanner;

public class C02_DataCastingCharAscıı {
    public static void main(String[]args){

//      int a='a'+'b';
//        System.out.println(a);
//        // a nın char değeri ile b nin char değeri toplanır;97+98=195
//        System.out.println('a' +'b');//195
//        System.out.println(""+'a' +'b');//ab
//
////SORU:..... kullanıcıdan bir karakter al ve sonraki 3 karakteri ona ASCII(CHAR) şeklinde bildir.
//        Scanner scan=new Scanner(System.in);
//
//
//        System.out.println("LÜTFEN BİR KARAKTER GİRER MİSİNİZ?");
//        char xkarakter=scan.next().charAt(0); //karakteri kullanıcı girdi.
//        System.out.println("girdiğiniz karakter : "+xkarakter);
//        System.out.println("girdiğiniz karakterden sonraki ilk karakter: "+(xkarakter+1));
//        System.out.println("girdiğiniz karakterden sonraki 2. karakter: "+(xkarakter+2));
//        System.out.println("girdiğiniz karakterden sonraki 3. karakter: "+(xkarakter+3));

////SORU:..... kullanıcıdan bir karakter al ve sonraki 3 karakteri ona harf şeklinde bildir.
//      System.out.println("LÜTFEN BİR KARAKTER GİRER MİSİNİZ?");
//      char karakter1 =scan.next().charAt(0);
//      System.out.println("girdiğiniz karakter : "+karakter1);
//      System.out.println("girdiğiniz karakterden sonraki ilk karakter: "+(char)(karakter1+1));
//      System.out.println("girdiğiniz karakterden sonraki 2. karakter: "+(char)(karakter1+2));
//      System.out.println("girdiğiniz karakterden sonraki 3. karakter: "+(char)(karakter1+3));

//SORU:..... kullanıcıdan 2 tam sayı alıp bunları birbrine bölüp sonucu double olarak al.
      Scanner scan=new Scanner(System.in);

      System.out.println("Lütfen bölünen sayıyı girin");
      int bolunen=scan.nextInt();
      System.out.println("lütfen bölen sayıyı gir");
      int bolen=scan.nextInt();
//      double sonuc=(double)bolunen/bolen;
      System.out.println("bölüm:  "+(double)bolunen/bolen);








    }

}
