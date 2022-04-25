package _03_IfStatement_TernaryOperator;

import java.util.Scanner;

public class Me1 {
    public static void main(String[] args) {
        /* TASK :
         * Kullanicidan alacaginiz iki sayiyi yine kullaniciya
         * sectireceginiz
         *  dort islemden biri ile isleme koyup sonucun yazdiriniz
         */

        Scanner scan=new Scanner(System.in);
        System.out.println("toplama icin 1\ncıkarma icin 2\nbolme icin 3\nçarpma icin4");
        int islem=scan.nextInt();
        if (islem>4){
            System.out.println("hatali secim yaptiniz tekrar deneyiniz");
        }

        Scanner scan1=new Scanner(System.in);
        System.out.println("lutfen iki tam sayi giriniz");
        double num1=scan1.nextDouble();
        double num2=scan1.nextDouble();

        if (islem==1){
            System.out.println("toplama isleminin sonucu:"+ (num1+num2));
        }else if (islem==2){
            System.out.println("cıkarma isleminin sonucu:"+ (num1-num2));
        }else if (islem==3){
            System.out.println("bolme isleminin sonucu:"+ (num1/num2));
        }else if (islem==4){
            System.out.println("carpma isleminin sonucu:"+ (num1*num2));
        }

    }
}
