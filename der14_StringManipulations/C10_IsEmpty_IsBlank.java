package der14_StringManipulations;

public class C10_IsEmpty_IsBlank {
    public static void main(String[] args) {
        String str1="";
        String str2="      ";
        String str3="a,b";

        System.out.println(str1.isEmpty());//true         boşluk
        System.out.println(str2.isEmpty());//false
        System.out.println(str3.isEmpty());//false

        System.out.println(str1.isBlank());//true         aralık
        System.out.println(str2.isBlank());//true
        System.out.println(str3.isBlank());//false


    }
}
