package Lesson006;

public class Soru4 {
    public static void main(String[] args) {
        /**
         * bir dizideki max min ve en b�y�k ikinci de�eri bulal�m
         */

// toplu yorum ctrl/

        int[] sayilar = { 0, 120, 5, 85, -256, 16, 1258, 240, 81, 14 };
        //int enbuyuk=sayilar[0], enkucuk=sayilar[0], enbuyuk2=sayilar[0]; //bu kodlar 0,1,2,3 gibi dizilerde hata verdi�i i�in min max value olarak yapt�k.
        int enbuyuk=Integer.MIN_VALUE, enkucuk=Integer.MAX_VALUE, enbuyuk2=Integer.MIN_VALUE;

        for (int i=0; i< sayilar.length; i++){
            if (enbuyuk<sayilar[i]){
                // enbuyuk2=enbuyuk;
                enbuyuk=sayilar[i];
            }
            if (enkucuk>sayilar[i]) {
                enkucuk=sayilar[i];
            }
            if (sayilar[i]<enbuyuk && enbuyuk2<sayilar[i] ){
                enbuyuk2=sayilar[i];
            }
        }
        System.out.println("en b�y�k say�:" + enbuyuk);
        System.out.println("en k���k say�:" + enkucuk);
        System.out.println("en b�y�k 2. say�:" + enbuyuk2);

    }
}
