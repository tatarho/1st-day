package der14_ForLoop_nestedForLoop;

import java.util.Scanner;

public class C03_SayiYazdirma_fizzbuzz {
    public static void main(String[] args) {
//        soru:
//        kullanıcıdan pozitif birtamsayı al
//        1 den başlayarak tüm tam yazdır
//        dönen sayılarda 3 ile tam bölünebilen bir sayıya gelirse fizz yazdır
//        5 ile tam bölünende buzz yazdır
//        hem 3 hemde 5 e tam bölünebiliyorsa fizzbuzz yazdır.
        Scanner scanner = new Scanner(System.in);
        System.out.println("içinde 3 ve 5 ile tam bölünebilme durumununu görmek istediğiniz sayınızı giriniz");
        int sayi = scanner.nextInt();

        for (int i = 1; i<=sayi ; i++) {



            System.out.print(i);
            if (i%3==0){
                System.out.print("(fizz) ");
            }if (i%5==0){
                System.out.print("(buzz) ");
//            }if(i%3==0&&i%5==0){
//                System.out.print("(fizzbuzz) ");
            }
        }

    }
}
