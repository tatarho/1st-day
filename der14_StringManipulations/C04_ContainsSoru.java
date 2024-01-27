package der14_StringManipulations;

import java.util.Scanner;

public class C04_ContainsSoru {
    public static void main(String[] args) {
//        soru:
//        kullanıcıdan bir cümle al
//        cümlede ev geçiyorsa "Home Sweet Home" yazdır
//        cümlede iş geçiyorsa "Çalışmak Güzeldir" yazdır
//        ümlede ikisi de varsa "Hem Ev Hem de İş Lazım" yazdır
//        ümlede hiç biri yoksa "Çok Çalışmam lazım" yazdır

        Scanner scanner=new Scanner(System.in);
        System.out.println("Lütfen bir cümle giriniz");
        String cumle= scanner.nextLine();


//        System.out.println(cumle.indexOf("ev")>=0?"Home Sweet Home":"");
//        System.out.println(cumle.indexOf("iş")>=0?"Çalışmak Güzeldir":"");
//        System.out.println(cumle.indexOf("ev")>=0&&cumle.indexOf("iş")>=0?"Hem Ev Hem de İş Lazım":"Çok Çalışmam lazım");
        //********************************************************************
        //System.out.println((cumle.indexOf("ev")>=0?"Home Sweet Home":""):(cumle.indexOf("iş")>=0?"Çalışmak Güzeldir":""):(cumle.indexOf("ev")>=0&&cumle.indexOf("iş")>=0?"Hem Ev Hem de İş Lazım":"Çok Çalışmam lazım"));
        //********************************************************************

//        if (cumle.indexOf("ev")>=0&&(cumle.indexOf("iş")==-1)){
//            System.out.println("Home Sweet Home");
//
//        } else if (cumle.indexOf("ev")==-1&&(cumle.indexOf("iş")>=0)){
//            System.out.println("Çalışmak Güzeldir");
//
//        } else if (cumle.contains("ev")&&(cumle.contains("iş"))) {
//            System.out.println("Hem Ev Hem de İş Lazım");
//
//        }else {
//            System.out.println("Çok Çalışmam lazım");
//
//        }



        //********************************************************************

        if (cumle.contains("ev")&&(cumle.contains("iş"))) {
            System.out.println("Hem Ev Hem de İş Lazım");

        }else if (cumle.contains("ev")){
            System.out.println("Home Sweet Home");

        } else if (cumle.contains("iş")) {
            System.out.println("Çalışmak Güzeldir");

        }else {
            System.out.println("Çok Çalışmam lazım");

        }


    }
}
