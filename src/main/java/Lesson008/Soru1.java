package Lesson008;

import java.util.Scanner;

public class Soru1 {
    public static void main(String[] args) {
        /**
         * Bir method yazalım, bu method bize dışarıdan 2 tane sayı alacak ve bunları bir arraye atayacak
         * daha sonra arrayin ilk 2 elemanının çarpımını dönecek.
         */

        System.out.println("1. sayıyı giriniz:");
       int s1= new Scanner(System.in).nextInt();
       System.out.println("2. sayıyı giriniz:");
       int s2= new Scanner(System.in).nextInt();
       int sonuc=carpim(s1,s2);
       System.out.println("1. yöntemle  sonucu:" + sonuc);


        int[]dizi=diziyeEkle(s1,s2);
        int sonuc2=carpim(dizi);
        System.out.println("2. yöntemle sonuc:" + sonuc2);


        System.out.println("*****3.yöntemle********");
        int sayi1=sayiAl();
        int sayi2=sayiAl();
        int [] dizi2=diziyeEkle(sayi1,sayi2);
        int sonuc3= carpim(sayi1,sayi2);
        System.out.println("3. yöntem sonucu:" + sonuc3);



    }//main sonu

    public static int sayiAl(){

        System.out.println("sayıyı giriniz:");
        int s1= new Scanner(System.in).nextInt();
        return s1;
    }

    public static int carpim(int sayi1, int sayi2){
        int [] dizi= {sayi1,sayi2};
        int islem= dizi[0] * dizi[1];
        return islem;
    }

    //Diğer yöntemle çözüm:

    public static int [] diziyeEkle(int sayi1, int sayi2){
        int [] dizi= {sayi1,sayi2};
        return dizi;
    }

    public static int carpim(int [] dizi){
        int sonuc=0;
        if (dizi.length>=2){
            sonuc=dizi[0]*dizi[1];
        }else {
            System.out.println("Dizinin boyutu 2den kucuk");
        }
        return sonuc;
    }

}//class sonu
