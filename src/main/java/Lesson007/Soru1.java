package Lesson007;

public class Soru1 {
    public static void main(String[] args) {
        /**
         * Bir ba�lang�� ve biti� de�eri arsa�ndaki s�ral� say�lardan e�er 3�n kat� ise bilge, 5in kat� ise adam, hem3
         * hem5in kat� ise bilgeadam yazd�ral�m.
         * int start=2;
         * int end=22;
         * ��kt� [2, bilge,4,adam,bilge,7,8,bilge,adam,11....]
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
