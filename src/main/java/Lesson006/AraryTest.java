package Lesson006;

public class AraryTest {
    public static void main(String[] args) {
        /**
         * adana adl� �ehirin plaka kodu: 01
         * ad�yaman ad� �ehrin plaka kodu: 02
         *
         * �eklinde ��kt�lar verilecek.
         * tekrar eden yap�alara g�re stringi ay�r, baz� verileri tekrar ay�r buna g�re bir ��kt� yaz�lacak
         * ;den b�l split ile
         */

        String sehirler = "01-Adana;02-Ad�yaman;03-Afyonkarahisar;04-A�r�;05-Amasya;06-Ankara;07-Antalya;" +
                "08-Artvin;09-Ayd�n;10-Bal�kesir;42-Konya";

        String [] array= sehirler.split(";");
        //array[0] =01-Adana;


        for (int i=0; i<array.length; i++){

            int index=array[i].indexOf("-");
            System.out.println(array[i].substring(index+1)  + " adl� �ehirin plaka kodu : "  + array[i].substring(0,index));

        }
    }
}
