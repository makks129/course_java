package teacher.lesson3;

/**
 * 1. Write a loop that counts back from 99 to 0
 * 2. Write a loop that counts back from 99 to 0 by 2
 */
public class Practice1 {

    public static void main(String[] args) {


        int i = 99;
        while (i >= 0) {
            System.out.println(i);
            i -= 2;
        }


        for (int j = 99; j >= 0; j -= 2) {
            System.out.println(j);
        }


    }

}