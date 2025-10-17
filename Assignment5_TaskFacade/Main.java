public class Main {
    public static void main(String[] args) {
        System.out.println("Welcome to SmartHome Simulation 2.0");
        System.out.println("Initializing Home #1 (Modern Smart Home)");

        Device light1 = new VoiceControlDecorator(new EnergySavingDecorator(new Light()));
        Device camera1 = new RemoteAccessDecorator(new Cameras());
        Device heat1 = new EnergySavingDecorator(new Otoplenie());
        Device traps1 = new TrapSystem();
        Device electricity1 = new EnergySavingDecorator(new Electricity());

        SmartHomeContext.setVoiceActive(true);
        SmartHomeContext.setEnergyEfficient(true);
        SmartHomeContext.setNetworkConnected(true);

        HomeAutomationFacade home1 = new HomeAutomationFacade(light1, camera1, heat1, traps1, electricity1);
        try {
            System.out.println("Starting Party Mode in Home #1");
            home1.startPartyMode();
            Thread.sleep(1500);
            System.out.println("Activating Night Mode in Home #1");
            home1.activateNightMode();
            Thread.sleep(1500);
            System.out.println(" Leaving Home #1");
            home1.leaveHome();
            Thread.sleep(1500);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("Initializing Home #2 (Classic Offline Home)\n");
        Device light2 = new Light();
        Device electricity2 = new Electricity();
        Device camera2 = new Cameras();
        Device traps2 = new TrapSystem();
        Device heat2 = new Otoplenie();

        SmartHomeContext.setVoiceActive(false);
        SmartHomeContext.setEnergyEfficient(false);
        SmartHomeContext.setNetworkConnected(false);

        HomeAutomationFacade home2 = new HomeAutomationFacade(light2, electricity2, heat2, camera2, traps2);

        try {
            System.out.println("Starting Party Mode in Home #2");
            home2.startPartyMode();
            Thread.sleep(1500);

            System.out.println("Activating Night Mode in Home #2");
            home2.activateNightMode();
            Thread.sleep(1500);
            System.out.println("Leaving Home #2");
            home2.leaveHome();
            Thread.sleep(1500);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}