package der15_MethodOlusturma;

import java.util.Scanner;

public class C02_AsalSayiMetodum {
    //kendi metodunu oluştur.metod içinde metod olmaz
    //kullanıcıdan main method içinde asalsayı al
    // bunun asal olup olmadığını kontrole et yazdır ve bu metodu oluştur.


    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);  //scanner oluştur
        System.out.println("lütfen bir adet pozitif tamsayı giriniz");//direktifi gir
        int sayi = scan.nextInt();//sayıyı al

        asalSayiMi(sayi);//oluşturduğunmetodu yaz

    }

    public static void asalSayiMi(Integer sayi) {//sentaxı yaz
        //asal sayı yada asal sayı değil diyecek.
        int flag = 1;//flag oluştur
        for (int i = 2; i < sayi; i++) { //for yaz

            if (sayi%i==0) {//ifle ne yapılacağını kontrol et
                flag++;//flag yazdır
                break;
            }
        }
        if (flag == 1) { //flag çalışırsa
            System.out.println("girilen sayı asaldır"); //yazdır
        } else {
            System.out.println("sayı asal değildir");//değise yazdır
        }
    }
}
