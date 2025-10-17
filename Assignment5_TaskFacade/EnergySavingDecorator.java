public class EnergySavingDecorator extends DeviceDecorator {
    public EnergySavingDecorator(Device decoratedDevice) {
        super(decoratedDevice);
    }
    private int saved = 15;
    public void operate() {
        System.out.println("Checking power usage before activation...");
        if (saved == 15) {
            System.out.println("Device works efficiently in all aspects.");
            SmartHomeContext.setEnergyEfficient(true);
            decoratedDevice.operate();
            optimizeEnergy();
        } else {
            SmartHomeContext.setEnergyEfficient(false);
            System.out.println("You are using energy incorrectly. The system is locked.");
        }
    }
    private void optimizeEnergy() {
        System.out.println("Energy-saving system reduced power usage by " + saved + "%.");
    }
}