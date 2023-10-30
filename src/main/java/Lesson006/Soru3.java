package Lesson006;

import java.util.Scanner;

public class Soru3 {
    public static void main(String[] args) {


        /**
         * Kullanýcýdan bir ülke ismi alacaðýz
         * daha sonra bu ülke ismi eðer arrayimde varsa giridðiniz ülke bulundu
         * yoksa girdiðiniz ülke bulunamadý çýktýsý verelim.
         */
        String [] dizi= {"Türkiye", "Japonya", "Danimarka", "Fransa"};

        Scanner sc=new Scanner(System.in);
        System.out.println("Ülke ismi giriniz:");
        String ulke= sc.nextLine();

        boolean kontrol=false;

        for (int i=0; i< dizi.length; i++) {
            if (ulke.equalsIgnoreCase(dizi[i])){
                kontrol=true;
                break;
            }
        }
        if (kontrol){
            System.out.println("girdiðiniz ülke bulundu.");
        }else {
            System.out.println("ülke bulunamadý.");
        }

        //2. yöntemle
        String sonuc="Girdiðiniz ülke bulunamadý";
        for (int i=0; i< dizi.length; i++) {
            if (ulke.equalsIgnoreCase(dizi[i])){
                sonuc="Girdiðiniz ülke bulundu";
                break;
            }
        }
        System.out.println(sonuc);
    }
}
