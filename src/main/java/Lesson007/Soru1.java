package Lesson007;

public class Soru1 {
    public static void main(String[] args) {
        /**
         * Bir başlangıç ve bitiş değeri arsaındaki sıralı sayılardan eğer 3ün katı ise bilge, 5in katı ise adam, hem3
         * hem5in katı ise bilgeadam yazdıralım.
         * int start=2;
         * int end=22;
         * çıktı [2, bilge,4,adam,bilge,7,8,bilge,adam,11....]
         */

        int start=2;
        int end=30;
        int sayac=0;

        String [] array= new String [end-start+1];

        for (int i=start; i<=end; i++){
            if (i%3==0 && i%5==0){
                array[sayac]="bilgeadam";
            }
            else if (i%5==0) {
                array[sayac]="adam";
            }
            else if (i%3==0 ) {
                array[sayac]="bilge";

            }else {
                array[sayac]=String.valueOf(i);
//                 array[sayac]=Integer.toString(i);
//                 array[sayac]= i+"";
            }
            sayac++;
        }
        for (int i=0; i<array.length; i++){
            System.out.print(array[i] + ",");
        }
    }
}
