package Lesson006;

import java.util.Locale;

public class Notlar {
    public static void main(String[] args) {
        String value1= "Burcu Sekmen DEM�R";
        String value2= "    Burcu Sekmen DEM�R    ";
        String value3= "Burcu Sekmen DEM�R";
        String value4= new String("Burcu Sekmen DEM�R"); //sonra i�lenecek.

        System.out.println(value1.lastIndexOf("e")); //metin i�erisindeki bir de�erin son indexini verir.
        System.out.println(value1.indexOf("e")); //metin i�erisindeki bir de�erin ilk indexini verir.
        System.out.println(value1.indexOf("x")); //metin i�erisinde arad���m�z de�er yoksa -1 verir.
        System.out.println(value1.charAt(1));
        System.out.println(value1.charAt(0));
        System.out.println(value1.charAt(11));
        System.out.println(value2);
        System.out.println(value2.trim()); // ba�taki ve sondaki bo�luklar� temizler.
        System.out.println(value1.contains("B")); //true gelir k���k olsa false gelirdi.
        System.out.println(value1.contains("e")); //bir metinin bir kelimeyi i�erip i�ermedi�ini g�sterir.7
        System.out.println(value1.substring(1,9)); // ba�lang�� indexini dahil eder, biti� indexini dahil etmiyor.
        System.out.println(value1.substring(1)); // metini par�alamak i�in kullan�lan bir methodtur. e�er biti� indexi vremezsek ba�lang�� indexinden sonuna kadar b�ler.
        System.out.println(value1.toUpperCase()); //t�m harfleri b�y�tmek i�n kullan�lan method.
        System.out.println(value1.toLowerCase()); // t�m harfleri k���ltmek i�in kullan�lan method.
        System.out.println(value1.toUpperCase(Locale.ENGLISH));
        System.out.println(value1.replace("e", "a"));
        //value1=value1.replace("e","a"); //b�yle tekrar tan�mlarsak kal�c� de�i�tirir yoksa tekrar bir sonrakinde eski hale gelir.
        System.out.println(value1.replace("Burcu", "burak"));
        System.out.println(value1.equals(value2)); //false verir, bo�luklarda bir karakterdir.
        System.out.println(value1.equals(value2.trim())); // true ��kar bo�luklar� sildi e�itledik. == koyarsak false ��kar ��nk� adresleri farkl�.
        System.out.println(value1==(value3)); //true
        System.out.println(value1==(value4)); //false
        String value5="burcu sekmen demir";
        System.out.println(value1.equalsIgnoreCase(value5)); //true; i�eirkleri ayn�ysa true diyor, b�y�k k���k harf duyarl�l��� olmadan denk mid iye bak�yor.

        System.out.println(value1.endsWith("a"));
        System.out.println(value1.endsWith("R")); // bu karakterle bitiyor mu true false
        System.out.println(value1.startsWith("B")); // bu karakterle ba�l�yor mu true false

        String value6= "Java-React-Css";
        String [] array= value6.split("-");
        for (int i=0; i<array.length; i++){
            System.out.println(array[i]);
        }

        String value7="10";
        System.out.println(5+value7);

        int sayi1=Integer.parseInt(value7); // bir string de�eri int de�erine �evirir.
        System.out.println(sayi1);
        System.out.println(5+sayi1);

        //int sayi2=Integer.parseInt(value5); //de�erin say� olmas� laz�m hata verdi.
        //System.out.println(sayi2);

        System.out.println(value1.length()); //uzunlu�unu verir.
    }
}
