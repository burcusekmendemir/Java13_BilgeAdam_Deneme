package Lesson009;

public class Soru2 {
    public static void main(String[] args) {

        /**
         * metot veya metotlar yazarak bu arraydeki tek sayýlarý baþka bir tek boyutlu arrayde toplayalým.
         */

        int[][] matris = { { 56, 23, 678, 231, 5 }, { 234, 21, 78, 26, 6 }, { 654, 33, 32, 67, 2 }, {189, 35, 56, 89, 8 } };


        int []array=tekSayilar(matris);

        for (int i=0; i<array.length; i++){
            if (array[i]!=0){
                System.out.println(array[i]);
            }
        }

    }//main sonu

    public static int[] tekSayilar(int [] [] matris){

        int [] yeniDizi=new int[matris.length * matris[0].length];
        int sayac=0;
        for (int i=0; i< matris.length; i++){
            for (int j=0; j< matris[i].length; j++){
                if (matris[i][j]%2!=0){
                    yeniDizi[sayac]=matris[i][j];
                    sayac++;
                }
            }
        }
        return yeniDizi;
    }
    public static int[] tekSayila2(int [] [] matris){


        int [] yeniDizi=new int[matris.length * matris[0].length];
        int sayac=0;
        for (int i=0; i< matris.length; i++){
            for (int j=0; j< matris[i].length; j++){
                if (matris[i][j]%2!=0){
                    yeniDizi[sayac]=matris[i][j];
                    sayac++;
                }
            }
        }
        return yeniDizi;
    }
    public static void tekSayilariBul (int [] [] matris){ //int [] oluvak izlr bunu eksik cevap

        int [] yeniDizi=new int[matris.length * matris[0].length];
        int sayac=0;
        for (int i=0; i< matris.length; i++){
            for (int j=0; j< matris[i].length; j++){
                if (matris[i][j]%2!=0){
                    sayac++;
                }
            }
        }
       // return sayac;

        for(int sayi  : yeniDizi ){ //foreach kullanýmý
            System.out.println(sayi);
        }

    }



}//class sonu
