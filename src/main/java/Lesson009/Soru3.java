package Lesson009;

import java.util.Scanner;

public class Soru3 {
    public static void main(String[] args) {

        /**
         * 1- D��ar�dan girilen harf ile ba�layan illeri yazd�ral�m.
         * 2- illeri plaka kodlar� ile yazd�ral�m. 01-Adana 02-Ad�yaman.....
         * 3-Girdi�imiz �ehrin ismine g�re plaka kddu d�nen method yazal�m.
         * 4-�lk harf hari� sesli harfleri silip yazd�ran bir fonksiyon yazal�m.(bir arraye atayal�m.) ==>Adn , Adymn
         * 5- bir �nceki metotdan d�nen de�erlerin ilk u� harfini als�n ve sonuna ... (��nokta) eklesin ==> Adn..., Ady...
         *
         */
        String[] iller = { "Adana", "Ad�yaman", "Afyon", "A�r�", "Amasya", "Ankara", "Antalya", "Artvin", "Ayd�n",
                "Bal�kesir", "Bilecik", "Bing�l", "Bitlis", "Bolu", "Burdur", "Bursa", "�anakkale", "�ank�r�", "�orum",
                "Denizli", "Diyarbak�r", "Edirne", "Elaz��", "Erzincan", "Erzurum", "Eski�ehir", "Gaziantep", "Giresun",
                "G�m��hane", "Hakkari", "Hatay", "Isparta", "Mersin", "�stanbul", "�zmir", "Kars", "Kastamonu", "Kayseri",
                "K�rklareli", "K�r�ehir", "Kocaeli", "Konya", "K�tahya", "Malatya", "Manisa", "Kahramanmara�", "Mardin",
                "Mu�la", "Mu�", "Nev�ehir", "Ni�de", "Ordu", "Rize", "Sakarya", "Samsun", "Siirt", "Sinop", "Sivas",
                "Tekirda�", "Tokat", "Trabzon", "Tunceli", "�anl�urfa", "U�ak", "Van", "Yozgat", "Zonguldak", "Aksaray",
                "Bayburt", "Karaman", "K�r�kkale", "Batman", "��rnak", "Bart�n", "Ardahan", "I�d�r", "Yalova", "Karab�k",
                "Kilis", "Osmaniye", "D�zce" };

//      ilBul(iller);
//      plakaVeIl(iller);
//        sehreGorePlakaKodu(iller);
        sesliHarfleriSil(iller);

    }//main sonu

    public static void sesliHarfleriSil (String [] iller){
        String [] sesliharfler ={"a","e","�","i","o","�","u","�"};
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
        System.out.println("L�tfen �ehir ismi giriniz:");
        String il=new Scanner(System.in).nextLine();

        for (int i=0; i<iller.length; i++){
            if (il.equalsIgnoreCase(iller[i])){
                if (i<9) {
                    System.out.println(il + " adl� �ehrin plaka kodu " + "0"+(i + 1));
                }else {
                    System.out.println(il + " adl� �ehrin plaka kodu " + (i + 1));
                }
            }
        }
    }


    public static void ilBul (String [] iller){

        Scanner sc=new Scanner(System.in);
        System.out.println("Bir harf giriniz:");
        String harf= sc.nextLine();

        System.out.println(harf.toUpperCase().substring(0,1) + " ile ba�layan iller ");
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
