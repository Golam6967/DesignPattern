class BasicDevice implements SmartDevice {
    private String name;
    public BasicDevice(String name) { this.name = name; }
    public String operate() { return name + " is active"; }
}