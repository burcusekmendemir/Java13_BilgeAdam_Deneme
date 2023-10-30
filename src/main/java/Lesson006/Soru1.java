package Lesson006;

public class Soru1 {
    public static void main(String[] args) {
        /**
         * Bir dizideki tüm sayýlarýn topplamýný bulalým.
         * ve her sayý için bu sayý tektir veya bu sayý çifttir çýktýsýný verelim.
         */

        int [] sayilar= {1500,120,5,-256,1296,-462,159};
        int toplam=0;

        for (int i=0; i<sayilar.length;i++){
            toplam += sayilar[i];
            if (sayilar[i]%2==0){
                System.out.println("Çift sayý:" +sayilar[i]);
            } else {
                System.out.println("Tek sayý:" + sayilar[i]);
            }
        }
        System.out.println("toplam:" + toplam);


        //ekstra bilgi string lengthi için.
        String value="merhaba";
        for (int i=0; i<value.length(); i++){
            System.out.println(value.charAt(i));
        }
    }
}
