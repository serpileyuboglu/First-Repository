package arrayList;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class C08_KullaiciyaListOlusturma {
    public static void main(String[] args) {

        //Kullanicidan istedigi kadar isim alip
        //Q'ya bastiginda girdigi isimleri bize liste
        // olarak dondurecek bir method olusturun

        listeOlustur();

    }
        public static List<String> listeOlustur() {

            List<String> isimler = new ArrayList<>();

            Scanner scan = new Scanner(System.in);
            String girilenIsim ="";
            while (!girilenIsim.equalsIgnoreCase("q")){
                System.out.println("Lutfen listeye eklemek icin bir isim giriniz" +
                        "\nBitirmek icin Q ya basiniz");
                girilenIsim=scan.nextLine();

                if (!girilenIsim.equalsIgnoreCase("q")){
                    isimler.add(girilenIsim);
                }

            }
            return isimler;



        }
}