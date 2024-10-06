package uni.assign1;
import javax.swing.JOptionPane;

public class paypal implements method {
    @Override
    public void processPayment(double amount) {
        JOptionPane.showMessageDialog(null, "PayPal payment: $" + amount);
    }
}
