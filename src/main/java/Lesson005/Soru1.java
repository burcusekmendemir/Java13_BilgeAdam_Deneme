package Lesson005;

public class Soru1 {
    public static void main(String[] args) {
        /**
         * bu string de�eri virg�llerden ay�r�p her kelimeyi alt alta yazd�ral�m.
         */

        String kelime = "Java,React,Css,Html";
        //1. y�ntem
        System.out.println(kelime.replace(",", "\n"));

        //2. y�ntem:
        for (int i=0; i<kelime.length(); i++){
            int loc1=kelime.indexOf(",");
            if (loc1!= -1){
                System.out.println(kelime.substring(0,loc1));
                kelime=kelime.substring(loc1+1);
            }

        }
        System.out.println(kelime);


        //3. y�ntem:
        int index=0;
        kelime = "Java,React,Css,Html";
        for (int i=0; i<kelime.length(); i++){
            if (kelime.charAt(i) == ','){
                System.out.println(kelime.substring(index,i));
                index=i+1;
            }
        }
        System.out.println(kelime.substring(index));

        //4. y�ntem:
        kelime = "Java,React,Css,Html";
        for (int i=0; i<kelime.length(); i++){
            if (kelime.charAt(i) == ',') {
                System.out.println();
            }else {
                System.out.print(kelime.charAt(i));
            }
        }
    }
}
