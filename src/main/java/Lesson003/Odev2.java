package Lesson003;

import java.util.Scanner;

public class Odev2 {
    public static void main(String[] args) {
        //Dýþarýdan dogum gununuzun ay ve gün deðerini ayrý ayrý bir sayý olarak alacaksýnýz buna göre

//burc hesabý yapan program

//Koç Burcu : 21 Mart - 20 Nisan
//
//Boða Burcu : 21 Nisan - 21 Mayýs
//
//Ýkizler Burcu : 22 Mayýs - 22 Haziran
//
//Yengeç Burcu : 23 Haziran - 22 Temmuz
//
//Aslan Burcu : 23 Temmuz - 22 Aðustos
//
//Baþak Burcu : 23 Aðustos - 22 Eylül
//
//Terazi Burcu : 23 Eylül - 22 Ekim
//
//Akrep Burcu : 23 Ekim - 21 Kasým
//
//Yay Burcu : 22 Kasým - 21 Aralýk
//
//Oðlak Burcu : 22 Aralýk - 21 Ocak

//Kova Burcu : 22 Ocak - 19 Subat
//
//Balýk Burcu : 20 Subat - 20 Mart



        System.out.println("**** BURÇ HESAPLAMA *****");

        String burc;
        Scanner sc=new Scanner(System.in);
        System.out.println("Doðum ayýnýzý giriniz:");
        int dogumayi= sc.nextInt();
        while (dogumayi<1 || dogumayi>12){
            System.out.println("Lütfen doðum ayý giriniz:");
            dogumayi= sc.nextInt();
        }

        System.out.println("Doðum gününüzü giriniz:");
        int dogumgunu= sc.nextInt();
        while (dogumgunu<1 || dogumgunu>31){
            System.out.println("Doðum gününüzü giriniz:");
            dogumgunu= sc.nextInt();
        }

        if (dogumayi==4){
            if (dogumgunu<=21){
                burc= "Koç";
                System.out.println("Burcunuz:" + burc);
            } else if (dogumgunu>21) {
                burc="Boða";
                System.out.println("Burcunuz:" + burc);
            }
        }

        if (dogumayi==5){
            if (dogumgunu<=21){
                burc= "Boða";
                System.out.println("Burcunuz:" + burc);
            } else if (dogumgunu>21) {
                burc="Ýkizler";
                System.out.println("Burcunuz:" + burc);
            }
        }
        if (dogumayi==6){
            if (dogumgunu<=21){
                burc= "Ýkizler";
                System.out.println("Burcunuz:" + burc);
            } else if (dogumgunu>21) {
                burc="Yengeç";
                System.out.println("Burcunuz:" + burc);
            }
        }
        if (dogumayi==7){
            if (dogumgunu<=21){
                burc= "Yengeç";
                System.out.println("Burcunuz:" + burc);
            } else if (dogumgunu>21) {
                burc="Aslan";
                System.out.println("Burcunuz:" + burc);
            }
        }
        if (dogumayi==8){
            if (dogumgunu<=21){
                burc= "Aslan";
                System.out.println("Burcunuz:" + burc);
            } else if (dogumgunu>21) {
                burc="Baþak";
                System.out.println("Burcunuz:" + burc);
            }
        }

        if (dogumayi==9){
            if (dogumgunu<=21){
                burc= "Baþak";
                System.out.println("Burcunuz:" + burc);
            } else if (dogumgunu>21) {
                burc="Terazi";
                System.out.println("Burcunuz:" + burc);
            }
        }

        if (dogumayi==10){
            if (dogumgunu<=21){
                burc= "Terazi";
                System.out.println("Burcunuz:" + burc);
            } else if (dogumgunu>21) {
                burc="Akrep";
                System.out.println("Burcunuz:" + burc);
            }
        }
        if (dogumayi==11){
            if (dogumgunu<=21){
                burc= "Akrep";
                System.out.println("Burcunuz:" + burc);
            } else if (dogumgunu>21) {
                burc="Yay";
                System.out.println("Burcunuz:" + burc);
            }
        }

        if (dogumayi==12){
            if (dogumgunu<=21){
                burc= "Yay";
                System.out.println("Burcunuz:" + burc);
            } else if (dogumgunu>21) {
                burc="Oðlak";
                System.out.println("Burcunuz:" + burc);
            }
        }
        if (dogumayi==1){
            if (dogumgunu<=21){
                burc= "Oðlak";
                System.out.println("Burcunuz:" + burc);
            } else if (dogumgunu>21) {
                burc="Kova";
                System.out.println("Burcunuz:" + burc);
            }
        }

        if (dogumayi==2){
            if (dogumgunu<=21){
                burc= "Kova";
                System.out.println("Burcunuz:" + burc);
            } else if (dogumgunu>21) {
                burc="Balýk";
                System.out.println("Burcunuz:" + burc);
            }
        }

        if (dogumayi==3){
            if (dogumgunu<=21){
                burc= "Balýk";
                System.out.println("Burcunuz:" + burc);
            } else if (dogumgunu>21) {
                burc="Koç";
                System.out.println("Burcunuz:" + burc);
            }
        }

        // DÝgER YÖNTEM:

        int gun, ay;
        System.out.println("lütfen dogum gününüzü giriniz:");
        gun= sc.nextInt();
        System.out.println("lütfen dogum ayýnýzý giriniz:");
        ay= sc.nextInt();

        switch (ay){
            case 1:
                if (gun>31 || gun<1){
                    System.out.println("Ocak Ayýnýn son günü 31 Ocaktýr, ilk günü 1 ocaktýr. Lütfen bu tarihler arasýnda giriniz:");
                } else if (gun<=21) {
                    System.out.println("Burcunuz Oðlak");
                }else{
                    System.out.println("Burcunuz Kova");
                }
                break;

            case 2:

                if (gun>29 || gun<1){
                    System.out.println("subat Ayýnýn son günü 28 þubattýr, ilk günü 1 þubattýr. Lütfen bu tarihler arasýnda giriniz:");
                } else if (gun<=19) {
                    System.out.println("Burcunuz Kova");
                }else{
                    System.out.println("Burcunuz Balýk");
                }
                break;

            case 3:

                if (gun>31 || gun<1){
                    System.out.println("mart Ayýnýn son günü 30 marttýr, ilk günü 1 marttýr. Lütfen bu tarihler arasýnda giriniz:");
                } else if (gun<=20) {
                    System.out.println("Burcunuz Balýk");
                }else{
                    System.out.println("Burcunuz Koç");
                }
                break;

            case 4:
                if (gun>30 || gun<1){
                    System.out.println("nisan Ayýnýn son günü 30 nisantýr, ilk günü 1 nisantýr. Lütfen bu tarihler arasýnda giriniz:");
                } else if (gun<=20) {
                    System.out.println("Burcunuz koç");
                }else{
                    System.out.println("Burcunuz boða");
                }
                break;

            case 5:
                if (gun>31 || gun<1){
                    System.out.println("mayýs Ayýnýn son günü 31 mayýstýr, ilk günü 1 mayýstýr. Lütfen bu tarihler arasýnda giriniz:");
                } else if (gun<=21) {
                    System.out.println("Burcunuz boða");
                }else{
                    System.out.println("Burcunuz ikizler");
                }
                break;

            case 6:
                if (gun>30 || gun<1){
                    System.out.println("haziran Ayýnýn son günü 30 hazirantýr, ilk günü 1 hazirantýr. Lütfen bu tarihler arasýnda giriniz:");
                } else if (gun<=22) {
                    System.out.println("Burcunuz ikizler");
                }else{
                    System.out.println("Burcunuz yengeç");
                }
                break;
            case 7:
                if (gun>31 || gun<1){
                    System.out.println("temmuz Ayýnýn son günü 31 temmuztýr, ilk günü 1 nisantýr. Lütfen bu tarihler arasýnda giriniz:");
                } else if (gun<=22) {
                    System.out.println("Burcunuz yengeç");
                }else{
                    System.out.println("Burcunuz aslan");
                }
                break;

            default:
                System.out.println("Bir yýlda 12 ay vardýr. LÜtfen 1-12 arasý bir sayý giriniz:");
                break;
        }

        /**
         * ödev: switch(ay) {...} döngüye alarak deneme
         */
    }
}
