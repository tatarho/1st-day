package der14_StringManipulations;

public class C07_IndexOf_LastIndexOf { //istenen metnin başladığı ilk indexi ver.
    public static void main(String[] args) {

      String str=  "Ali bugün okula gelmedi, gelmedi Ali gelmedi" ;
        System.out.println(str.indexOf("e"));// e harfi kaçıncı indexte
        System.out.println(str.lastIndexOf("i"));//bugün kelimesi sondan kaçıncı indexte .
        System.out.println(str.length());
         System.out.println(str.indexOf("gelmedi",18));//gelmedi kelimesi 18 indexten sonra kaçıncı indexte.
        System.out.println(str.indexOf("a",13));//13 ten sonraki a
        System.out.println(str.lastIndexOf("l",2));//2. indexten itibaren geri say ilk l kaçta?
        System.out.println(str.lastIndexOf("e",22));//22. indexten itibaren geri say ilk e kaçta?
      System.out.println("-1..................");
      //*************************************************************************************************

      //soru:o harfinin bu metinde hiç olmadığını veya sadece 1 kere kullanıldığını yazdırın?
      System.out.println(str.indexOf("o"));// o harfi var:10. indexte
      System.out.println(str.lastIndexOf("o"));// o harfi var:10. indexte. indexof ve lastindexof aynı sayı ise 1 adet vardır.
      if (str.indexOf("o") ==-1) {
        System.out.println("o harfi yoktur");

      } else if (str.indexOf("o") == (str.lastIndexOf("o"))) {
        System.out.println("cümlenizde 1 adet o harfi vardır");
      }

        System.out.println("0..................");

      //************************************************************************************************
        //startsWit=boolean
        //endsWith=boolean
        //indexOf=int,-1
        //lastİndexOf=int,-1
        //contain=boolean
        System.out.println("1..................");
//        soru:yazıda 2. c olup olmadığını kontrolet
        System.out.println(str.indexOf("c",str.indexOf("c")+1));//-1 yani yok

//*****************************************************************************************************

      System.out.println(str.indexOf("c"));//emin değilsek sorgularız ya da ifle
      int ilkCindex = str.indexOf("c");
      if (str.indexOf("c") == -1) {
        System.out.println("cümlende c yoktur");
      } else  {
        System.out.println(" c var");

      }
      System.out.println(str.indexOf("i"));//i olduğuna emin değilsek sorgularız ya da ifle
      int ilkiindex = str.indexOf("i");
      if (str.indexOf("i") == -1) {//ilk i yoksa
        System.out.println("cümlende i yoktur");
      } else {
        System.out.println(" ilk i var");
      }
      System.out.println("3..................");
      //****************************************************************************************

      System.out.println(str.indexOf("i"));//2. i olduğuna emin değilsek sorgularız ya da ifle
      int ikinciİindex = str.indexOf("i");
      if ((str.indexOf("i")+1)== -1) {//ilk i den eminz var,ikinci i varsa yazdır;
        System.out.println("cümlende 2.i yoktur");
      } else {
        System.out.println("2.i var");
      }
      System.out.println("4..................");
      //****************************************************************************************

        System.out.println(str.indexOf("e"));//17 de var.
        System.out.println(str.indexOf("e",18));//bana 18. indexten sonraki e yi ver:20
        System.out.println(str.indexOf(" "));//bana 1. spacenin indexini ver:3
        System.out.println(str.indexOf(" ",4));//2. spacin indexi:9
        System.out.println(str.indexOf("e",20+1));//3. e nin indexi:26
        System.out.println(str.indexOf("e",str.indexOf("e")+1));//2. e nin ndexi DYNAMİC:20
        System.out.println(str.indexOf("l",str.indexOf("l")+1));//2. l nin ndexi DYNAMİC:13



    }
}
