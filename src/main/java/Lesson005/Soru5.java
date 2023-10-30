package Lesson005;

import java.util.Scanner;

public class Soru5 {
    public static void main(String[] args) {
        /**
         * Dýþarýdan girilen kelimenin palindrom olup olmadýðýný kontrol edelim.
         * kek, kabak,iyi
         * bu algoritme en çok karþýmýza çýakcak þey iþ görüþmelerined vs.
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
            System.out.println("palindrom deðildir");
        }


        //2. çözüm:
        boolean kontrol=true;
        for (int i=0; i<kelime.length()/2;  i++){ //kelimenin yarýsýndan kontrol ediyor
            if (kelime.charAt(i)!= kelime.charAt(kelime.length()-1-i)){
                kontrol=false;
                break;
            }
        }
        if (kontrol){
            System.out.println("palindromdur");
        }else {
            System.out.println("palindrom deðildir");
        }


        /**
         * stack bellek heap bellek,referans tür primitive türü oku!
         * wrapper class nedir
         * unboxing autoboxing özellikler nedir
         */
    }
}
