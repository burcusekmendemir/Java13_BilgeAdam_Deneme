package Lesson006;

import java.util.Scanner;

public class Soru3 {
    public static void main(String[] args) {


        /**
         * Kullan�c�dan bir �lke ismi alaca��z
         * daha sonra bu �lke ismi e�er arrayimde varsa girid�iniz �lke bulundu
         * yoksa girdi�iniz �lke bulunamad� ��kt�s� verelim.
         */
        String [] dizi= {"T�rkiye", "Japonya", "Danimarka", "Fransa"};

        Scanner sc=new Scanner(System.in);
        System.out.println("�lke ismi giriniz:");
        String ulke= sc.nextLine();

        boolean kontrol=false;

        for (int i=0; i< dizi.length; i++) {
            if (ulke.equalsIgnoreCase(dizi[i])){
                kontrol=true;
                break;
            }
        }
        if (kontrol){
            System.out.println("girdi�iniz �lke bulundu.");
        }else {
            System.out.println("�lke bulunamad�.");
        }

        //2. y�ntemle
        String sonuc="Girdi�iniz �lke bulunamad�";
        for (int i=0; i< dizi.length; i++) {
            if (ulke.equalsIgnoreCase(dizi[i])){
                sonuc="Girdi�iniz �lke bulundu";
                break;
            }
        }
        System.out.println(sonuc);
    }
}
