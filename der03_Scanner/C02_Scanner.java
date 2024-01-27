package der03_Scanner;

import java.util.Scanner;

public class C02_Scanner {//kullanıcıdan dairenin yarıçapını alıp,alanını hesaplayın ve bildirin.
    public static void main(String[]args){
        Scanner scan= new Scanner(System.in);
        System.out.println("Lütfen dairenin yarıçapını giriniz!:");
        double yariCap=scan.nextDouble();//yarıçapı aldık.
       double dairealani=3.14*yariCap*yariCap;//alanını hesapla
        System.out.println("Alan:"+dairealani);//bildirdin.


    }
}
