package lesson13;

import collection.geometry.GeometricObject;
import collection.social_network.User;
import collection.social_network.UserProfile;

import java.util.*;

public class Test {

    public static void main(String[] args) {


        GeometricObject triangle = new GeometricObject() {

            double side1;
            double side2;
            double side3;

            @Override
            public double getArea() {
                return 0;
            }

            @Override
            public double getPerimeter() {
                return side1 + side2 + side3;
            }
        };

        triangle.getPerimeter();


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


        List<User> users = new ArrayList<>();
        users.add(new User(new UserProfile(null, "Ivan", 29)));
        users.add(new User(new UserProfile(null, "Petr", 18)));
        users.add(new User(new UserProfile(null, "Maria", 32)));
        users.add(new User(new UserProfile(null, "Nastya", 98)));
        users.add(new User(new UserProfile(null, "Aristarkh", 53)));

        for (int i = 0; i < users.size(); i++) {
            System.out.println(users.get(i).getProfile().getName());
        }

        System.out.println();

        Collections.sort(users, new Comparator<User>() {
            @Override
            public int compare(User o1, User o2) {
                return o1.getProfile().getName().compareTo(o2.getProfile().getName());
            }
        });

        for (int i = 0; i < users.size(); i++) {
            System.out.println(users.get(i).getProfile().getName());
        }
        System.out.println();

        Collections.sort(users, new Comparator<User>() {
            @Override
            public int compare(User o1, User o2) {
                int age1 = o1.getProfile().getAge();
                int age2 = o2.getProfile().getAge();
                if (age1 > age2) {
                    return -1;
                } else if (age1 < age2) {
                    return 1;
                } else {
                    return 0;
                }
            }
        });

        for (int i = 0; i < users.size(); i++) {
            System.out.println(users.get(i).getProfile().getName() + " age: " + users.get(i).getProfile().getAge());
        }





    }


}
