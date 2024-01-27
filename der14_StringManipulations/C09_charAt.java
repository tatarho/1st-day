package der14_StringManipulations;

public class C09_charAt {
    public static void main(String[] args) {

        String str="Java Candir";//input

        System.out.println(str.charAt(0));//ilk harfi yazdır
        System.out.println(str.length());//son harfin indexini yazdir
        System.out.println(str.charAt(11-1));//son harfi yazdir.
        System.out.println(str.charAt(10));//son harfi yazdir.
        System.out.println(str.charAt(str.length()-1));//11 yerine str length,DYNAMİC


    }
}
