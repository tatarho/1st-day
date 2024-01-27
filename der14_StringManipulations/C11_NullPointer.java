package der14_StringManipulations;

public class C11_NullPointer {
    public static void main(String[] args) {
        String str;
        //System.out.println(str); itiraz eder çünkü DEĞER atamadın
        //variable oluşur
       String str2="";//değer atandı ama hiçlik olduğu için bunu dolu gösterir. 0 gösterir
        System.out.println("str 2 nin degeri :"+str2+"===");//hiçlik değeri atadı
        System.out.println("str 2 nin uzunluğu :"+str2.length());//0
        //str2 ye "" atanabilir.
        //değer atananları say dediğimizde "" doludur.
        //başka data türlerinde hiçlik atanamaz.


        //null pointer özel bir göreve sahiptir.
        //mezar var ama içi boş
        //null bir değer atanmış olduğunu gösterir ama değer değildir
        // sadece bir işaretçidir.

        String str3=null;
        System.out.println(str3);//değeri null olarak yazdırır ama  bu değer değil işaretçidir.
                                 //null olarak işaretler sadece.
                                 //null olarak işaretlediğinde burayı boş olarak gösterir
                                 //null primitive variable lra atanamaz ama non primitivlere yazılır
        System.out.println(str3+"java");   //nulljava:sadece yazdırılabilir
     //System.out.println(str3.length()); //değer atanmadığı için uzunluğu ölçmez
                                           // NullPointerException hatası verir.

        //System.out.println(str3.concat("java"));//NullPointerException
        System.out.println(str3+"java");   //nulljava:sadece yazdırılabilir.
                                          // ..concat ile + nın farkı(concat birleştirmek)

        String str4="123";
        System.out.println(Integer.parseInt(str4));
        //null!=Boş!=""
        String isim1=null;//===yazdırır null işaretçi olarak
        System.out.println(isim1.length());//yazdırınca hata verir.
        //String isim2;===değer atanmamış yazdırmaz
        //String isim3="";==hiçlik değeri atanmıştır boşluyazdırır ve 0 uzunluğundadır hata vermez

    }
}
