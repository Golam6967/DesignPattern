class SmartHomeFactory {
    public static DeviceController getController(String type) {
        if (type.equalsIgnoreCase("LIGHT")) return new LightController();
        return new FanController();
    }
}