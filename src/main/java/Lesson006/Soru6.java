package Lesson006;

public class Soru6 {
    public static void main(String[] args) {
        /**
         * Dizi i�erisindeki 1 ve 4�n  adeti ve 1 say�s�n�n adeti 4 say�s�n�n adetinden b�y�k ise true
         * de�il ise false yazd�ran algrotima.
         */


        int[] sayilar = { 1,4, 5, 6, 1, 1, 4, 8,4 };
        int sayac_4= 0;
        int sayac_1=0;
        for (int i=0; i< sayilar.length; i++){
            if (sayilar[i]==4){
                sayac_4++;
            }
            else if (sayilar[i]==1) {
                sayac_1++;

            }
        }
        System.out.println("4�n adedi:" + sayac_4);
        System.out.println("1in adedi:" + sayac_1);

        if (sayac_1>sayac_4) System.out.println(true);
        else if (sayac_1<sayac_4) System.out.println(false);
        else System.out.println("E�ittir");
    }
}
