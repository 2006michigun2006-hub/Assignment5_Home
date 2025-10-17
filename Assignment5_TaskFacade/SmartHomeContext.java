public class SmartHomeContext {
    private static boolean connection = false;
    private static boolean voiceActive = false;
    private static boolean energyEfficient = false;
    public static void setVoiceActive(boolean state) {
        voiceActive = state;
    }
    public static boolean isVoiceActive() {
        return voiceActive;
    }
    public static void setEnergyEfficient(boolean state) {
        energyEfficient = state;
    }
    public static boolean isEnergyEfficient() {
        return energyEfficient;
    }
    public static void setNetworkConnected(boolean connection1) {
        connection = connection1;
    }
}