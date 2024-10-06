package uni.assign1;
import javax.swing.JOptionPane;

public class Main {
    public static void main(String[] args) {
        newPay.registerPaymentMethod("creditcard", creditka::new);
        newPay.registerPaymentMethod("paypal", paypal::new);
        newPay.registerPaymentMethod("banktransfer", perevod::new);

        String[] options = {"creditcard", "paypal", "banktransfer"};
        String choice = (String) JOptionPane.showInputDialog(
                null,
                "Choose a paying method:",
                "Payment: ",
                JOptionPane.QUESTION_MESSAGE,
                null,
                options,
                options[0]
        );

        String amountStr = JOptionPane.showInputDialog(null, "Enter the amount:");

        double amount = 0;
        try {
            amount = Double.parseDouble(amountStr);
        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(null, "Invalid amount.S", "Error", JOptionPane.ERROR_MESSAGE);
            System.exit(0); //
        }

        try {
            method paymentMethod = newPay.getPaymentMethod(choice);
            paymentMethod.processPayment(amount);
        } catch (IllegalArgumentException e) {
            JOptionPane.showMessageDialog(null, e.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
        }
    }
}
