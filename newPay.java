package uni.assign1;

import java.util.HashMap;
import java.util.Map;
import java.util.function.Supplier;

public class newPay {
    private static Map<String, Supplier<method>> paymentMethods = new HashMap<>();

    public static void registerPaymentMethod(String methodName, Supplier<method> supplier) {
        paymentMethods.put(methodName, supplier);
    }

    public static method getPaymentMethod(String methodName) {
        Supplier<method> supplier = paymentMethods.get(methodName);
        if (supplier != null) {
            return supplier.get();
        }
        throw new IllegalArgumentException("Payment method not found");
    }
}

