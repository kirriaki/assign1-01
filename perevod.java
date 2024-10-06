package uni.assign1;
import javax.swing.JOptionPane;

public class perevod implements method {
    @Override
    public void processPayment(double amount) {
        JOptionPane.showMessageDialog(null, "bank transfer: $" + amount);
    }
}
