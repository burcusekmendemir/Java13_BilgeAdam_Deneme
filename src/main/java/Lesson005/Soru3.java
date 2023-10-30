package Lesson005;

import java.util.Scanner;

public class Soru3 {
    public static void main(String[] args) {

        /**
         * Dýþarýdan bir ýban deðeri girelim TR 1001005001 ,TR 1001005002 veya OTH
         * 2002002000 gibi daha sonra bu deðerleri kontrol edelim eðer Tr ile baþlýyorsa
         * yurt içi iþlemler yazsýn ve Eðer 5001 ile Bitiyorsa Ziraat 5002 ile bitiyorsa
         * Garanti 5003 ile bitiyorsa Ýþ bankasý yazdýrsýn eðer OTH ise Yurt dýþý
         * iþlemler yazdýralým 2000 ile bitiyorsa kýta içi iþelmeler ve OTH 2002002000 yerine
         *  Ki 200200…   eðer 2000 ile bitmiyorsa  Kd 200201…
         */

        Scanner sc=new Scanner(System.in);
        System.out.println("Lütfen ibanýnýzý giriniz:");
        String iban= sc.nextLine();
        String islem1= "Yurtiçi Ýþlemler";
        String islem2= "Yurtdýþý Ýþlemler";

        if (iban.startsWith("Tr")){
            if (iban.endsWith("5001")){
                System.out.println(islem1 + " " + "Ziraat 5001");
            } else if (iban.endsWith("5002")) {
                System.out.println(islem1+ " " + "Garanti 5002");
            }else if (iban.endsWith("5003")) {
                System.out.println(islem1+ " " + "Ýþ bankasý 5003");
            }
        }
        else if (iban.startsWith("OTH")){

            if (iban.endsWith("2000")) {
                System.out.println(islem2 + " " + iban.replace("OTH","Ki"));
            } else if (iban.endsWith("2001")) {
                System.out.println(islem2 + " " + iban.replace("OTH", "Kd"));
            }else
                System.out.println(islem2 + " " + "Diðer");

        }
        else {
            System.out.println("hatalý iban");
        }
    }
}
