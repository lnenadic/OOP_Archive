package Rok_1_22.ZD3;

public class AppTest {

    public AppTest() {

    }

    public static void main(String[] args) {
        User user = new User("USR-1");
        NetFlix netflix = new NetFlix("NetFlix", 40.0);
        HBO hbo = new HBO("HBO", 30.0);
        SuperSport superSport = new SuperSport("SuperSport", 50.0);
        StreamingApplication streamingApplication = new StreamingApplication(user);
        streamingApplication.subscribeToService(netflix);
        streamingApplication.subscribeToService(hbo);
        streamingApplication.setStatus(netflix, false);

        streamingApplication.subscribeToService(superSport);
        streamingApplication.subscriptionStatus();

        streamingApplication.setStatus(netflix, true);

        streamingApplication.subscriptionStatus();

    }

}
