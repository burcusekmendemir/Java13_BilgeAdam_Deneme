package Lesson003;

import java.util.Scanner;

public class Soru1 {
    public static void main(String[] args) {
        /**
         * Bir �r�n fiyat�nda %18 kdv %15 kar pay� oldu�unu biliyoruz.
         * Bu �r�n�n son fiyat� elimizde olsun daha sonra bu �r�n fiyat� �zerinden
         * �r�n�n ham fiyat� ve kdvsiz fiyat�n� bulal�m.
         */

        double sonFiyat;
        Scanner sc=new Scanner(System.in);
        // System.out.println("l�tfen son fiyat� giriniz:");
        sonFiyat = sc.nextDouble();

        double kdvsizFiyat = sonFiyat*0.82;
        //System.out.println("kdvsiz fiyat:" + kdvsizFiyat);

        double hamfiyat = kdvsizFiyat*0.85;
        //System.out.println("ham fiyat:" + hamfiyat);

        //ctrl+d a�a�� do�ru �o�altma k�sayolu.


        Scanner scanner=new Scanner(System.in);
        System.out.println("l�tfen bir isim giriniz:");
        String isim= scanner.nextLine();
        String soyisim= scanner.nextLine();
        System.out.println("isim=:" +isim+ " " +soyisim);
        System.out.println("l�tfen bir double de�er giriniz:");
        double sayi1= scanner.nextDouble();
        System.out.println("l�tfen bir int de�er giriniz:");
        int sayi2= scanner.nextInt();

        System.out.println(sayi1);
        System.out.println(sayi2);

        System.out.println("l�tfem bir �lke giriniz");

        //nextInt nextDouble nextlong gibi say�sal de�erlerden sonra
        //string bir de�er alacaksal �ncelikle bo� bir
        //scanner.nextline komutu yazmam�z gerekli

        scanner.nextLine();
        String ulke=scanner.nextLine();

        System.out.println("l�tfen bir say� giriniz:");
        long sayi3= scanner.nextLong();
        System.out.println(sayi3);
        System.out.println(ulke);
    }
}
