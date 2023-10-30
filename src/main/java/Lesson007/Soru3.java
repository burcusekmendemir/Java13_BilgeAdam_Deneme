package Lesson007;

import java.util.Arrays;

public class Soru3 {
    public static void main(String[] args) {
        /**
         * 1 ile 10 arasýndaki sayýlarýn çarpým tablosunu çift boyutlu bir arrayde toplayalým.
         *
         * 0 0 ={1x1=1}        1 0 { 2x1=2}
         * 0 1 {1x2=2}
         *
         * 0 9 { 1x10=10}
         *
         */


        int [] [] carpimtablosu= new int[10][10];
        for (int i=1; i<=carpimtablosu.length; i++){
            for (int j=1; j<=carpimtablosu.length; j++){
                System.out.println(Integer.toString(i) + " x " + Integer.toString(j) + " = " + (i*j) + " ");

            }
        }

        String [] [] carpimtablosu2= new String[10][10];
        for (int i=0; i<carpimtablosu2.length; i++){
            for (int j=0; j<carpimtablosu[i].length; j++){
                carpimtablosu2[i][j]=(i+1) + " x " + (j+1) + " = " + ((i+1)*(j+1));
                System.out.println(carpimtablosu2[i][j]);
            }
        }
        System.out.println(carpimtablosu2);

        int [] dizi= {56,89,75,63,12};
        System.out.println(dizi);
        System.out.println(Arrays.toString(dizi));

        /**
         * {
         *
         */

        for (int i=0; i< carpimtablosu2.length; i++){
            System.out.println(Arrays.toString(carpimtablosu2[i]));
        }
    }
}
