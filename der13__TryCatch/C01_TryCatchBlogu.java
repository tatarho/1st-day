package der13__TryCatch;

public class C01_TryCatchBlogu {
    public static void main(String[] args) {
        //Risk oluşması durumunda;try bloğu:kodların yazıldığı bölüm,(şu kodu dene)
        //                        catch bloğu:risk oluştuğunda ortaya çıkması beklenen(bunu yaz)
        //                        exception türünü ve yapılacak işlemi belirttiğimiz bölüm,
        int a = 10;
        int b = 0;
        try {
            System.out.println(a / b);//10 0 a bölünmez tanımsızdır,Risk oluşma sözkonusu

            System.out.println("10 u 0 a bölemezsen catch çalışsın (exception handle edilmediğinde yani catch bloğuna hatanın türünü doğru  tahminlemezsen problem devam eder.");

        } catch (ArithmeticException e) {//doğru tahminledik
            e.printStackTrace();
        }
        System.out.println("hata türü doğru yazılmıştır catch a yani intelij 0 a ulaşmıştır.");
    }
}
