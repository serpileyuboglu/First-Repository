package arrayList;

import java.util.ArrayList;
import java.util.List;

public class C05_set {
    public static void main(String[] args) {

        int[] arr = {1,2,4,3,5,3,5,2,5,1,2,4,3,4,5};

        //List.set(index,yeniDeger) method'u
        //istenen indexteki degeri silip bize dondurur
        //yenisini bize yazdirir

        List<Integer> sayilar = new ArrayList<>();

        for (int i = 0; i < arr.length; i++) {

            sayilar.add(arr[i]);

        }
        //Java'dan set() u update icin kullanilir
        //add() ile set() farklidir, add araya ekler,set yerine yazar

        System.out.println(sayilar);//[1, 2, 4, 3, 5, 3, 5, 2, 5, 1, 2, 4, 3, 4, 5]
        System.out.println(sayilar.set(0, 8));//eski degeri bize verir==>1
        int eskiDeger =sayilar.set(1,9);//eski degeri verir--2
        System.out.println(eskiDeger);//2
        System.out.println(sayilar);//[8, 9, 4, 3, 5, 3, 5, 2, 5, 1, 2, 4, 3, 4, 5]
    }
}
