abstract class DeviceDecorator implements SmartDevice {
    protected SmartDevice device;
    public DeviceDecorator(SmartDevice d) { this.device = d; }
}