package lesson12.jcf;

import java.util.*;

public class TestSets {

    public static void main(String[] args) {

        Set<String> hashSet = new HashSet<>();
        hashSet.add("Moscow");
        hashSet.add("Piter");
        hashSet.add("London");
        hashSet.add("Paris");
        hashSet.add("Moscow");
        System.out.println(hashSet);
        hashSet.remove("Moscow");
        System.out.println(hashSet.contains("Moscow"));

        Iterator<String> hashSetIterator = hashSet.iterator();
        while (hashSetIterator.hasNext()) {
            String next = hashSetIterator.next();
            System.out.println(next);
        }

        Set<String> linkedHashSet = new LinkedHashSet<>();
        linkedHashSet.add("Moscow");
        linkedHashSet.add("Piter");
        linkedHashSet.add("London");
        linkedHashSet.add("Paris");
        linkedHashSet.add("Moscow");
        System.out.println(linkedHashSet);



        Set<String> treeSet = new TreeSet<>(new Comparator<String>() {
            @Override
            public int compare(String o1, String o2) {
                if (o1.length() > o2.length()) {
                    return 1;
                } else if (o1.length() < o2.length()) {
                    return -1;
                } else {
                    return 0;
                }
            }
        });
        treeSet.add("aaaaa");
        treeSet.add("a");
        treeSet.add("aaa");
        System.out.println(treeSet);




    }

}
