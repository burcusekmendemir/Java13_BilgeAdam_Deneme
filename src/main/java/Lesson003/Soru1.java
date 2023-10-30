package Lesson003;

import java.util.Scanner;

public class Soru1 {
    public static void main(String[] args) {
        /**
         * Bir ürün fiyatýnda %18 kdv %15 kar payý olduðunu biliyoruz.
         * Bu ürünün son fiyatý elimizde olsun daha sonra bu ürün fiyatý üzerinden
         * ürünün ham fiyatý ve kdvsiz fiyatýný bulalým.
         */

        double sonFiyat;
        Scanner sc=new Scanner(System.in);
        // System.out.println("lütfen son fiyatý giriniz:");
        sonFiyat = sc.nextDouble();

        double kdvsizFiyat = sonFiyat*0.82;
        //System.out.println("kdvsiz fiyat:" + kdvsizFiyat);

        double hamfiyat = kdvsizFiyat*0.85;
        //System.out.println("ham fiyat:" + hamfiyat);

        //ctrl+d aþaðý doðru çoðaltma kýsayolu.


        Scanner scanner=new Scanner(System.in);
        System.out.println("lütfen bir isim giriniz:");
        String isim= scanner.nextLine();
        String soyisim= scanner.nextLine();
        System.out.println("isim=:" +isim+ " " +soyisim);
        System.out.println("lütfen bir double deðer giriniz:");
        double sayi1= scanner.nextDouble();
        System.out.println("lütfen bir int deðer giriniz:");
        int sayi2= scanner.nextInt();

        System.out.println(sayi1);
        System.out.println(sayi2);

        System.out.println("lütfem bir ülke giriniz");

        //nextInt nextDouble nextlong gibi sayýsal deðerlerden sonra
        //string bir deðer alacaksal öncelikle boþ bir
        //scanner.nextline komutu yazmamýz gerekli

        scanner.nextLine();
        String ulke=scanner.nextLine();

        System.out.println("lütfen bir sayý giriniz:");
        long sayi3= scanner.nextLong();
        System.out.println(sayi3);
        System.out.println(ulke);
    }
}
