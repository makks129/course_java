package lesson2;

/**
 * Logical operators
 */
public class Practice11 {

    public static void main(String[] args) {


        final boolean TRUE = true;
        final boolean FALSE = false;

        System.out.println("!");
        System.out.println(!TRUE);          // =
        System.out.println(!FALSE);         // =
        System.out.println();

        System.out.println("&&");
        System.out.println(TRUE && TRUE);   // =
        System.out.println(TRUE && FALSE);  // =
        System.out.println(FALSE && TRUE);  // =
        System.out.println(FALSE && FALSE); // =
        System.out.println();

        System.out.println("||");
        System.out.println(TRUE || TRUE);   // =
        System.out.println(TRUE || FALSE);  // =
        System.out.println(FALSE || TRUE);  // =
        System.out.println(FALSE || FALSE); // =
        System.out.println();

        System.out.println("Practice");
        // 1
        System.out.println(!TRUE && !FALSE);            // =
        // 2
        System.out.println(!(TRUE && FALSE));           // =
        // 3
        System.out.println(TRUE && FALSE || TRUE);      // =
        // 4
        System.out.println(TRUE || FALSE && TRUE);      // =
        // 5
        System.out.println(!TRUE || !FALSE && !TRUE);   // =
        // 6
        System.out.println(!(TRUE || !FALSE) && !TRUE); // =


    }

}
