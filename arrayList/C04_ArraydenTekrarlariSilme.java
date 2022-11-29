package arrayList;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class C04_ArraydenTekrarlariSilme {
    public static void main(String[] args) {

        //verilen bir array deki tekrar eden sayilari unique yapma

        int[] arr = {1,2,4,3,5,3,5,2,5,1,2,4,3,4,5};

        //bu soruyu array'le yapmak cok zor
        //bunun yerine bu arry in elemanlarini inceleyip tekrarsiz olanlari liste atalim
        //en son listdeki elemanlari iceren bir array olusturup
        //yeni arra'i eski array'edeger olarak atayalim
        List<Integer> uniquenumbers =new ArrayList<>();

        for (int i = 0; i < arr.length; i++) {
            if (!uniquenumbers.contains(arr[i])){
                uniquenumbers.add(arr[i]);
            }

        }
        System.out.println("unique numbers: "+uniquenumbers);

        arr=new int[uniquenumbers.size()];

        for (int i = 0; i < arr.length; i++) {
            arr[i] = uniquenumbers.get(i);//listenin 0.elementini getirir
            //array istenen hale geldi

        }
        System.out.println("Array'in tekrarsiz hali: "+Arrays.toString(arr));

    }
}
