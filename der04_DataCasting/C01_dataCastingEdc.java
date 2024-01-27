package der04_DataCasting;

public class C01_dataCastingEdc {

    public static void main(String[] args) {
//casting değiştirme demektir.kapasiteleri farklı da olsa datalar birbirinin türüne
//çevrilebilri mi çevrilirken nasıl bir sıra yada kural işler.
        // kapasitesi küçük = kapasitesi büyük ==> problem EXPILICIT DATA CASTİNG/DARALTMA formülü ile çözülür.
        //fakat veri kaybıkaçınılmazdır.
        //kapasitesi büyük= kapasitesi küçük ==> problem yok veri kaybı mümkün.

        int a= 134;// -128-----+127 arasındaki verileri alabilir.
        double b =23.4;//
        short c=34;
        byte d=14;

        double e=a;
        int f=c;
        short g=d;
//        short h=b;// sorunlu   "h" variable data türü "short"=değeri "d"
        short h=(short)b;//veri kaybı var ama problem EDC ile halledildi.

    }
}
