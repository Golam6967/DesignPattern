class EcoMode implements OperationMode {
    public void execute(String action) {
        System.out.println("MODE: ECO (Power Saving) -> " + action);
    }
}