package der14_StringManipulations;

import java.util.Locale;

public class C01_StringManipulation {
    //Writing the object without using permanent methods with sout
    //Write java Candır in turkish(candir) and all capitals(upperCase)
    public static void main(String[] args) {

        String str="Java CANDIR";
        str=str.toUpperCase();
        System.out.println(str);
        System.out.println(str.toLowerCase());
        System.out.println(str.toLowerCase(Locale.ENGLISH));
        System.out.println(str.toLowerCase(Locale.forLanguageTag("Tr")));//wrapperda türkçe yoksa ve bilg. dili tr değilse
        System.out.println(".......................................................");
 //*****************************************************************************************************************************
   //karakter sayısı bulup istediğimiz karakteri yazdırmak
        String uzun="Ahmet Cemil UÇAR";
        System.out.println(uzun.length());//0 dan başlar veboşluklar karakterdir.
        System.out.println(uzun.charAt(0));
        System.out.println(uzun.charAt(16-1));//not dynamic.local result
        System.out.println(uzun.charAt(uzun.length()-1));//dynamic permanent result.
        System.out.println(".......................................................");
        //*****************************************************************************************************************************
        //fault massage:If the command is more than the actual length."StringIndexOutOfBoundsException"
        String hataMesaji="Mustafa Ruhi Gündoğdu";
        System.out.println(hataMesaji.length());//21 chrs.

        System.out.println(hataMesaji.charAt(22));//StringIndexOutOfBoundsException
        System.out.println(hataMesaji.charAt(hataMesaji.length()));//StringIndexOutOfBoundsException
    }

}
