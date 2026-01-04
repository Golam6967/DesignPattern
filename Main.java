public class Main {
    public static void main(String[] args) {
        DeviceController lightControl = SmartHomeFactory.getController("LIGHT");
        lightControl.runDevice("Living Room", new EcoMode());
        
        System.out.println("------------------------------------");
        
        DeviceController fanControl = SmartHomeFactory.getController("FAN");
        fanControl.runDevice("Bedroom", new PerformanceMode());
    }
}