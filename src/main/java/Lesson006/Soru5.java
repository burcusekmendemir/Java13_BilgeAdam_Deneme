package Lesson006;

public class Soru5 {
    public static void main(String[] args) {

        /**
         * Bir dizide ard arda gelen 2 indexdeki sayý deðeri 2 ise true yazdýrýp döngüyü sonlandýralým.
         * yoksa false yazdýralým.
         */

        boolean kontrol=false;

        int[] sayilar = { 2, -256, 16, 1258, 5, 2 };
        for (int i=0; i< (sayilar.length-1); i++){
            if (sayilar[i]==2 && sayilar[i+1]==2) {
                kontrol = true;
                break;
            }
        }
        System.out.println(kontrol);

        //2. yöntem:
        kontrol=false;
        for (int i=1; i< sayilar.length; i++){
            if (sayilar[i]==2 && sayilar[i-1]==2) {
                kontrol = true;
                break;
            }
        }
        System.out.println(kontrol);
    }
}
