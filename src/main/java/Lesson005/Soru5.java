package Lesson005;

import java.util.Scanner;

public class Soru5 {
    public static void main(String[] args) {
        /**
         * D��ar�dan girilen kelimenin palindrom olup olmad���n� kontrol edelim.
         * kek, kabak,iyi
         * bu algoritme en �ok kar��m�za ��akcak �ey i� g�r��melerined vs.
         */

        Scanner sc=new Scanner(System.in);
        System.out.println("Bir kelime giriniz:");
        String kelime = sc.nextLine();
        String terskelime="";

        for (int i=kelime.length()-1; i>=0; i--){
            terskelime += kelime.charAt(i);
        }
        System.out.println(terskelime);

        if (kelime.equals(terskelime)){
            System.out.println("palindromdur");
        }else {
            System.out.println("palindrom de�ildir");
        }


        //2. ��z�m:
        boolean kontrol=true;
        for (int i=0; i<kelime.length()/2;  i++){ //kelimenin yar�s�ndan kontrol ediyor
            if (kelime.charAt(i)!= kelime.charAt(kelime.length()-1-i)){
                kontrol=false;
                break;
            }
        }
        if (kontrol){
            System.out.println("palindromdur");
        }else {
            System.out.println("palindrom de�ildir");
        }


        /**
         * stack bellek heap bellek,referans t�r primitive t�r� oku!
         * wrapper class nedir
         * unboxing autoboxing �zellikler nedir
         */
    }
}
