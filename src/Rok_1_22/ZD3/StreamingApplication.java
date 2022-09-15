package Rok_1_22.ZD3;

import java.util.Map;
import java.util.TreeMap;

public class StreamingApplication {

    GoogleWallet googleWallet = new GoogleWallet();
    PayPal payPal = new PayPal();
    CreditCard creditCard = new CreditCard();

    private User appUser;
    private TreeMap<StreamingService, Boolean> services = new TreeMap<StreamingService, Boolean>();

    public StreamingApplication(User user) {
        this.appUser = user;
    }

    public void subscribeToService(StreamingService streamingService) {
        services.put(streamingService, true);
        System.out.println("First subscription to the service " + streamingService.getClass().getSimpleName());
        System.out.println("Amount: " + streamingService.getMonthly());
        System.out.println("Payment for service: " + streamingService.getServiceName());

    }

    public void subscriptionStatus(){
        System.out.println("****************************STATUS******************************++");
        for(Map.Entry<StreamingService, Boolean> entry : services.entrySet()){
            System.out.println(entry.getKey().getClass().getSimpleName() + " " + entry.getValue());
        }
    }

    public void setStatus(StreamingService streamingService, Boolean status){
        if(!services.get(streamingService)){
            System.out.println("Nije aktivan");
            paymentMethod.performPayment(streamingService.getMonthly());
        }
        services.put(streamingService, status);
    }

    public PaymentMethod paymentMethod = creditCard;

    public void setPaymentMethod(PaymentMethod paymentMethod) {
        this.paymentMethod = paymentMethod;

    }


}
