package der12_Switch;

import java.util.Scanner;

public class C01_IfElseGunNo {
    public static void main(String[] args) {
        //Kullanıcıdan Gün numarası alıp Karşılığında gün adını yazdır.
        Scanner scan=new Scanner(System.in);
        System.out.println("lütfen gün numarası girin");
        int gunu= scan.nextInt();
        if(gunu>7 || gunu<1){
            System.out.println("girilen Gün Numarası Hatalıdır");
        }else if (gunu==1){System.out.println("Pazartesi");}
        else if (gunu==2){System.out.println("Salı");}
        else if (gunu==3){System.out.println("Çarşamba");}
        else if (gunu==4){System.out.println("Perşembe");}
        else if (gunu==5){System.out.println("Cuma");}
        else if (gunu==6){System.out.println("Cumartesi");}
        else if (gunu==7){System.out.println("Pazar");}



    }
}
