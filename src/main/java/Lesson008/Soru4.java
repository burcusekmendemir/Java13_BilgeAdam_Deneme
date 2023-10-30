package Lesson008;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Soru4 {
    public static void main(String[] args) {

        //Rastgele Say� �retme �rnekleri:
        Random random=new Random();
        int sayi= random.nextInt(4); //buraya yaz�lan say�yla 0 aras�nda �retiyo ama yaz�lan say�y� vermiyor.
        System.out.println(sayi);
        int sayi2= random.nextInt(3,13); //ilkini al�yor sonunu alm�yor
        System.out.println(sayi2);

        double sayi3= random.nextDouble(5);
        System.out.println(sayi3);

        long sayi4=random.nextLong(120);
        float sayi5= random.nextFloat(260);
        boolean kontrol= random.nextBoolean();
        System.out.println(sayi4);
        System.out.println(sayi5);
        System.out.println(kontrol);

        /**
         * D��ar�dan bir dizi boyutu girece�iz. (double)
         * Daha sonra bu diziye rastgele say�lar �retip 500e kadar olsun atama yapaca��z ve elemanlar�n�n ortalamas�n� bulaca��z.
         */


        double [] array=diziOlustur();
        arrayDoldur(array);
        System.out.println(Arrays.toString(array));
        System.out.println("Ortalama: " + ortalamaBul(array));
    }

    public static double [] diziOlustur(){
        Scanner scanner=new Scanner(System.in);
        System.out.println("Bir dizi boyutu giriniz:");
        int boyut= scanner.nextInt();
        double[] dizi=new double[boyut];  //double[] dizi=new double[scanner.nextInt()];  olarak da tan�mlanabilir.
        return dizi;
    }

    public static double rastgeleSayiUret(){
        Random random=new Random();
        return  random.nextDouble(500);
    }

    public static void arrayDoldur(double[] array){
        for (int i=0;i< array.length;i++){
            array[i]=rastgeleSayiUret();
        }
    }
    public static double ortalamaBul(double[] array){
        int toplam=0;
        for (int i=0;i< array.length;i++){
            toplam+=array[i];
        }
        return toplam/ array.length;
    }

}
