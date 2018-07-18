package lesson2;

import javax.swing.*;

/**
 * FROM LESSON 1 PROGRAM 5
 */
public class Practice2 {

    public static void main(String[] args) {

        // Calculate tips for a bill
        // 1. Enter bill sum
        // 2. Enter tips %
        // 3. Return tips amount and total amount to pay

        String billSumString = JOptionPane.showInputDialog("Enter bill sum: ");
        double billSum = Double.parseDouble(billSumString);

        String tipsPercentageString = JOptionPane.showInputDialog("Enter tips %: ");
        double tipsPercentage = Double.parseDouble(tipsPercentageString);

        double tipsAmount = tipsPercentage / 100 * billSum;
        double totalAmount = billSum + tipsAmount;

        String message = "Tips are " + tipsAmount + " and total amount to pay is " + totalAmount;
        JOptionPane.showMessageDialog(null, message);

    }

}
