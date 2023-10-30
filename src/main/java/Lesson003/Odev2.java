package Lesson003;

import java.util.Scanner;

public class Odev2 {
    public static void main(String[] args) {
        //D��ar�dan dogum gununuzun ay ve g�n de�erini ayr� ayr� bir say� olarak alacaks�n�z buna g�re

//burc hesab� yapan program

//Ko� Burcu : 21 Mart - 20 Nisan
//
//Bo�a Burcu : 21 Nisan - 21 May�s
//
//�kizler Burcu : 22 May�s - 22 Haziran
//
//Yenge� Burcu : 23 Haziran - 22 Temmuz
//
//Aslan Burcu : 23 Temmuz - 22 A�ustos
//
//Ba�ak Burcu : 23 A�ustos - 22 Eyl�l
//
//Terazi Burcu : 23 Eyl�l - 22 Ekim
//
//Akrep Burcu : 23 Ekim - 21 Kas�m
//
//Yay Burcu : 22 Kas�m - 21 Aral�k
//
//O�lak Burcu : 22 Aral�k - 21 Ocak

//Kova Burcu : 22 Ocak - 19 Subat
//
//Bal�k Burcu : 20 Subat - 20 Mart



        System.out.println("**** BUR� HESAPLAMA *****");

        String burc;
        Scanner sc=new Scanner(System.in);
        System.out.println("Do�um ay�n�z� giriniz:");
        int dogumayi= sc.nextInt();
        while (dogumayi<1 || dogumayi>12){
            System.out.println("L�tfen do�um ay� giriniz:");
            dogumayi= sc.nextInt();
        }

        System.out.println("Do�um g�n�n�z� giriniz:");
        int dogumgunu= sc.nextInt();
        while (dogumgunu<1 || dogumgunu>31){
            System.out.println("Do�um g�n�n�z� giriniz:");
            dogumgunu= sc.nextInt();
        }

        if (dogumayi==4){
            if (dogumgunu<=21){
                burc= "Ko�";
                System.out.println("Burcunuz:" + burc);
            } else if (dogumgunu>21) {
                burc="Bo�a";
                System.out.println("Burcunuz:" + burc);
            }
        }

        if (dogumayi==5){
            if (dogumgunu<=21){
                burc= "Bo�a";
                System.out.println("Burcunuz:" + burc);
            } else if (dogumgunu>21) {
                burc="�kizler";
                System.out.println("Burcunuz:" + burc);
            }
        }
        if (dogumayi==6){
            if (dogumgunu<=21){
                burc= "�kizler";
                System.out.println("Burcunuz:" + burc);
            } else if (dogumgunu>21) {
                burc="Yenge�";
                System.out.println("Burcunuz:" + burc);
            }
        }
        if (dogumayi==7){
            if (dogumgunu<=21){
                burc= "Yenge�";
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
                burc="Ba�ak";
                System.out.println("Burcunuz:" + burc);
            }
        }

        if (dogumayi==9){
            if (dogumgunu<=21){
                burc= "Ba�ak";
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
                burc="O�lak";
                System.out.println("Burcunuz:" + burc);
            }
        }
        if (dogumayi==1){
            if (dogumgunu<=21){
                burc= "O�lak";
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
                burc="Bal�k";
                System.out.println("Burcunuz:" + burc);
            }
        }

        if (dogumayi==3){
            if (dogumgunu<=21){
                burc= "Bal�k";
                System.out.println("Burcunuz:" + burc);
            } else if (dogumgunu>21) {
                burc="Ko�";
                System.out.println("Burcunuz:" + burc);
            }
        }

        // D�gER Y�NTEM:

        int gun, ay;
        System.out.println("l�tfen dogum g�n�n�z� giriniz:");
        gun= sc.nextInt();
        System.out.println("l�tfen dogum ay�n�z� giriniz:");
        ay= sc.nextInt();

        switch (ay){
            case 1:
                if (gun>31 || gun<1){
                    System.out.println("Ocak Ay�n�n son g�n� 31 Ocakt�r, ilk g�n� 1 ocakt�r. L�tfen bu tarihler aras�nda giriniz:");
                } else if (gun<=21) {
                    System.out.println("Burcunuz O�lak");
                }else{
                    System.out.println("Burcunuz Kova");
                }
                break;

            case 2:

                if (gun>29 || gun<1){
                    System.out.println("subat Ay�n�n son g�n� 28 �ubatt�r, ilk g�n� 1 �ubatt�r. L�tfen bu tarihler aras�nda giriniz:");
                } else if (gun<=19) {
                    System.out.println("Burcunuz Kova");
                }else{
                    System.out.println("Burcunuz Bal�k");
                }
                break;

            case 3:

                if (gun>31 || gun<1){
                    System.out.println("mart Ay�n�n son g�n� 30 martt�r, ilk g�n� 1 martt�r. L�tfen bu tarihler aras�nda giriniz:");
                } else if (gun<=20) {
                    System.out.println("Burcunuz Bal�k");
                }else{
                    System.out.println("Burcunuz Ko�");
                }
                break;

            case 4:
                if (gun>30 || gun<1){
                    System.out.println("nisan Ay�n�n son g�n� 30 nisant�r, ilk g�n� 1 nisant�r. L�tfen bu tarihler aras�nda giriniz:");
                } else if (gun<=20) {
                    System.out.println("Burcunuz ko�");
                }else{
                    System.out.println("Burcunuz bo�a");
                }
                break;

            case 5:
                if (gun>31 || gun<1){
                    System.out.println("may�s Ay�n�n son g�n� 31 may�st�r, ilk g�n� 1 may�st�r. L�tfen bu tarihler aras�nda giriniz:");
                } else if (gun<=21) {
                    System.out.println("Burcunuz bo�a");
                }else{
                    System.out.println("Burcunuz ikizler");
                }
                break;

            case 6:
                if (gun>30 || gun<1){
                    System.out.println("haziran Ay�n�n son g�n� 30 hazirant�r, ilk g�n� 1 hazirant�r. L�tfen bu tarihler aras�nda giriniz:");
                } else if (gun<=22) {
                    System.out.println("Burcunuz ikizler");
                }else{
                    System.out.println("Burcunuz yenge�");
                }
                break;
            case 7:
                if (gun>31 || gun<1){
                    System.out.println("temmuz Ay�n�n son g�n� 31 temmuzt�r, ilk g�n� 1 nisant�r. L�tfen bu tarihler aras�nda giriniz:");
                } else if (gun<=22) {
                    System.out.println("Burcunuz yenge�");
                }else{
                    System.out.println("Burcunuz aslan");
                }
                break;

            default:
                System.out.println("Bir y�lda 12 ay vard�r. L�tfen 1-12 aras� bir say� giriniz:");
                break;
        }

        /**
         * �dev: switch(ay) {...} d�ng�ye alarak deneme
         */
    }
}
