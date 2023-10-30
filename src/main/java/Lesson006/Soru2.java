package Lesson006;

import java.util.Scanner;

public class Soru2 {
    public static void main(String[] args) {

        /**
         * Öncelikle dýþarýdan bir dizi uzunluðu alalým
         * ve bir dizi tanýmlmayýp
         * o diziyi sýrayla gezerek dolduralým
         * daha sonra da  bütün elemnalarýný yazdýralým
         */

        Scanner sc=new Scanner(System.in);
        System.out.println("dizi uzunluðu giriniz:");
        int uzunluk= sc.nextInt();;
        String [] dizi = new String[uzunluk];

        for (int i=0; i< uzunluk; i++){
            System.out.print((i+1)+ " . elemaný giriniz...:");
            String sayi=new Scanner(System.in).nextLine();
            dizi[i]=sayi;
        }
        for (int i=0; i< dizi.length; i++){
            System.out.print (dizi[i] + ",");
        }
    }
}
