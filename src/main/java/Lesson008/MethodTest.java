package Lesson008;

public class MethodTest {
    public static void main(String[] args) {
        method1();

        int sonuc=method2();
        System.out.println("main sonuc:" + sonuc);
        System.out.println("main2 sonuc:" + (sonuc+5));

        //void methodlar sout içinde yazdırılamazlar çünkü geri dönüş verisi yoktur.

        method3("Burcu",1997);
        String isim="Mert";
        int dogumYili=1997;
        method3(isim,dogumYili);

        System.out.println(method4("Burcu", 1997));
        String value=method4("Burcu", 1997);
        System.out.println(value);
    }

     //Geri donusu olmayan parametresiz method:
    public static void method1(){
        int sayi1=5;
        int sayi2=15;
        int sonuc =sayi1-sayi2;
        System.out.println("method1 çalıştı");
        System.out.println(sonuc);
    }

    //Geri dönüşü olan parametresiz method:
    public static int method2(){
        int sayi1=5;
        int sayi2=15;
        int sonuc =sayi1-sayi2;
        System.out.println("method2 çalıştı");
        System.out.println(sonuc);
        return sonuc;
    }

    //Geri donusu olmayan parametreli method:
    public static void method3(String isim, int dogumYili){
        System.out.println("method3 çalıştı");
        System.out.println(isim + " adlı kullanıcının yaşı ===> " + (2023-dogumYili));
    }

    //Geri dönüşü olan parametreli method:
    public static String method4(String isim, int dogumYili){
        System.out.println("method4 çalıştı");
       return isim + " adlı kullanıcının yaşı ===> " + (2023-dogumYili);

    }

   // public static void method5(MethodTest test)

}
