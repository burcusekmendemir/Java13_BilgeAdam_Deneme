package Lesson006;

import java.util.Locale;

public class Notlar {
    public static void main(String[] args) {
        String value1= "Burcu Sekmen DEMÝR";
        String value2= "    Burcu Sekmen DEMÝR    ";
        String value3= "Burcu Sekmen DEMÝR";
        String value4= new String("Burcu Sekmen DEMÝR"); //sonra iþlenecek.

        System.out.println(value1.lastIndexOf("e")); //metin içerisindeki bir deðerin son indexini verir.
        System.out.println(value1.indexOf("e")); //metin içerisindeki bir deðerin ilk indexini verir.
        System.out.println(value1.indexOf("x")); //metin içerisinde aradýðýmýz deðer yoksa -1 verir.
        System.out.println(value1.charAt(1));
        System.out.println(value1.charAt(0));
        System.out.println(value1.charAt(11));
        System.out.println(value2);
        System.out.println(value2.trim()); // baþtaki ve sondaki boþluklarý temizler.
        System.out.println(value1.contains("B")); //true gelir küçük olsa false gelirdi.
        System.out.println(value1.contains("e")); //bir metinin bir kelimeyi içerip içermediðini gösterir.7
        System.out.println(value1.substring(1,9)); // baþlangýç indexini dahil eder, bitiþ indexini dahil etmiyor.
        System.out.println(value1.substring(1)); // metini parçalamak için kullanýlan bir methodtur. eðer bitiþ indexi vremezsek baþlangýç indexinden sonuna kadar böler.
        System.out.println(value1.toUpperCase()); //tüm harfleri büyütmek içn kullanýlan method.
        System.out.println(value1.toLowerCase()); // tüm harfleri küçültmek için kullanýlan method.
        System.out.println(value1.toUpperCase(Locale.ENGLISH));
        System.out.println(value1.replace("e", "a"));
        //value1=value1.replace("e","a"); //böyle tekrar tanýmlarsak kalýcý deðiþtirir yoksa tekrar bir sonrakinde eski hale gelir.
        System.out.println(value1.replace("Burcu", "burak"));
        System.out.println(value1.equals(value2)); //false verir, boþluklarda bir karakterdir.
        System.out.println(value1.equals(value2.trim())); // true çýkar boþluklarý sildi eþitledik. == koyarsak false çýkar çünkü adresleri farklý.
        System.out.println(value1==(value3)); //true
        System.out.println(value1==(value4)); //false
        String value5="burcu sekmen demir";
        System.out.println(value1.equalsIgnoreCase(value5)); //true; içeirkleri aynýysa true diyor, büyük küçük harf duyarlýlýðý olmadan denk mid iye bakýyor.

        System.out.println(value1.endsWith("a"));
        System.out.println(value1.endsWith("R")); // bu karakterle bitiyor mu true false
        System.out.println(value1.startsWith("B")); // bu karakterle baþlýyor mu true false

        String value6= "Java-React-Css";
        String [] array= value6.split("-");
        for (int i=0; i<array.length; i++){
            System.out.println(array[i]);
        }

        String value7="10";
        System.out.println(5+value7);

        int sayi1=Integer.parseInt(value7); // bir string deðeri int deðerine çevirir.
        System.out.println(sayi1);
        System.out.println(5+sayi1);

        //int sayi2=Integer.parseInt(value5); //deðerin sayý olmasý lazým hata verdi.
        //System.out.println(sayi2);

        System.out.println(value1.length()); //uzunluðunu verir.
    }
}
