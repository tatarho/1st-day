package der14_StringManipulations;

public class C03_Equals_DoubleEqualSign {
    public static void main(String[] args) {
        String str1="Ali";
        String str2=new String("Ali");
        String str3="Ali";
        String str4="A"+"li ";
        String str5="a";
        String str6="li";
        String str7=str5+str6;
        //ın string method DoubleEqualSign is less used than integer mothod.
        //Because this sign cares not only the letters(Heap/Ali) but olso the method (Stack/str)
        // In Strings Use eguals or equalsIgnoreCase instead.
        //cares  only the letters(Heap/Ali) and may ignore.
        System.out.println(str1==str2);//false
        System.out.println(str1==str3);//t:everyting is eqaul.
        System.out.println(str1==str4);//false
        System.out.println(str1==str5);//false
        System.out.println(str1==str6);//false
        System.out.println(str1==str7);//false
        System.out.println("-----------------------------------");
        System.out.println(str1.equals(str2));//t

    }
}
