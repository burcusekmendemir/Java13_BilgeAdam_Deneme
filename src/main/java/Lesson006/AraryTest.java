package Lesson006;

public class AraryTest {
    public static void main(String[] args) {
        /**
         * adana adlý þehirin plaka kodu: 01
         * adýyaman adý þehrin plaka kodu: 02
         *
         * þeklinde çýktýlar verilecek.
         * tekrar eden yapýalara göre stringi ayýr, bazý verileri tekrar ayýr buna göre bir çýktý yazýlacak
         * ;den böl split ile
         */

        String sehirler = "01-Adana;02-Adýyaman;03-Afyonkarahisar;04-Aðrý;05-Amasya;06-Ankara;07-Antalya;" +
                "08-Artvin;09-Aydýn;10-Balýkesir;42-Konya";

        String [] array= sehirler.split(";");
        //array[0] =01-Adana;


        for (int i=0; i<array.length; i++){

            int index=array[i].indexOf("-");
            System.out.println(array[i].substring(index+1)  + " adlý þehirin plaka kodu : "  + array[i].substring(0,index));

        }
    }
}
