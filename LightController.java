class LightController extends DeviceController {
    protected SmartDevice createDevice(String name) {
        return new BasicDevice("Smart LED (" + name + ")");
    }
}