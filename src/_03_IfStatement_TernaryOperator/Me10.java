package _03_IfStatement_TernaryOperator;

import java.util.Scanner;

public class Me10 {
    public static void main(String[] args) {
         /*
            TASK :
            Kulanıcıdan aracının hızını alınız
            Trafik cezasının değerini hesaplayın.
            54 hız sınırıdır.
            Eğer hızınız 55-74 arasında ise:
            Ceza 100 $'dır.

            Eğer hızınız 75 - 84 arasında ise:
            Ceza 150 $'dır.

            Eğer hızınız 85 -94 arasında ise:
            Ceza 320 $'dır.

            Eğer hızınız 94'den daha fazla ise:
            Ceza 500 $'dır.

            ve ayrıca,
            Eğer sürücünün ehliyeti yoksa cezaya 200 $ eklenir.

            Örn: Hızınız 77 iken cezanız 150$'dır ama ehliyetiniz yoksa ceza 350 $ olur.

-----------------------------------------
             Örn;
            currentSpeed(Hızınız) 87
            ve isDriverLicenceAvailable(Ehliyeti var mı?) = true;
            sonuç 320 olmalıdır.
            currentSpeed(Hızınız) 65
            ve isDriverLicenceAvailable(Ehliyeti var mı?) = false;
            sonuç 300 olmalıdır.
     */

        Scanner scan = new Scanner(System.in);
        System.out.println("ehliyetiniz var ise 1'e yok ise 0'a basiniz");
        int ehliyet= scan.nextInt();
        if (ehliyet==0 || ehliyet==1){
            if (ehliyet==0) {
                System.out.println("hız sormadan ehkiyetsiz olmanin cezasi 200$");
            }
            System.out.println("lutfen hizinizi giriniz");
            int hiz= scan.nextInt();

            if (ehliyet==1){
                if (hiz<0){
                    System.out.println("boyle bir hiz yok");
                }else if (hiz>55 && hiz<75){
                    System.out.println("Ceza 100 $'dır");
                }else if (hiz>74 && hiz<85){
                    System.out.println("Ceza 150 $'dır");
                }else if (hiz>84 && hiz<95){
                    System.out.println("Ceza 320 $'dır");
                }else if (hiz>94){
                    System.out.println("Ceza 500 $'dır");
                }else {
                    System.out.println("hız sınırnda seyahat ediyorsunuz hayırlı yolculuklar");
                }
            }
            if (ehliyet==0){
                if (hiz<0){
                    System.out.println("boyle bir hiz yok");
                }else if (hiz>55 && hiz<75){
                    System.out.println("Ceza 300 $'dır");
                }else if (hiz>74 && hiz<85){
                    System.out.println("Ceza 350 $'dır");
                }else if (hiz>84 && hiz<95){
                    System.out.println("Ceza 520 $'dır");
                }else if (hiz>94){
                    System.out.println("Ceza 700 $'dır");
                }else {
                    System.out.println("hız sınırnda seyahat ediyorsunuz ancak ehliyet yok 200$");
                }
            }else {
                System.out.println("ehliyet var mi yok mi");
            }
        }else {
            System.out.println("ehliyetin var mi yok mu anlasilmadi");
        }





    }
}
