package teacher.lesson2;

import javax.swing.*;

/**
 * Age blocker
 */
public class Practice7 {

    public static void main(String[] args) {

        String ageString = JOptionPane.showInputDialog("Enter your age");
        int age = Integer.parseInt(ageString);

        boolean isYoung = age < 18;
        if (isYoung) {
            JOptionPane.showMessageDialog(null, "Must be 18+ to enter");
        } else {
            JOptionPane.showMessageDialog(null, "Welcome");
        }


    }


}
