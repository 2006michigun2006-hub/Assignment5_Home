public class RemoteAccessDecorator extends DeviceDecorator {
    public RemoteAccessDecorator(Device decoratedDevice) {
        super(decoratedDevice);
    }
    public void operate() {
        System.out.println("Attempting remote connection...");
        if (SmartHomeContext.isVoiceActive() && SmartHomeContext.isEnergyEfficient()) {
            System.out.println("All systems are working: voice and energy modules are active.");
            System.out.println("Connecting to SmartHome cloud...");
            decoratedDevice.operate();
            syncStatus();
        } else {
            System.out.println("Remote connection is failed: check voice or energy modules.");
            if (!SmartHomeContext.isVoiceActive()) {
                System.out.println("Voice control is inactive.");
            }
            if (!SmartHomeContext.isEnergyEfficient()) {
                System.out.println("Energy-saving system not ready.");
            }
        }
    }
    private void syncStatus() {
        System.out.println("Syncing device status with SmartHome Cloud...");
    }
}