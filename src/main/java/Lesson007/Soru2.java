package Lesson007;

import java.util.Scanner;

public class Soru2 {
    public static void main(String[] args) {
        /**
         *  T�rk�e karakterleri inglizce karakterler �evirme
         * '�', '�', '�', '�', '�', '�', '�', '�', '�', '�', '�', '�'
         * d��ar�dan bir kelime girece�iz, bu kelime i�erisinde ge�en
         * t�rk�e karakterleri ing karakterlere d�n��t�rece�iz ;
         */

        Scanner sc=new Scanner(System.in);
        System.out.println("kelime giriniz:");
        String kelime= sc.nextLine();

        char [] turkceharfler= {'�', '�', '�', '�', '�', '�', '�', '�', '�', '�', '�', '�'};
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

        //Di�er y�ntem:
        kelime= sc.nextLine();

        for (int i=0; i< turkceharfler.length; i++){
            kelime=kelime.replace(turkceharfler[i], ingharfler[i] );
        }
        System.out.println(kelime);

    }
}
