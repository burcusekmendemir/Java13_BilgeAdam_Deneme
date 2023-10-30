package Lesson005;

import java.util.Scanner;

public class Soru3 {
    public static void main(String[] args) {

        /**
         * D��ar�dan bir �ban de�eri girelim TR 1001005001 ,TR 1001005002 veya OTH
         * 2002002000 gibi daha sonra bu de�erleri kontrol edelim e�er Tr ile ba�l�yorsa
         * yurt i�i i�lemler yazs�n ve E�er 5001 ile Bitiyorsa Ziraat 5002 ile bitiyorsa
         * Garanti 5003 ile bitiyorsa �� bankas� yazd�rs�n e�er OTH ise Yurt d���
         * i�lemler yazd�ral�m 2000 ile bitiyorsa k�ta i�i i�elmeler ve OTH 2002002000 yerine
         *  Ki 200200�   e�er 2000 ile bitmiyorsa  Kd 200201�
         */

        Scanner sc=new Scanner(System.in);
        System.out.println("L�tfen iban�n�z� giriniz:");
        String iban= sc.nextLine();
        String islem1= "Yurti�i ��lemler";
        String islem2= "Yurtd��� ��lemler";

        if (iban.startsWith("Tr")){
            if (iban.endsWith("5001")){
                System.out.println(islem1 + " " + "Ziraat 5001");
            } else if (iban.endsWith("5002")) {
                System.out.println(islem1+ " " + "Garanti 5002");
            }else if (iban.endsWith("5003")) {
                System.out.println(islem1+ " " + "�� bankas� 5003");
            }
        }
        else if (iban.startsWith("OTH")){

            if (iban.endsWith("2000")) {
                System.out.println(islem2 + " " + iban.replace("OTH","Ki"));
            } else if (iban.endsWith("2001")) {
                System.out.println(islem2 + " " + iban.replace("OTH", "Kd"));
            }else
                System.out.println(islem2 + " " + "Di�er");

        }
        else {
            System.out.println("hatal� iban");
        }
    }
}
