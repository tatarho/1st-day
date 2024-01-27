package der08_basitIfStatements;

import java.util.Optional;
import java.util.Scanner;

public class C01_If {
    public static void main(String[] args) {

//***********************************************************************************************************
//SORU: Kullanıcıdan bir sayı iste , sayıyı kontrol et, 5 e bölünebiliyorsa "bölünebilir" yazdır.
        Scanner scan = new Scanner(System.in);
        System.out.println("lütfen pozitif bir tamsayı giriniz");
        int sayi = scan.nextInt();
        if (sayi % 5 == 0) {
            System.out.println(sayi + " sayısı 5'e tam bölünebilir");
        }
//***********************************************************************************************************
//SORU: Kullanıcıdan bir harf iste , o harfle başlayan bir ay adı varsa" yazdır.
        System.out.println("Lütfen bir harf giriniz!");
        char ilkHarf=scan.next().charAt(0);
        if (ilkHarf=='o'||ilkHarf=='O'){
            System.out.println("ocak");
        }

        
//***********************************************************************************************************
//SORU: Kullanıcıdan bir sayı iste , sayı 3 ile bölünebiliyorsa 3 ile tambölünür yazdır.
// 5 ile bölünüyorsa beş ile bölünebilen sayı dı yazdır.

        System.out.println("lütfen bir sayı giriniz.");
        int sayi53=scan.nextInt();
        if (sayi53%5==0){
            System.out.println("girilen sayı 5 e tam bölünebilir");
        }
        if(sayi53%3==0){

            System.out.println("girilen sayı 3  e tam bölünebilir");
        }
        else{
            System.out.println("girilen sayı ne 3  e ne de 5 e tam bölünebilir");
        }

//***********************************************************************************************************
//SORU: Kullanıcıdan bir üçgen için 3 adet kenar uzunluğu iste ,uzunluklar eşit ise eşkenar üçgen yazdır.

        System.out.println("Lütfen üçgeninizin kenar uzunluklarını alt alta yazınız.");
        int kenar1=scan.nextInt();
        int kenar2=scan.nextInt();
        int kenar3=scan.nextInt();

        if (kenar1==kenar2 && kenar1==kenar3){
            System.out.println("üçgeniniz eşkenardır.");
        }
        else if(kenar1==kenar2 ||kenar1==kenar3 || kenar2==kenar3){
            System.out.println("üçgeniniz ikizkenardır.");
        }

        else {
            System.out.println("üçgeniniz ne eşkenar ne de ikizkenardır.");
        }

//***********************************************************************************************************
//SORU: Kullanıcıdan ingilizce den notunu iste ,50-100  ise geçtin 45-49 ise sorumlu geçtin, 0-44 ise kaldın yazdır.
        System.out.println("lütfen ingilizce notunu girer misin.");
        double noti= scan.nextDouble();
        if (noti>=50 && noti<=100){
            System.out.println("Aferin ingilizce den geçtin");

        }
        else if (noti>=45 && noti<=49) {
            System.out.println("sorumlu geçtin");
        }
        else if (noti>=0 & noti<=44){
            System.out.println("malesef kaldın");

        }
        else{
            System.out.println("yanlış not girişi");
        }
    }

}