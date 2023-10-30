package Lesson008;

import java.util.Random;
import java.util.Scanner;

/**
 * Saı tahmin oyunu
 * 5 adet hakkımız olacak
 * program başlangıçta bize rastgele bir sayı üretecek(1 ile 750 arası sayı üretsin)
 * hakkımız bitene kadar tahminde bulunacağız
 * eğer tahmin ettiğimiz sayı üretilen sayıdan buyuk ise tahmininizi azaltın
 * eğer tahmin ettiğimiz sayı üretilen sayıdan kucuk ise tahmininizi arttırın desin.
 * eğer bir hakkımızda sayııyı tahmin edebilmişse program sonlansın
 * eğere edememiş ve hakkımız bitmişse üzgünüz tahmin hakkınız bitti diye bir çıktı verelim.
 * ve önceki tahminlerinizi de bir arrayde tutalım.
 * oyun sonunda da tahminleriniz diye de yazdıralım.
 *
 *
 */

public class Odev {
    public static void main(String[] args) {

        Random random=new Random();
        int randomSayi= random.nextInt(1,10);
        int sayac=5;
        int [] tahminler=new int[sayac];



        for(int i=0; i<tahminler.length; i++){
                System.out.println("Lütfen bir sayı tahmin ediniz:");
                tahminler[i] = new Scanner(System.in).nextInt();

                if (tahminler[i]==randomSayi){
                    System.out.println("Tebrikler tahmininiz doğru! Tahmin edilen sayı: " + tahminler[i]);
                    break;
                }
                else if (tahminler[i] > randomSayi) {
                    System.out.println("Lütfen tahmininizi azaltın!");
                } else if (tahminler[i] < randomSayi) {
                    System.out.println("Lütfen tahmininizi arttırın!");
                }
                sayac--;
                if (sayac==0){
                    System.out.println("Üzgünüz tahmin hakkınız bitti! Tahmin edilmesi gereken sayı:" + randomSayi);
                }

        }

        String sayilar="";
        for (int i=0; i<tahminler.length; i++){
            sayilar+=tahminler[i] + "-";
        }
        System.out.println("Tahmin ettiğiniz sayılar:" + sayilar );

        System.out.println("Program sonlandı!!!" );

    }//main sonu

}//class sonu
