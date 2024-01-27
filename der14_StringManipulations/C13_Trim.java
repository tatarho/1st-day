package der14_StringManipulations;


import java.util.Scanner;

public class C13_Trim {
    public static void main(String[] args) {
        String str="     Ali   topa      vur   .           ";
        //metindeki fazla kullanılan spaceleri temizleyin
        str=str.trim();
        str=str.replaceAll("\\s+"," ");
        str=str.replace("\\s","");

       //str.replace(" ","");//ön ve arkadaki boşlukları temizler
        System.out.println( str);

      //*************************************************************
      //soru:Kullanıcının belirli bir fiyatta verdiği String fiyatları
        //topla ve sonuç yazdır.
        //input1=15.35€,input2=11.40€,toplam input=26.70€

        String input1="15.55€";
        String input2="11.40€";

        input1=input1.replace("€","");
        input2=input2.replace("€","");

        double fyt1=Double.parseDouble(input1);//double a çevirme parseint
        double fyt2=Double.parseDouble(input2);
        double toplam=fyt1+fyt2;
        System.out.println(toplam+" €");
        System.out.println("1.....................................");

        //**************************************************************
        //Soru:Kullanıcıdan bir şifre isteyin,
        //     şu şartları kontrol edin,
        //     kullanıcıya düzeltmesi gereken tüm eksiklileri söyle
        //     eğer şartları sağlarsa şifreniz kaydedildi yazdır.
        //     -ilkharf küçük olmalı
        //     -son karakter rakam olmalı
        //     -şifre boşluk içermemeli
        //     -uzunluğuenaz 10 karakter olmalı.
        Scanner scanner=new Scanner(System.in);
        System.out.println("lütfen şifrenizi giriniz");
        String sifre=scanner.nextLine();

//        if(sifre.contains("\\W")){
//        System.out.println("geçersiz şifre şifreniz rakam veya sayılardan oluşmalı");
//        }
        int flag = 0;

        if (sifre.length()< 9) {
            System.out.println("şifrenizin uzunluğu en az 10 karakter olmalı");
            flag++;
        }if (!Character.isLowerCase(sifre.charAt(0))) {
            System.out.println("şifreniz küçük harfle başlamalı");
            flag++;
        }if (sifre.contains(" ")) {
            System.out.println("şifreniz boşluk içermemeli");
            flag++;
            char sonkarakter=sifre.charAt(sifre.length()-1);
            if(sonkarakter<'0'&&sonkarakter>9);
//        } if (!(sifre.length() - 1 >= 0 & sifre.length() - 1 <= 9)) {
//            System.out.println("şifreniz bir rakam ile bitmeli");
            flag++;
        } if (flag == 0) {
            System.out.println("şifreniz başarılı birşekilde kaydedildi");
        } else {
            System.out.println("geçersiz şifre girişi");
        }
    }
}
