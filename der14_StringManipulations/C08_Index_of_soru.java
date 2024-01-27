package der14_StringManipulations;

import java.util.Scanner;

public class C08_Index_of_soru {
    public static void main(String[] args) {
//        soru:
//        Kullanıcıdan bir metin ve bu metinde aranacak cümle isteyin
//        cümle ile metni karşılaştırın
//        aşağıdaki 3 durumdan 1 ini yazdırın.
//        1 - Verilen cümle metinde yok
//        2 - verilen cümle metinde sadece 1 kere kullanılmış
//        3 - verilen cümle metinde 1 den fazla kullanılmıştır.

        Scanner scanner=new Scanner(System.in);
        System.out.println("Lütfen inceletmek istediğiniz metni giriniz");
        String metin= scanner.nextLine();
        System.out.println("lütfen metnininizde aratmak istediğiniz cümle,kelime yada harfi giriniz");
        String cumle= scanner.nextLine();


//
        if(metin.indexOf(cumle)==-1){
            System.out.println("aranan cümle metinde bulunmamaktadır");

//       if(!metin.contains(cumle)) {
//           System.out.println("aranan cümle metinde bulunmamaktadır");


        }   else if(metin.indexOf(cumle)==(metin.lastIndexOf(cumle))){
            System.out.println("aranan cümle,kelime metinde 1 kez kullanılmıştır.");

        }else {
            System.out.println("aranan cümle,kelime metinde 1 den fazla kez kullanılmıştır.");
        }





    }
}
