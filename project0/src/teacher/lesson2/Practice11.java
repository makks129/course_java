package lesson2;

/**
 * Logical operators
 */
public class Practice11 {

    public static void main(String[] args) {


        final boolean TRUE = true;
        final boolean FALSE = false;

        System.out.println("!");
        System.out.println(!TRUE);          // = false
        System.out.println(!FALSE);         // = true
        System.out.println();

        System.out.println("&&");
        System.out.println(TRUE && TRUE);   // = true
        System.out.println(TRUE && FALSE);  // = false
        System.out.println(FALSE && TRUE);  // = false
        System.out.println(FALSE && FALSE); // = false
        System.out.println();

        System.out.println("||");
        System.out.println(TRUE || TRUE);   // = true
        System.out.println(TRUE || FALSE);  // = true
        System.out.println(FALSE || TRUE);  // = true
        System.out.println(FALSE || FALSE); // = false
        System.out.println();

        System.out.println("Practice");
        // 1
        System.out.println(!TRUE && !FALSE);            // = false
        // 2
        System.out.println(!(TRUE && FALSE));           // = true
        // 3
        System.out.println(TRUE && FALSE || TRUE);      // = true
        // 4
        System.out.println(TRUE || FALSE && TRUE);      // = true
        // 5
        System.out.println(!TRUE || !FALSE && !TRUE);   // = false
        // 6
        System.out.println(!(TRUE || !FALSE) && !TRUE); // = false


    }

}
