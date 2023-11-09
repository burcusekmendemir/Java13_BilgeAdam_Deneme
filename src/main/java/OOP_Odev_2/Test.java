package OOP_Odev_2;

/**
 * Bir arac sınıfımız olsun
 * Daha sonra ucak otomobil kamyon gemi gibi sınıflarımızı da oluşturalım.
 * Gerekirse bu sınıflara altsınıflar veya ust sınıflar olusturabilirsiniz.
 * Hızlanma yavaslama gibi metotlarımız olsun
 * kalkıs yap, inis yap, yelkenac, limana yanas, sur (kara tasıtları için geçerli olsun) gibi mettolarımız olsun
 * Bazı araclar yük tasıyabilsinler bunun için yukal yuk bosalt mettoları olsun
 * bu uygulamayı olustururken özellikle interfacelerden yararlanalım.
 */

public class Test {

    /**
     * test sınıfında bir yukAlma ve yukVerme metodu yazalım ;==>
     * yukAlma===> kamyon yuk aldı ,kargo ucagı yuk aldı yuk gemisi yuk aldı
     * yukVerme===> kamyon yuku teslim etti ,kargo ucagı yuku teslim etti yuk gemisi yuku teslim etti
     */

    public static void main(String[] args) {

        yukAlma("Yük Gemisi");
        System.out.println("-----------------------------");
        yukVerme("Yük Gemisi");
    }

    public static void yukAlma(String arac){

        if (arac.equals("Kamyon")) {
            Kamyon kamyon = new Kamyon();
            kamyon.sur();
            kamyon.yavasla();
            kamyon.yukAl();
            System.out.println(kamyon.getClass().getSimpleName() + " yükü teslim aldı.");
            kamyon.sur();
            kamyon.hizlan();
        } else if (arac.equals("Yük Gemisi")) {
            YukGemisi yukGemisi = new YukGemisi();
            yukGemisi.limanaYanas();
            yukGemisi.yavasla();
            yukGemisi.yukAl();
            System.out.println(yukGemisi.getClass().getSimpleName() + " yükü teslim aldı.");
            yukGemisi.yelkenAc();
            yukGemisi.hizlan();
        } else if (arac.equals("Kargo Uçağı")) {
            KargoUcagi kargoUcagi = new KargoUcagi();
            kargoUcagi.inisYap();
            kargoUcagi.yavasla();
            kargoUcagi.yukAl();
            System.out.println(kargoUcagi.getClass().getSimpleName() + " yükü teslim aldı.");
            kargoUcagi.kalkisYap();
            kargoUcagi.hizlan();
        }

    }

    public static void yukVerme(String arac){

        switch (arac){
            case "Kamyon":
                Kamyon kamyon=new Kamyon();
                kamyon.yavasla();
                kamyon.yukBosalt();
                System.out.println(kamyon.getClass().getSimpleName() + " yükü teslim etti.");
                kamyon.sur();
                kamyon.hizlan();
                break;

            case "Yük Gemisi":
                YukGemisi yukGemisi=new YukGemisi();
                yukGemisi.limanaYanas();
                yukGemisi.yavasla();
                yukGemisi.yukBosalt();
                System.out.println(yukGemisi.getClass().getSimpleName() + " yükü teslim etti.");
                yukGemisi.yelkenAc();
                yukGemisi.hizlan();
                break;

            case "Kargo Uçağı":
                KargoUcagi kargoUcagi=new KargoUcagi();
                kargoUcagi.inisYap();
                kargoUcagi.yavasla();
                kargoUcagi.yukBosalt();
                System.out.println(kargoUcagi.getClass().getSimpleName() + " yükü teslim etti.");
                kargoUcagi.kalkisYap();
                kargoUcagi.hizlan();
                break;
        }
    }



}
