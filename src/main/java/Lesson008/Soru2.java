package Lesson008;

public class Soru2 {

    /**
     * Dizideki elemanlar arasındaki farkın en kucuk olduğu değer nedir, bir method içinde yazılacak.
     */
    public static void main(String[] args) {

        int [] array={50,12,-40,35,41,85};
        int sonuc=farkiBul(array);
        System.out.println("En küçük fark:" + sonuc);
        //System.out.println(Math.abs(-4)); //mutlak değeri alır.

    }//main sonu

    public static int farkiBul(int [] array) {

        if (array.length<2){
            return 0;
        }else {
            int enkucuk = Integer.MAX_VALUE;
            for (int i = 0; i < array.length; i++) {
                for (int j = i + 1; j < array.length; j++) {
                    int fark = Math.abs(array[i] - array[j]);
                    if (fark < enkucuk) {
                        enkucuk = fark;
                    }
                }
            }
            return enkucuk;
        }
    }


}//class sonu
