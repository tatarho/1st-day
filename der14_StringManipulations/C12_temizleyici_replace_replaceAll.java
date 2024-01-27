package der14_StringManipulations;

import java.util.Scanner;

public class C12_temizleyici_replace_replaceAll {
    public static void main(String[] args) {
        String str = "Hava Candır";
        System.out.println(str.replace("Hava", "Java"));//Java Candır

        str.replace("Hava", "Java");
        System.out.println(str);//Hava Candır değişiklik yok

        System.out.println(str.replace("Hava", "Java").replace("a", "H"));//Java Handır
        //üsütte. replace yapılabilir.

        System.out.println(str.replaceFirst("H", "r"));//ilk bulduğun h yi r ile değiştir.
        System.out.println(str.replace(" ", ""));
        System.out.println("1.........................................");
        //********                 replaceAll           ****************************************************

        String cumle = "A5326li bu45gün işe h25iç ge13lmedi";
        System.out.println(cumle.replaceAll("\\d", ""));//tüm sayıları temizledi.
        System.out.println(cumle.replaceAll("\\s", ""));//tüm boşlukları temizledi.
        System.out.println(cumle.replaceAll("\\W", ""));//tüm türkçe karakterleri temizledi.
        System.out.println(cumle.replaceAll("\\w", ""));//tüm türkçe olmayanları temizledi.
        System.out.println(cumle.replaceAll("\\s", "OOOOOOOO"));//tüm boşlukları temizledi yerine başka dizi kydu.

        //regex:Regular Expressions regex kısmına şunlar yazılabiril
        //         \\s:space,       \\S:space olmayan herşeyi temizle
        //         \\s+:yanyana birden fazla space tmizle
        //         \\d:digits,       \\D:digits olmayan herşey
        //         \\w:harf rakam veya _,       \\W:harf rakam veya _ olmayan herşey
        // fazlası için bknz:java regex
        System.out.println("2.........................................");
        //************************************************************

//        soru:                    A1236/*-+=li g-^'!eé"l.45?)(__
//        Kullanıcıdan bir metin al.
//        metinden space dışındaki tüm karakterleri temizle
//        metni yeni haliyle yazdır.

        Scanner scanner = new Scanner(System.in);
        System.out.println("lütfen yeniletmek veya temizletmek istediğiniz metni giriniz");
        String metin = scanner.nextLine();

       metin=metin.replaceAll("\\d", "");//rakamları yoket
       metin=metin.replaceAll("\\s", "x");//space yi koruma altına almak için x le space yapalım
       metin=metin.replaceAll("\\W", "é");//özel karakterlerin yerine é koy
       metin=metin.replaceAll("_", "").replaceAll("x"," ");//_ i yoket ve koyduğun x i boşlukla değiştir.
       metin=metin.replace("é","");

        System.out.println(metin.concat("."));//tüm sayıları temizledi.


        System.out.println("3.........................................");
    }
}
