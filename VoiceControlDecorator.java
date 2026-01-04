class VoiceControlDecorator extends DeviceDecorator {
    public VoiceControlDecorator(SmartDevice d) { super(d); }
    public String operate() {
        return "[Voice-Enabled] " + device.operate();
    }
}