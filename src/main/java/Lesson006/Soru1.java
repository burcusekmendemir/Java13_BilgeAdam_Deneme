package Lesson006;

public class Soru1 {
    public static void main(String[] args) {
        /**
         * Bir dizideki t�m say�lar�n topplam�n� bulal�m.
         * ve her say� i�in bu say� tektir veya bu say� �ifttir ��kt�s�n� verelim.
         */

        int [] sayilar= {1500,120,5,-256,1296,-462,159};
        int toplam=0;

        for (int i=0; i<sayilar.length;i++){
            toplam += sayilar[i];
            if (sayilar[i]%2==0){
                System.out.println("�ift say�:" +sayilar[i]);
            } else {
                System.out.println("Tek say�:" + sayilar[i]);
            }
        }
        System.out.println("toplam:" + toplam);


        //ekstra bilgi string lengthi i�in.
        String value="merhaba";
        for (int i=0; i<value.length(); i++){
            System.out.println(value.charAt(i));
        }
    }
}
