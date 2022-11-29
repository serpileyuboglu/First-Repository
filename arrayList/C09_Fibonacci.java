package arrayList;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class C09_Fibonacci {
    public static void main(String[] args) {

        //Kullanicidan bir pozitif tamsayi alin
        //o saydan kucuk fibonacci sayilarini bir list olarak  yazdirin

        Scanner scan = new Scanner(System.in);
        System.out.println("Lutfen pozitif bir tamsayi giriniz");
        int girilenSayi = scan.nextInt();


        if (girilenSayi<0){
            System.out.println("Fibonacci serisi icin 0'dan buyuk tamsayi giriniz");
        }else if(girilenSayi==0){
            System.out.println("0'dan kucuk fibonacci sayisi yoktur");

        } else if (girilenSayi==1) {
            System.out.println("1'den kucuk tek fibonacci sayisi vardir");

        }else{
            fibonaccisayilainiyazdir(girilenSayi);
        }

    }

    private static void fibonaccisayilainiyazdir(int girilenSayi) {
        //buraya geldiyse girilen sayi 1'den buyuktur

        List<Integer> fibonacciList = new ArrayList<>();
        fibonacciList.add(0);
        fibonacciList.add(1);
        fibonacciList.add(1);

        int yeniFibonaccisayisi =0;
        int index = 3;//ilk uc eleman 0,1,1 old icin

        while (yeniFibonaccisayisi<girilenSayi){

            yeniFibonaccisayisi = fibonacciList.get(index-2)+fibonacciList.get(index-1);

            if (yeniFibonaccisayisi<girilenSayi){
                fibonacciList.add(yeniFibonaccisayisi);
            }
            index++;
        }
        System.out.println(fibonacciList);

    }
}
