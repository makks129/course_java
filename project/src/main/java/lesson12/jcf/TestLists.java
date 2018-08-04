package lesson12.jcf;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class TestLists {

    public static void main(String[] args) {

        List<String> arrayList = new ArrayList<>();
        arrayList.add("Moscow");
        arrayList.add("Piter");
        arrayList.add(1, "London");
        arrayList.add("Paris");
//        arrayList.remove("Piter");
//        arrayList.remove(1);
        System.out.println(arrayList);

        for (int i = 0; i < arrayList.size(); i++) {
            String next = arrayList.get(i);
            System.out.println(next);
        }


        Collections.shuffle(arrayList);
        System.out.println(arrayList);






    }
}
