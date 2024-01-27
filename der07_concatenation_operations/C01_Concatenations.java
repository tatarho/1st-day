package der07_concatenation_operations;

public class C01_Concatenations {
    public static void main(String[] args) {//concat=birleştirmek demektir.
        int a=99;
        int b=49;
        System.out.println(a+b);
        System.out.println("verilen 20 ve 30 değerlerinin toplamı :"+(50));
        System.out.println("verilen "+a+" ve "+b+" değerlerinin toplamı :"+(a+b));
// sayılar değiştirildiğinde aynı işlemi yapar.
//string bir variableyi int ile concat yapabilir ama kuralları vardır parantez ve tırnaklar önemli yer tutar.
        System.out.println("toplamı parantez içine almazsam " +
                "bunu string miş gibi algılayıp yan yana yazar "+a+b+" gibi.");

//***********************************************************************************************************
//SORU: Verilen intleri ve string leri kullanarak ŞU YAZILARI YAZDIRINIZ.************************************

//     1- 12 Java kolay;
//     2- 7 Java kolay;
//     3- 34Java kolay;
//     4- Java12kolay;
//     5- Java34kolay;
//     6- Java7kolay;

        String s1="Java";
        String s2=" ";
        String s3="kolay";
        String s4="";
        int c=3;
        int d=4;
        System.out.println("1-"+(c*d)+s2+s1+s2+s3);
        System.out.println("2-"+(c+d)+s2+s1+s2+s3);
        System.out.println("3-"+c+d+s2+s1+s2+s3);
        System.out.println("4-"+s1+c*d+s3);
        System.out.println("1-"+s1+c+d+s3);
        System.out.println("1-"+s1+(c+d)+s3);




    }
}
