package der03_Scanner;

import java.util.Scanner;

public class C01_Scanner
{
    public static void main(String[] args)
    {
        Scanner scan=new Scanner(System.in); //Karşıdan veri alma objesini yaz.
        System.out.println("Kullanıcı ismini giriniz");//kaşıya mesajını gönder.
       String kullaniciIsmi=scan.nextLine();//karşı kullanıcı adını girsin.
        System.out.println("Kullanıcı İsmi:"+kullaniciIsmi);//Gelen adı koduna al ve karşıya bildir.




    }

}
