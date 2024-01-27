package der15_MethodOlusturma;

import java.util.Scanner;

public class C04_PozitifTamBolenleriYazdir {
    public static void main(String[] args) {
//    soru:kullanınıcıdan main metod içinde bir tamsayı al
//         girilen sayının pozitif tam bölenlerini yanyana
//        yazdıran bir metod oluştur.

        Scanner scanner = new Scanner(System.in);
        System.out.println("Lütfen bir pozitif tamsayı giriniz");
        int sayi = scanner.nextInt();

        pozitifTamBolenleriYazdir(sayi);//(argüment)
        //pozitifTamBolenleriYazdir("sana");//(argüment)
        //pozitifTamBolenleriYazdir(true);//(argüment)

        pozitifTamBolenleriYazdir('z');//(argüment ascii kabul eder)
        //argüment ve parametre uyumlu olmazsa CTE hatası alırsın.
    }

    public static void pozitifTamBolenleriYazdir(int sayi) {//(parametre)

        for (int i = 1; i <= sayi; i++) {//yazdıran methodlarla:sentaxta void kullan,for+if methodu yeterlidir,sout yok,çağırırken var
                                         //döndüren methodlar:sentaxta int kullan flag,sayaç kullanılır,sout ile çağrılır,sout var,çağırırken yok.

            if (sayi % i == 0) {
                System.out.print(i+" ");
            }

            }
        }
    }









