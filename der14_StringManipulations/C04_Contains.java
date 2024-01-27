package der14_StringManipulations;

public class C04_Contains {//içerir
    public static void main(String[] args) {
        String str=new String();//string güzelmiş
        String str1="String güzelmiş";
        System.out.println(str1.contains("s"));// false:küçük s varmı?
        System.out.println(str1.contains("g"));// true: sayısı ile ilgilenmez 1 adet var
        System.out.println(str1.contains("g g"));//true iki g arası boşluk var mı
        System.out.println(str1.contains(""));//t: hiçlik var.
        //eğer büyük küçük küçük harf önemli olmadan g içeripiçermediği kontrol için.
        System.out.println(str1.toLowerCase().contains("g"));//t:büyük g içerir
    }
}
