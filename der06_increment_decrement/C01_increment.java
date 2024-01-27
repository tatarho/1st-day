package der06_increment_decrement;

public class C01_increment {
    public static void main(String[] args) {

//primitive bir variablenin değeri 3 şekilde artırılır............................
       int sayi=10;
       sayi    =sayi+3;
       sayi+=3;


        int sayi1=10;
        sayi1    =sayi*2;
        sayi1*=2;

        int sayi2=10;
        sayi2    =sayi2+1;
        sayi2    =sayi2++;    //sadece 1 artar.

        System.out.println(sayi);
        System.out.println(sayi1);
        System.out.println(sayi2);

//************************************++++++++++++*****************************************************
//SORU a ve b variable ların değerini yazdırınız*******************************************************
        int a=20;
        int b=a++;// post increment;önce atamaya yakın olan yeri declare eder sanra asign eder.
                 //a nın değeri olan 20 yi b nin kutusuna koyar/declare eder.
                 // ve a nın değerini 21 olarak assign eder.
        System.out.println(b);//20
        System.out.println(a);//21

//************************************++++++++++++*****************************************************
//SORU c ve d variable ların değerini yazdırınız*******************************************************
        int c=40;
        int d=++c;// pre increment;önce atamaya yakın olan yeri declare eder sanra asign eder.
        //c nin değeri olan 40 ı 1 asign/atar eder sonra da d ye declare/gösterir eder.
        System.out.println(c);//41
        System.out.println(d);//41
    }


}
