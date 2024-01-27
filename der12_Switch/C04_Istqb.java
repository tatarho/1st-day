package der12_Switch;

import java.util.Scanner;
//kullanıcıdan bir harf alıp anlamını verin.ISTQB veya tamamını
public class C04_Istqb {
    public static void main(String[] args) {

        Scanner scan=new Scanner(System.in);
        System.out.println("Lütfen şu kısaltmadan anlamını öğrenmek istediğiniz " +
                            "harfi yada kısaltmayı ISTQB olarak giriniz");
        String istqb=scan.nextLine();


        switch(istqb){
            case "I":
                System.out.println ("International");
                break;
            case "S":
                System.out.println ("Software");
                break;
            case "T":
                System.out.println ("Testing");
                break;
            case "Q":
                System.out.println ("Qualifications");
                break;
            case "B":
                System.out.println ("Board");
                break;
            case "ISTQB":
                System.out.println ("International Software Testing Qualification Board");
                break;
            default:
                System.out.println("yanlış harf girişi");

        }

    }
}
