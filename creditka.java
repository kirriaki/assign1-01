package uni.assign1;
import javax.swing.JOptionPane;

public class creditka implements method {
    @Override
    public void processPayment(double amount) {
        JOptionPane.showMessageDialog(null, "Credit card payment: $" + amount);
    }
}

