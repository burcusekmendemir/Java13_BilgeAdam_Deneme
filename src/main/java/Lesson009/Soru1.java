package Lesson009;

import java.util.Scanner;

/**
 * 1-bir string deðer alma methodu istiyorum
 * 2- iki stringi karþýlaþtýrýp doðru olup olmadýðýný dönen bir method
 * 3- method da girdiðimiz deðerin aslýnda dizimizde olup olmadýðýný söyleyen bir method olacak.
 */

public class Soru1 {
    public static void main(String[] args) {

        String [] dizi= {"Türkiye", "Japonya", "Danimarka", "Fransa"};
        String ulke=degerAl("Lütfen bir ülke giriniz.");
        System.out.println("Girdiðiniz ülke:" + ulke);

        //1. metot çaðýrma
        sonucGoster(dizideVarMi(ulke,dizi));
        //2. metot çaðýrma
        sonucGoster(dizideVarMi(degerAl("Lütfen bir ülke giriniz:".toUpperCase()),dizi));
        // 3. metot çaðýmr

        String ulke2= (degerAl("lütfen bir ülke girin:"));
        boolean kontrol=dizideVarMi(ulke2,dizi);
        sonucGoster(kontrol);

        //direk sonuç gösterir çünkü içine sonuc göster yazmýþtýk.
        dizideVarMi2(degerAl("lütfen ülke girn:"),dizi);


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

    //2. yöntem karsilastirmanin:
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
            System.out.println("Aradýðýnýz ülke bulundu");
        }else {
            System.out.println("Ülke bulunamadý");
        }
    }

    public static void sonucGoster2(boolean kontrol){
        if (kontrol){
            System.out.println("Aradýðýnýz ülke bulundu");
        }else {
            System.out.println("Ülke bulunamadý");
        }
    }




}//class sonu
