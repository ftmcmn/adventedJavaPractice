package _03_IfStatement_TernaryOperator;

import java.util.Scanner;

public class Me3 {
    public static void main(String[] args) {
        /* TASK :
		 *  Kullanicinin boyunu  cm  ve kilosunu kg alarak
		 * BMI (VKE) hesaplayiniz

	    INFO :
		BMI = kilo(kg) /(boy*boy)(m)
		BMI <=20 oldukca zayifsiniz
		20<BMI<=25 Normal sinirlardasiniz
		25<BMI<=30 Sisman kategorisindesiniz
		30<BMI ==> Obez grubundasiniz.
		 */

        Scanner scan=new Scanner(System.in);
        System.out.println("lutfen boyunuzu cm giriniz");
        double boy=scan.nextDouble();

        System.out.println("lutfen kilonuzu kg giriniz");
        double kilo=scan.nextDouble()/100;

        double bmi=kilo/boy*boy;

        if (bmi<=20){
            System.out.println("oldukca zayıfsınız");
        }else  if (bmi<=25){
            System.out.println("normal sınırlardasınız");
        }else if (bmi<=30){
            System.out.println("şişman kategorisindesiniz");
        }else if (bmi>30){
            System.out.println("obez grubundasınız");
        }


    }
}
