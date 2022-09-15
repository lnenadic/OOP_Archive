package Rok_1_22.ZD3;

public class GoogleWallet implements PaymentMethod{

    public GoogleWallet() {

    }

    @Override
    public void performPayment(Double monthly) {
        System.out.println("Payed by " + getClass().getSimpleName());
    }
}
