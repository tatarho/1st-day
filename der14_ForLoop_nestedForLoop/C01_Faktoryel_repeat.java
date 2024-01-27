package der14_ForLoop_nestedForLoop;

import java.util.Scanner;

public class C01_Faktoryel_repeat {
    public static void main(String[] args) {
        //5 kez hello yazdır

        String h = "hello ";

        for (int hello = 1; hello <= 10; hello++) {
            System.out.print("hello ");

        }System.out.println("1...............for..............");
        //************************************************************************************
        System.out.print(h.repeat(5));
        System.out.println("2..........repeat...................");
        //**************************************************************************************

        //1 den 10 a kadar olan sayıları tek tek yazdır
        for (int i = 1; i < 10; i++) {
            System.out.print(i+" ");


        } System.out.println("3............for...................");
        //**************************************************************************************
////        soru:
////        kullanıcıdan 20 den küçük bir ozitif tamsayı al
////        sayının faktöriyel değerini hesapla yazdır. input=5 output=120
//        consolda faktöriyel hesabının yapılışını;
//        6 != 6 * 5 * 4 * 3 * 2 * 1 = 720 şeklinde gösterin

        Scanner scanner = new Scanner(System.in);
        System.out.println("Faktoriel değerini hesaplamak istediğiniz tamsayıyı giriniz");
        int sayi = scanner.nextInt();

        long fak = 1;
        System.out.print(sayi + "! = ");// 6!=
        for (int i = sayi; i >= 1; i--) {//i=6 5 4 3  2 1

            fak *= i;
            if (i != 1) {
                System.out.print(i + " * ");
            } else {
                System.out.print(i + " = "+fak);
            }
        }
       // System.out.print(fak);
        System.out.println();



        System.out.println("4............faktoryel...................");
        //**************************************************************************************
////        soru:
////        kullanıcıdan 20 den küçük bir ozitif tamsayı al
////        sayının faktöriyel değerini hesapla yazdır.
//        consolda faktöriyel hesabının yapılışını;
//        6 != 6 * 5 * 4 * 3 * 2 * 1 = 720 şeklinde gösterin


        System.out.println("rakamları toplamını hesaplamak istediğiniz tamsayıyı giriniz");
        int sayi1 = scanner.nextInt();
        long top = 1;
        System.out.print(sayi1 + ":");
        for (int i = sayi1; i >= 1; i--) {
            top += i;
            if (i != 1) {
                System.out.print(i + "+");
            } else {
                System.out.print(i + " = " + top);
            }
            System.out.print("");

        }System.out.println("5..........................................");
        //**************************************************************************************
//        soru:
//        kulllanıcıdan poziti tamsayı alıp rakamları toplamını yazdırın or:125:1+2+5=8



        }

    }









