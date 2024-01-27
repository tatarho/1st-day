package der14_StringManipulations;

public class C04_Substrings {
    public static void main(String[] args) {
        String a = "Java Güzeldir";
        System.out.println(a.substring(1));//1. indexten itibaren yazar.
        System.out.println(a.substring(5));//Güzeldir       5. indexten itibaren sonuna kadar yazar.
        //System.out.println(a.substring(20)); // hata verir.
        //StringIndexOutOfBoundsException çünkü veri harf indexinin dışında kalmıştır.
        //bu bir RTE:Run Time Error dur ve çalıştırınca ortaya çıkar.
        System.out.println("-----------------------");
        System.out.println(a.substring(a.length() - 2));//ir    son 2 indexi yazar.
        System.out.println(a.substring(a.length() - 5));//eldir    son 5 indexi yazar.
        System.out.println("-----------------------");
        System.out.println(a.substring(0, 3));//ilk 3 indexi yazar.

        //str a=15;direk str yi kırmızı yazar çalıştırmadan
        //buna da CTE:compile time error dur.
        System.out.println("-----------------------");
        //sadece 3. karakteri charAt ile ve substring ile yazdır
        System.out.println(a.charAt(2));//dynamic değil.sonrasında bir şey devam etmek istersek char olduğu için ozaman hata verir.
        System.out.println(a.substring(2,a.length() -10));//sondan şu karaktere kadar yazar.
        System.out.println(a.substring(2,3));//sonrasında bir şey devam etmek istersek,olduğu için ozaman hata vermez
        System.out.println(a.substring(3,3));//hiç bişi yazmaz boş bir satır verir
        System.out.println("son");
        //System.out.println(a.substring(8,4));//StringIndexOutOfBoundsException .RTE
        System.out.println(a.substring(3,3));//hiç bişi yazmaz boş bir satır verir
        String b="Ja";
        String c="va";
        System.out.println(b+c);//Java
        System.out.println(b.concat(c));// Ja ile va birleşir


    }
}
