package der05_wrapperClass_matmatikselIslemler_scanner;

public class C02_rakamlarToplami_scanner {
    //Matematikte işlem sırası üslü sayılar,parantez içi,*,/+,- dır
    //eğer + ve + gibi ise soldan başlanır.
    //Modulus = sayi% işareti ile gösterilir;
    //1256%2=0,  ==>çift sayı mı demektir, sonuç 0 sa çift sayıdır.
    //1245%10=5, ==>birler basamağında ne var.
    //1245%5=0, ==>örneğin 5 e bölünür mü?sonuç 0 sa bölünür.

    public static <Scanner> void main(String[] args) {
//SORU:Kullanıcıdan 3 basamaklı pozitif bir sayı al ve rakamlarını topla.
        //System.out.println((23/5);//5.6 ama 5 verir.
        System.out.println(123%10);//3
        System.out.println(123/10);//12,3 ama 12 verir.
        System.out.println(12%10);//2
        System.out.println(12/10);//1,2 ama 1 verir
        System.out.println(1%10);//0,1 ama 1 verir.ikisi de int olduğu için.
        System.out.println((123%10)+(12%10)+(1%10));


    }

}
