package Lesson006;

public class Soru4 {
    public static void main(String[] args) {
        /**
         * bir dizideki max min ve en büyük ikinci deðeri bulalým
         */

// toplu yorum ctrl/

        int[] sayilar = { 0, 120, 5, 85, -256, 16, 1258, 240, 81, 14 };
        //int enbuyuk=sayilar[0], enkucuk=sayilar[0], enbuyuk2=sayilar[0]; //bu kodlar 0,1,2,3 gibi dizilerde hata verdiði için min max value olarak yaptýk.
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
        System.out.println("en büyük sayý:" + enbuyuk);
        System.out.println("en küçük sayý:" + enkucuk);
        System.out.println("en büyük 2. sayý:" + enbuyuk2);

    }
}
