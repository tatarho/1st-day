package der07_concatenation_operations;


public class C02_Operators {
    public static void main(String[] args) {

//*****************************************      RELATION OPERATORS       **************************************
//+++++++++++++++++++++++++++++++++++++++++++++ 1- EŞİT EŞİT    ==        +++++++++++++++++++++++++++++++++++++++
        int a=20;
        a=a+10;// = assignment;  önce sağdaki değer decleration/belirtme gerçekleşir,
               //                sonra  soldaki assignment/atama gerçekleşir.

        int b=20;

        //a ile b eşit ise....
        //a ile b eşit mi sorusu için == kullanılır; cevap true ya da false dir.
        System.out.println(a==b);//false
        System.out.println(a==(b+10));//true

        boolean c=20==b;//20=20==20,
        System.out.println(c);//true çünkü; c nin yerine 20 assign olur b de zaten 20 idi.


//*****************************************      RELATION OPERATORS       **************************************
//+++++++++++++++++++++++++++++++++++++  2-  EŞİT DEĞİLDİR   !=     ++++++++++++++++++++++++++++++++++++++++++
// bir değerin başındaki ünlem onu tesrine çevirir,
        //!false ==> true  , !(5==5)==>false   ,5!=5==>false
        int e=15;
        int f=20;
        int g=40;
       boolean h= e!=f;
        System.out.println(h);//true

//*****************************************      LOGICAL OPERATORS       **************************************
//+++++++++++++++++++++++++++++++++++++ 3-   ÇİFT VE, TEK VE   &&, &    ++++++++++++++++++++++++++++++++++++++
        //&& en az 2 adet boolean ifadenin ikisi birden aynı şartları sağlarsa true sağlamazsa false.
        //& aynı özelliğe sahiptir fakat && uzun bir işlemde sonucu ilk karşılaştığı false ile false çıkarır.
        //& ilk false ile karşılaşsa bile sonuna kadar işlemi yapar ve yine sonuc false çıkarır.
      boolean i=e==f-5 && e==g-25 && 20!=f;
        System.out.println(i);//false


//*****************************************      LOGICAL OPERATORS       **************************************
//+++++++++++++++++++++++++++++++++++++  4- VEYA  ||    ++++++++++++++++++++++++++++++++++++++++++
        //en az 2 işlemden biri true ise diğerleri false olsa bile sonuç true dir.
        //en az iki işlemden hepsi fase ise sonuç da faLse dir.
        boolean j=e==f-5 || e==g-20 & 25!=f;
        System.out.println(j);//true



    }
}
