package der14_ForLoop_nestedForLoop;

import java.util.Scanner;

public class C02_RakamlarToplami {
    public static void main(String[] args) {
//soru:kullanıcıdan bir sayı alıp rakamlarını toplayınız.örn=1523:

        Scanner scanner = new Scanner(System.in);
        System.out.println("rakamlarını toplamak istediğiniz sayıyı giriniz");
        int sayi = scanner.nextInt();
//        int birler = sayi % 10;       //3
//        int on = sayi % 100;//23
//        int onlar = on / 10;         //2
//        int yuz = sayi % 1000;//0,5
//        int yuzler = yuz / 100;       //5
//        int bin = sayi % 10000;//0,1
//        int binler = bin / 1000;       //1
//
//        int top = (birler + onlar + yuzler + binler);
//        System.out.println(sayi + " : " +binler+" + " +yuzler + " + " + onlar + " + " + birler + " = " + top);

        int basamakSayisi=(sayi+"").length();
        int birlerBasamagi=0;
        int rakamlarToplam=0;
        int girilenSayi=sayi;

        for (int i=0;i<basamakSayisi;i++){

            birlerBasamagi=girilenSayi%10;
            rakamlarToplam +=birlerBasamagi;
            girilenSayi/=10;

          }
        System.out.println(sayi+" sayısının rakamlar toplamı "+rakamlarToplam+" dır");
       }

    }





