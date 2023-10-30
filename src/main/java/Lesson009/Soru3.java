package Lesson009;

import java.util.Scanner;

public class Soru3 {
    public static void main(String[] args) {

        /**
         * 1- Dýþarýdan girilen harf ile baþlayan illeri yazdýralým.
         * 2- illeri plaka kodlarý ile yazdýralým. 01-Adana 02-Adýyaman.....
         * 3-Girdiðimiz þehrin ismine göre plaka kddu dönen method yazalým.
         * 4-Ýlk harf hariç sesli harfleri silip yazdýran bir fonksiyon yazalým.(bir arraye atayalým.) ==>Adn , Adymn
         * 5- bir önceki metotdan dönen deðerlerin ilk uç harfini alsýn ve sonuna ... (üçnokta) eklesin ==> Adn..., Ady...
         *
         */
        String[] iller = { "Adana", "Adýyaman", "Afyon", "Aðrý", "Amasya", "Ankara", "Antalya", "Artvin", "Aydýn",
                "Balýkesir", "Bilecik", "Bingöl", "Bitlis", "Bolu", "Burdur", "Bursa", "Çanakkale", "Çankýrý", "Çorum",
                "Denizli", "Diyarbakýr", "Edirne", "Elazýð", "Erzincan", "Erzurum", "Eskiþehir", "Gaziantep", "Giresun",
                "Gümüþhane", "Hakkari", "Hatay", "Isparta", "Mersin", "Ýstanbul", "Ýzmir", "Kars", "Kastamonu", "Kayseri",
                "Kýrklareli", "Kýrþehir", "Kocaeli", "Konya", "Kütahya", "Malatya", "Manisa", "Kahramanmaraþ", "Mardin",
                "Muðla", "Muþ", "Nevþehir", "Niðde", "Ordu", "Rize", "Sakarya", "Samsun", "Siirt", "Sinop", "Sivas",
                "Tekirdað", "Tokat", "Trabzon", "Tunceli", "Þanlýurfa", "Uþak", "Van", "Yozgat", "Zonguldak", "Aksaray",
                "Bayburt", "Karaman", "Kýrýkkale", "Batman", "Þýrnak", "Bartýn", "Ardahan", "Iðdýr", "Yalova", "Karabük",
                "Kilis", "Osmaniye", "Düzce" };

//      ilBul(iller);
//      plakaVeIl(iller);
//        sehreGorePlakaKodu(iller);
        sesliHarfleriSil(iller);

    }//main sonu

    public static void sesliHarfleriSil (String [] iller){
        String [] sesliharfler ={"a","e","ý","i","o","ö","u","ü"};
        String sonuc="";
        for (int i=0; i< iller.length; i++){
            for (int j=0; j<sesliharfler.length; j++)
            if (iller[i].contains(sesliharfler[j])) {

                iller[i].charAt(j);
                sonuc += iller[i].toUpperCase().substring(0, 1) + iller[i].toLowerCase().substring(j,j+1);
            }

        }
        System.out.println(sonuc );
    }


    public static void sehreGorePlakaKodu (String[]iller){
        System.out.println("Lütfen þehir ismi giriniz:");
        String il=new Scanner(System.in).nextLine();

        for (int i=0; i<iller.length; i++){
            if (il.equalsIgnoreCase(iller[i])){
                if (i<9) {
                    System.out.println(il + " adlý þehrin plaka kodu " + "0"+(i + 1));
                }else {
                    System.out.println(il + " adlý þehrin plaka kodu " + (i + 1));
                }
            }
        }
    }


    public static void ilBul (String [] iller){

        Scanner sc=new Scanner(System.in);
        System.out.println("Bir harf giriniz:");
        String harf= sc.nextLine();

        System.out.println(harf.toUpperCase().substring(0,1) + " ile baþlayan iller ");
        for (String il: iller){
            if (il.startsWith(harf.toUpperCase().substring(0,1))){
                System.out.println(il);
            }
        }
    }

    public static void plakaVeIl ( String[] iller){

       for (int i=0; i<iller.length; i++){
           if (i<9) {
               System.out.println("0"+(i+1)  + " - " + iller[i]);
           }else {
               System.out.println(i+1 + " - " + iller[i]);
           }
       }

//       int sayac=01;
//       for (String il:iller){
//           if (sayac<10) {
//           System.out.println("0"+sayac  + " - " + il);
//       }else {
//           System.out.println(sayac+ " - " + il);
//       }
//           sayac++;
//       }
    }

}//class sonu
