package der12_Switch;

import java.util.Scanner;

public class C03_SwitchStatements3 {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);

//*************************************************************************
//****Soru:Kullanıcıdan 2 basamaklı bir sayı al sayıyı yazdır*************
        System.out.println("lütfen 2 basamaklı bir sayı girin");
        int iki=scan.nextInt();
        switch (iki){
            case 1:System.out.println("bir");break;
            case 2:System.out.println("iki");break;
            case 3:System.out.println("üç");break;
            case 4:System.out.println("dört");break;
            case 5:System.out.println("beş");break;
            case 6:System.out.println("altı");break;
            case 7:System.out.println("yedi");break;
            case 8:System.out.println("sekiz");break;
            case 9:System.out.println("dokuz");break;
            case 10:System.out.println("on");break;
            case 20:System.out.println("yirmi");break;
            case 30:System.out.println("otuz");break;
            case 40:System.out.println("kırk");break;
            case 50:System.out.println("elli");break;
            case 60:System.out.println("altmış");break;
            case 70:System.out.println("yetmiş");break;
            case 80:System.out.println("seksen");break;
            case 90:System.out.println("doksan");break;
            default:System.out.println("yanlış numara");




        }


    }
}
