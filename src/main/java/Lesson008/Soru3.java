package Lesson008;

import java.util.Scanner;

/**
 * Dışarıdan 2 sayı alacağız bunu en büyük ortak bölenini bulacağız. (ebob)
 * bir metot yazarak bulalım.
 * daha sonra mainde en kucuk ortak katı bulalım.(ekok)
 * ekok=(sayi1*sayi2)/ebob
 */

public class Soru3 {
    public static void main(String[] args) {

        System.out.println("Lutfen sayı giriniz:");
        int sayi1=new Scanner(System.in).nextInt();
        System.out.println("Lutfen sayı giriniz:");
        int sayi2=new Scanner(System.in).nextInt();

        System.out.println("Ebob:" + ebobBulma(sayi1,sayi2));
        System.out.println("Ekok:" + ekokBulma(sayi1,sayi2));


        System.out.println("Ebob2:" + ebobBulma2());
       


    }//main sonu

    public static int ebobBulma (int sayi1, int sayi2){

        int ebob=0;
        for(int i=1; i<sayi1; i++){
            if (sayi1%i==0 && sayi2%i==0){
                ebob=i;
            }
        }
        return ebob;
    }
    public static int ekokBulma (int sayi1, int sayi2){
        int ekok= (sayi1*sayi2)/ebobBulma(sayi1,sayi2);
        return ekok;
    }


    //Diğer yöntemle
    public static int ebobBulma2(){
        System.out.println("Lutfen sayı giriniz:");
        int sayi1=new Scanner(System.in).nextInt();
        System.out.println("Lutfen sayı giriniz:");
        int sayi2=new Scanner(System.in).nextInt();

        int ebob=1;
        int enkucuk=sayi1;
        if (sayi1==sayi2){
            ebob=sayi2;
            return ebob;
        }else if (sayi1<sayi2){
            enkucuk=sayi1;
        }else {
            enkucuk=sayi2;
        }
        while (enkucuk>0){
            if (sayi1%enkucuk==0 && sayi2%enkucuk==0){
                ebob=enkucuk;
                break;
            }
            enkucuk--;
        }
        return ebob;
    }



}//class sonu
