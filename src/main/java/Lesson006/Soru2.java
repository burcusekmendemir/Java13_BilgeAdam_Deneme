package Lesson006;

import java.util.Scanner;

public class Soru2 {
    public static void main(String[] args) {

        /**
         * �ncelikle d��ar�dan bir dizi uzunlu�u alal�m
         * ve bir dizi tan�mlmay�p
         * o diziyi s�rayla gezerek doldural�m
         * daha sonra da  b�t�n elemnalar�n� yazd�ral�m
         */

        Scanner sc=new Scanner(System.in);
        System.out.println("dizi uzunlu�u giriniz:");
        int uzunluk= sc.nextInt();;
        String [] dizi = new String[uzunluk];

        for (int i=0; i< uzunluk; i++){
            System.out.print((i+1)+ " . eleman� giriniz...:");
            String sayi=new Scanner(System.in).nextLine();
            dizi[i]=sayi;
        }
        for (int i=0; i< dizi.length; i++){
            System.out.print (dizi[i] + ",");
        }
    }
}
