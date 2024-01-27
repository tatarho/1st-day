package der09_ıfElseStatements;

import com.sun.jdi.connect.spi.TransportService;

import javax.swing.text.StyleConstants;
import java.util.Scanner;

public class C01_IfElseStatements {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("lütfen yaşınızı girer misiniz.");
        int yas = scan.nextInt();
        if (yas == 65) {
            System.out.println("tebrikler emekli oldunuz!");
        } else if (yas < 65 && yas >= 0) {
            System.out.println("emekli olmanıza daha " + (65 - yas) + " yıl var.Lütfen acele etmeyin.");
        } else if (yas > 65 && yas <= 85) {
            System.out.println("emekli olalı " + (yas - 65) + " yıl olmuş.");
        } else if (yas > 85 && yas <= 100) {
            System.out.println("maaşallah emekli olalı tam " + (yas - 65) + " yıl olmuş.");
        } else {
            System.out.println("dalga geçmeyin lütfen...yanlış yaş girişi");
        }

//***********************************************************************************************************
//SORU: Kullanıcıdan bir karakter  iste ,karakter büyük/küçük yazdır.
        System.out.println("lütfen bir harf giriniz");
        char harf = scan.next().charAt(0);
//        System.out.println(Character.isLowerCase(harf));küçük harfse true
//        System.out.println(Character.isUpperCase(harf));büyük harfse true
        if (Character.isLowerCase(harf)) {
            System.out.println((harf) + " küçük harftir");
        } else {
            System.out.println((harf) + " büyük harftir");
        }


//***********************************************************************************************************
//SORU: Kullanıcıdan bir karakter  iste ,küçük ise büyük harf olarak yazdır. büyük ise aynısını yazdır.

        System.out.println("lütfen bir harf giriniz");
        char harf1 = scan.next().charAt(0);
        System.out.println(Character.toUpperCase(harf1));
        if (Character.isUpperCase(harf1)) {
            System.out.println("yazdığınız harf " + (harf1) + " dir");
        }


    }
    }











