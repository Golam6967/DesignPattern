abstract class DeviceController {
    public final void runDevice(String name, OperationMode mode) {
        initializeHardware();
        SmartDevice deviceObj = createDevice(name);
        deviceObj = new VoiceControlDecorator(deviceObj);
        mode.execute(deviceObj.operate());
        shutdownProcedure();
    }

    private void initializeHardware() { System.out.println("System: Initializing hardware components..."); }
    private void shutdownProcedure() { System.out.println("System: Device entering low-power standby."); }

    protected abstract SmartDevice createDevice(String name);
}