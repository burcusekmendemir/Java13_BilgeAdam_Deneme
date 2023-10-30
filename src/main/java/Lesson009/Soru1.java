package Lesson009;

import java.util.Scanner;

/**
 * 1-bir string de�er alma methodu istiyorum
 * 2- iki stringi kar��la�t�r�p do�ru olup olmad���n� d�nen bir method
 * 3- method da girdi�imiz de�erin asl�nda dizimizde olup olmad���n� s�yleyen bir method olacak.
 */

public class Soru1 {
    public static void main(String[] args) {

        String [] dizi= {"T�rkiye", "Japonya", "Danimarka", "Fransa"};
        String ulke=degerAl("L�tfen bir �lke giriniz.");
        System.out.println("Girdi�iniz �lke:" + ulke);

        //1. metot �a��rma
        sonucGoster(dizideVarMi(ulke,dizi));
        //2. metot �a��rma
        sonucGoster(dizideVarMi(degerAl("L�tfen bir �lke giriniz:".toUpperCase()),dizi));
        // 3. metot �a��mr

        String ulke2= (degerAl("l�tfen bir �lke girin:"));
        boolean kontrol=dizideVarMi(ulke2,dizi);
        sonucGoster(kontrol);

        //direk sonu� g�sterir ��nk� i�ine sonuc g�ster yazm��t�k.
        dizideVarMi2(degerAl("l�tfen �lke girn:"),dizi);


    }//main sonu

    public static String degerAl(String ulke){
        Scanner scanner=new Scanner(System.in);
        System.out.println(ulke);
        String metin= scanner.nextLine();

        return metin;
    }

    public static boolean karsilastirma(String ulke1, String ulke2){
        boolean kontrol=false;
        if (ulke1.equalsIgnoreCase(ulke2)){
            kontrol=true;
        }
        return kontrol;
    }

    //2. y�ntem karsilastirmanin:
    public static boolean karsilastirma2(String ulke1, String ulke2){
        return ulke1.equalsIgnoreCase(ulke2);
    }


    public static boolean dizideVarMi (String ifade, String [] dizi){
        boolean dizideVar=false;
        for (int i=0; i< dizi.length; i++){
            if(karsilastirma2(dizi[i], ifade )){
                dizideVar=true;
                break;
            }
        }
        return dizideVar;
    }
    public static void  dizideVarMi2 (String ifade, String [] dizi){
        boolean dizideVar=false;
        for (int i=0; i< dizi.length; i++){
            if(karsilastirma2(dizi[i], ifade )){
                dizideVar=true;
                break;
            }
        }
        sonucGoster(dizideVar);
    }

    public static void sonucGoster(boolean kontrol){
        if (kontrol){
            System.out.println("Arad���n�z �lke bulundu");
        }else {
            System.out.println("�lke bulunamad�");
        }
    }

    public static void sonucGoster2(boolean kontrol){
        if (kontrol){
            System.out.println("Arad���n�z �lke bulundu");
        }else {
            System.out.println("�lke bulunamad�");
        }
    }




}//class sonu
