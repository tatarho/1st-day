package der06_increment_decrement;

public record C02_decrement() {
    public static void main(String[] args) {
//variable değeri 3 şekilde azaltılır.

        int sayi=10;
        sayi    =sayi-3; //7
        sayi-=3;//4
        sayi--;//sadece 1 eksiltir.3
        System.out.println(sayi);
    }
}
