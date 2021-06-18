package com.github;
//v2
public class Main {
    public static void main(String[] args) {
        float rez  = math(1.12f, 5.55f, 9.3f, 10.777f); System.out.println("Результат " + rez);
        boolean b1 = bool(12, 5); System.out.println(b1);
                     plusMinus(-102);
        boolean b2 = plusMinus2(-50); System.out.println(b2);
                     stringName("Василий");

                     visokosni(2024);
    }
    static float math(float a, float b, float c, float d) {
        float rezultat = a * (b + (c / d));
        return rezultat;
    }
    static boolean bool(int i, int i1) {
        boolean b = true;
        if ((10 < (i + i1)) && (20 > (i + i1))) {b = true;}
        else{b = false;};
        return b;
    }
    static void plusMinus(int q){
        if(q >= 0) {System.out.println("Число "+q+" положительное");}
        else {System.out.println("Число "+q+" отрицательное");}
    }
    static boolean plusMinus2(int q){
        boolean b = false;
        if(q >= 0) {b = true;}
        else {b = false;}
        return b;
    }
    static void stringName(String s){
        System.out.println("Привет, "+s);
    }
    static void visokosni(int year){
        String V;
        if((year % 4) == 0) {
            if((year % 100) == 0) {
                if((year % 400) == 0){
                    V = "високосный";
                }else {V = "не високосный";}
            }else{V = "високосный";}
        }else {V = "не високосный";}
        System.out.println("Год "+year+" "+V);
    }
}