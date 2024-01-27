package der15_MethodOlusturma;

import java.lang.runtime.SwitchBootstraps;
import java.util.Scanner;

public class C01KendiSubstringMethodumuz {
    public static void main(String[] args) {
//        soru:
//        şu görevi başlangıç ve bitiş indexleri için uygula
//        kullanıcıdan bir cumle al
//        başlangıç indexini bitiş indexinden büyük gir ve hata yazdır.
//        başlangıç ve veya bitş indexi verilen cümlenin dışındaysa hata yazdır.
//        indexler sınırlariçinde ise başlangıç indexi dahil bitiş indexi hariç olacak biçimde iki index arasındakileri yazdır.
//

        Scanner scan=new Scanner(System.in);
        System.out.println("Lütfen cümlenizi giriniz");
        String cumle=scan.nextLine();
        System.out.println("Lütfen yazdırmak istediğniz başlangıç harfinin yerini sayı olarak giriniz");
        int bas=scan.nextInt();
        System.out.println("Lütfen yazdırmak istediğniz son harfinin yerini sayı olarak giriniz");
        int son=scan.nextInt();
        System.out.println(bas<0||son<0?"girilen sayılar 0 veya büyük olmalıdır":"");
        System.out.println(son>cumle.length()?"girilen son harf sayısı \ntoplam harf uzunluğundan büyük olmamaz":"");
        System.out.println(bas>son?"girilen ilk sayı son sayıdan büyük olamaz":"");
        for (int i= bas; i< son; i++) {
            System.out.print(cumle.charAt(i));


        }

//        if(bas<0||son>cumle.length()||bas>son) {
//            System.out.println(" girilen ilk endex son endexten büyük olamaz");}
//            else if(bas>=0||son<=cumle.length()){
               System.out.println(cumle.substring(bas,son));
//        }




    }
}
