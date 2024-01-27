package der10_nestedIfElse;

import java.util.Scanner;

public class C03_MarketIndirimi {
    public static void main(String[] args) {
//        soru:
//        kullanıcıdan aldığı ürün adedini al
//        liste fiyatını al
//        mağaza kartı varsa ve 10 üründen fazla amışsa % 20 az ise%15 indirim yap
//        mağaza kartı yoksa ve 10 üründen fazla amışsa % 15 az ise%10 indirim yap

        Scanner scanner=new Scanner(System.in);

        System.out.println("aldığınızı ürün adedini giriniz");
        int urunsay= scanner.nextInt();

        System.out.println("Tamam \n şimdi liste fiyatını giriniz");
        double fiyat= scanner.nextDouble();

        System.out.println("mağazamızın kartına sahipseniz e \n değilseniz h girinz");
        char kart=scanner.next().charAt(0);

        double yirmi=fiyat-((fiyat/100)*20);
        double onbes=fiyat-((fiyat/100)*15);
        double on=fiyat-((fiyat/100)*10);

        if(kart!='e'||kart!='h'||fiyat<0||urunsay<0){
            System.out.println("geçersiz işlem");}

        else if(kart=='e'&&urunsay>=10){
            System.out.println("tebrikler! % 20 indirimli olarak toplam: "+yirmi+" ödeyeceksiniz");}

              else if(kart=='e'&&urunsay<10){
                  System.out.println(" % 15 indirimli olarak toplam: "+onbes+" ödeyeceksiniz");


        }
              if(kart=='h'&&urunsay>=10){
            System.out.println("tebrikler! % 15 indirimli olarak toplam: "+onbes+" ödeyeceksiniz");}


        else if(kart=='h'&&urunsay<10) {
            System.out.println(" % 10 indirimli olarak toplam: " + on + " ödeyeceksiniz");

        }
    }
}
