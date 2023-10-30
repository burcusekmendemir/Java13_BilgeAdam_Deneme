package Lesson007;

import java.util.Scanner;

public class Soru2 {
    public static void main(String[] args) {
        /**
         *  Türkçe karakterleri inglizce karakterler çevirme
         * 'Ý', 'ý', 'þ', 'Þ', 'ç', 'Ç', 'ð', 'Ð', 'ü', 'Ü', 'ö', 'Ö'
         * dýþarýdan bir kelime gireceðiz, bu kelime içerisinde geçen
         * türkçe karakterleri ing karakterlere dönüþtüreceðiz ;
         */

        Scanner sc=new Scanner(System.in);
        System.out.println("kelime giriniz:");
        String kelime= sc.nextLine();

        char [] turkceharfler= {'Ý', 'ý', 'þ', 'Þ', 'ç', 'Ç', 'ð', 'Ð', 'ü', 'Ü', 'ö', 'Ö'};
        char [] ingharfler={'I', 'i', 's', 'S', 'c', 'C', 'g', 'G', 'u', 'U', 'o', 'O'};

        for (int i=0; i< kelime.length(); i++){
            for(int j=0; j< turkceharfler.length; j++){
                if (kelime.charAt(i)==turkceharfler[j]){
                    kelime=kelime.replace(kelime.charAt(i),ingharfler[i]);
                    break;
                }
            }

        }
        System.out.println(kelime);

        //Diðer yöntem:
        kelime= sc.nextLine();

        for (int i=0; i< turkceharfler.length; i++){
            kelime=kelime.replace(turkceharfler[i], ingharfler[i] );
        }
        System.out.println(kelime);

    }
}
