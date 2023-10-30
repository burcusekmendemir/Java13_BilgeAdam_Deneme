package Lesson005;

public class Soru2 {
    public static void main(String[] args) {
        /**
         * String de�erinin karakterleri rakam ise toplayal�m ve program sonunda toplam de�erini yazd�ral�m.
         * de�il ise bir string ile toplay�p program sonunda ��kt�s�n� verelim.
         */

        String value="125abc96xy8";
        //1.y�ntem:
        int toplam=0;
        String karakterler= "";

        for (int i=0; i<value.length(); i++){
            char karakter=value.charAt(i);
            if (Character.isDigit(karakter)){ //bu bir say� m� diye soruyor.
                int sayi=Character.getNumericValue(karakter);
                toplam+=sayi;
            }else {
                karakterler+=karakter;
            }
        }
        System.out.println(karakterler);
        System.out.println(toplam);

        //2. y�ntem:

        value="125abc96xy8";
        karakterler="";
        toplam=0;

        for (int i=0; i<value.length(); i++){
            char karakter=value.charAt(i);
            if (karakter>=48 && karakter<=57){ //karakterlerin ascii kodlar�ndan kontrol etti. 1-9 aras� ascii kodlar� 49-57
                int sayi2=Character.getNumericValue(karakter);
                toplam+=sayi2;
            }else {
                karakterler+=karakter;
            }
        }
        System.out.println(karakterler);
        System.out.println(toplam);
    }
}
