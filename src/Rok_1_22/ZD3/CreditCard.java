package Rok_1_22.ZD3;

public class CreditCard implements PaymentMethod{

    public CreditCard() {

    }

    @Override
    public void performPayment(Double monthly) {
        System.out.println("Payed by " + getClass().getSimpleName());
    }
}
