package _04_switchCase;

import java.util.Scanner;

public class Me03 {
    public static void main(String[] args) {
       //Girilen bir ay numarasına göre ,
        //ayın kaç gün olduğunu sayı ile yazdırınız

        Scanner scan=new Scanner(System.in);
        System.out.println("yilin kacıncı ayini ogrenmek istiyorsun : ");
        int ay=scan.nextInt();

        switch (ay){
            case 1:
            case 3:
            case 5:
            case 7:
            case 8:
            case 10:
            case 12:
                System.out.println("girdiğiniz ay 31 gun");
                break;
            case 4:
            case 6:
            case 9:
            case 11:
                System.out.println("girdiğiniz ay 31 gun");
                break;
            case 2:
                System.out.println("lutfen yil giriniz");
                int yil= scan.nextInt();
                if (yil%4==0){
                    System.out.println("girdiğiniz ay 29 gün");
                }else System.out.println("girdiğiniz ay 28 gün");
                break;
            default:
                System.out.println("yılda 12 ay vardir");

        }



    }
}
