package Lesson008;

import java.util.Random;
import java.util.Scanner;

public class Odev_Method {
    public static void main(String[] args) {

       tahminEdilenSayilar(sayiTahminEt());

    }//main sonu


    public static int [] sayiTahminEt(){
        Random random=new Random();
        int randomSayi= random.nextInt(1,750);
        int sayac=5;
        int [] tahminler=new int[sayac];

        for(int i=0; i<tahminler.length; i++){
            System.out.println("Lütfen 1-750 arası bir sayı tahmin ediniz:");
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
        return tahminler;
    }

    public static int [] tahminEdilenSayilar(int [] tahminler){
        String sayilar="";
        int [] tahminlerDizisi =new int[tahminler.length];
        for (int i=0; i<tahminler.length; i++){
            sayilar+=tahminler[i] + "-";
        }
        System.out.println("Tahmin ettiğiniz sayılar:" + sayilar );
        return tahminlerDizisi;
    }

}//class sonu
