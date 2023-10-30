package Lesson005;

public class Soru2 {
    public static void main(String[] args) {
        /**
         * String deðerinin karakterleri rakam ise toplayalým ve program sonunda toplam deðerini yazdýralým.
         * deðil ise bir string ile toplayýp program sonunda çýktýsýný verelim.
         */

        String value="125abc96xy8";
        //1.yöntem:
        int toplam=0;
        String karakterler= "";

        for (int i=0; i<value.length(); i++){
            char karakter=value.charAt(i);
            if (Character.isDigit(karakter)){ //bu bir sayý mý diye soruyor.
                int sayi=Character.getNumericValue(karakter);
                toplam+=sayi;
            }else {
                karakterler+=karakter;
            }
        }
        System.out.println(karakterler);
        System.out.println(toplam);

        //2. yöntem:

        value="125abc96xy8";
        karakterler="";
        toplam=0;

        for (int i=0; i<value.length(); i++){
            char karakter=value.charAt(i);
            if (karakter>=48 && karakter<=57){ //karakterlerin ascii kodlarýndan kontrol etti. 1-9 arasý ascii kodlarý 49-57
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
