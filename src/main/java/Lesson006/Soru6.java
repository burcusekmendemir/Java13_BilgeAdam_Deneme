package Lesson006;

public class Soru6 {
    public static void main(String[] args) {
        /**
         * Dizi içerisindeki 1 ve 4ün  adeti ve 1 sayýsýnýn adeti 4 sayýsýnýn adetinden büyük ise true
         * deðil ise false yazdýran algrotima.
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
        System.out.println("4ün adedi:" + sayac_4);
        System.out.println("1in adedi:" + sayac_1);

        if (sayac_1>sayac_4) System.out.println(true);
        else if (sayac_1<sayac_4) System.out.println(false);
        else System.out.println("Eþittir");
    }
}
