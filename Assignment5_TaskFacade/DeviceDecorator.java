public abstract class DeviceDecorator implements Device {
    protected Device decoratedDevice;
    public DeviceDecorator(Device decoratedDevice) {
        this.decoratedDevice = decoratedDevice;
    }
    public void operate() {
        decoratedDevice.operate();
    }
}