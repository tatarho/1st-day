package der14_StringManipulations;

public class C02_Equels_Ignore {
    public static void main(String[] args) {
        String str1="Ali";
        String str2="ALİ";
        String str3="ALi";
        String str4="ali";
        String str5="Ali ";
        String str6="Ali";

        System.out.println(str1.equals(str2));//False:"equals='=' in maths)
        System.out.println(str1.equals(str3));//False:"equals='=' in maths)
        System.out.println(str1.equals(str4));//False:"equals='=' in maths)
        System.out.println(str1.equals(str5));//False:"equals='=' in maths)
        System.out.println(str1.equals(str6));//True:"equals='=' in maths)
        System.out.println("----------------------------------------------");

        System.out.println(str1.equalsIgnoreCase(str2));//t:"equalsIgnoreCase=nevermind upper or lower)
        System.out.println(str1.equalsIgnoreCase(str3));//t:"equalsIgnoreCase=nevermind upper or lower)
        System.out.println(str1.equalsIgnoreCase(str5));//t:"equalsIgnoreCase=nevermind upper or lower)
        System.out.println(str2.equalsIgnoreCase(str4));//False:"equalsIgnoreCase='=' in maths==>space)
        System.out.println(str1.equalsIgnoreCase(str6));//t:"equalsIgnoreCase=nevermind upper or lower)





    }
}
