package teacher.lesson2;

import javax.swing.*;

/**
 * Implement the following formula:
 *
 * 3 + 4x   10(y - 5)(a + b + c)       4    9 + x
 * ------ - -------------------- + 9 (--- + ----- )
 *   5               x                 x      y
 *
 * Get all variable from user input using JOptionPane
 * Display the result using JOptionPane
 */
public class Practice3 {

    public static void main(String[] args) {

        // 1. Get user input for variable a, b, c, x, y
        String aString = JOptionPane.showInputDialog("Enter value for variable a:");
        int a = Integer.parseInt(aString);
        String bString = JOptionPane.showInputDialog("Enter value for variable b:");
        int b = Integer.parseInt(bString);
        String cString = JOptionPane.showInputDialog("Enter value for variable c:");
        int c = Integer.parseInt(cString);
        String xString = JOptionPane.showInputDialog("Enter value for variable x:");
        int x = Integer.parseInt(xString);
        String yString = JOptionPane.showInputDialog("Enter value for variable y:");
        int y = Integer.parseInt(yString);

        // 2. Calculate formula and save result to variable
        double result = ((3 + 4 * x) / 5) - ((10 * (y - 5) * (a + b + c)) / x) + (9 * (4 / x + (9 + x) / y));

        // 3. Display the result
        JOptionPane.showMessageDialog(null, "Result = " + result);


        // a = 1, b = 2, c = 3, x = 4, y = 5, result = 30
    }

}
