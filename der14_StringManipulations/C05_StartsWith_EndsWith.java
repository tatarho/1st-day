package der14_StringManipulations;

public class C05_StartsWith_EndsWith {
    public static void main(String[] args) {
        String str="Java çok Güzeldir";
        System.out.println(str.startsWith("j"));//F: küçük j ile başlayan birşey yok.
        System.out.println(str.startsWith("J"));//T: büyük J ile başlayan birşey var.
        System.out.println(str.startsWith("a"));//F: küçük ç ile başlayan birşey yok.
        System.out.println(str.endsWith("ir"));//T:  ir ile biten birşey var.
        System.out.println(str.endsWith("k"));//F: k ile biten birşey yok.
        System.out.println(str.endsWith(""));//T: boşlukla bitiyor mu evet
        System.out.println(".....................");
        System.out.println(str.startsWith("a",3));
         //3. index ve sonrasına bakar a harfi var mı? var(T) a çok Güzeldir.
        System.out.println(str.startsWith("ç",5));
        //5. index ç prefixi/harfi  mi ? var(T) java ç.(T)
        System.out.println(str.endsWith("Java çok Güzeldir"));//t
        System.out.println(str.startsWith("Java çok Güzeldir"));//t


    }
}
