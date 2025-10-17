public class VoiceControlDecorator extends DeviceDecorator {
    public VoiceControlDecorator(Device decoratedDevice) {
        super(decoratedDevice);
    }
    public void operate() {
        System.out.println("Voice assistant is listening to your commands...");
        String command = "turn on";
        processVoiceCommand(command);
    }
    private void processVoiceCommand(String command) {
        if (command.equalsIgnoreCase("turn on")) {
            System.out.println("Command received: system is active and ready to work.");
            SmartHomeContext.setVoiceActive(true);
            decoratedDevice.operate();
        } else {
            SmartHomeContext.setVoiceActive(false);
            System.out.println("Unknown command. The system stays locked.");
        }
    }
}