package _03_IfStatement_TernaryOperator;

public class MeTrny03 {
    public static void main(String[] args) {
        /*
        TASK :
         Kullanıcıdan bir pozitif tamsayı girmesini isteyin,
         o pozitif tamsayı 3 basamaklı ise ekrana “3 Basamaklı” yazdırın.
         3 basamaklı degilse çift olup olmadigini kontrol edin.
          Çift ise “3 basamaklı olmayan çift sayı” yazdırın.
         Çift sayı degilse “3 basamaklı olmayan tek sayı yazdırın.”
         */

        int sayi=120;
        String sonuc= (sayi>=100 && sayi<1000) ?"3 basamakli":
                sayi%2==0?"3 bas olmayan cift sayi":
                        "3 bas olmayan tek sayi";

        System.out.println(sonuc);






    }


}
