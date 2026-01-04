class FanController extends DeviceController {
    protected SmartDevice createDevice(String name) {
        return new BasicDevice("High-Speed Fan (" + name + ")");
    }
}