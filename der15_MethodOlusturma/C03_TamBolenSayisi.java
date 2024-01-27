package der15_MethodOlusturma;

import java.util.Scanner;

public class C03_TamBolenSayisi {

    public static void main(String[] args) {
        //    soru:kullanınıcıdan main metod içinde bir tamsayı al
//    girilen sayının pozitif tam bölenleri sayısını bulup
//    bize döndüren bir metod oluştur.

        Scanner scanner = new Scanner(System.in);  //scanner oluştur
        System.out.println("lütfen bir adet pozitif tamsayı giriniz");//direktifi gir
        int sayil = scanner.nextInt();//sayıyı al

        System.out.println(pozitifTamBolenSayisi(sayil));;

    }

    public static int pozitifTamBolenSayisi(int sayil) {
//sayısını döndür
        int sayac = 0;
        for (int i = 1; i <= sayil; i++) {

           if (sayil % i == 0) {
                sayac++;
         }



        }
        return sayac;

    }


}

