public class HomeAutomationFacade {
    private Device light;
    private Device camera;
    private Device otoplenie;
    private Device traps;
    private Device electricity;
    public HomeAutomationFacade(Device light, Device camera, Device otoplenie, Device traps, Device electricity) {
        this.light = light;
        this.camera = camera;
        this.otoplenie = otoplenie;
        this.traps = traps;
        this.electricity = electricity;
    }
    public void startPartyMode() {
        System.out.println("Starting Party Mode...");
        light.operate();
        otoplenie.operate();
        electricity.operate();
    }
    public void activateNightMode() {
        System.out.println("Activating Night Mode...");
        System.out.println("Turning off lights...");
        otoplenie.operate();
        camera.operate();
    }
    public void leaveHome() {
        System.out.println("Leaving Home...");
        System.out.println("Turning off all devices...");
        camera.operate();
    }
}