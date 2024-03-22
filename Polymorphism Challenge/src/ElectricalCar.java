public class ElectricalCar extends Car{
    private double avgKmPerCharge;
    private int batterySize;

    public ElectricalCar(String description) {
        super(description);
    }
    public ElectricalCar(String description, double avgKmPerCharge, int batterySize) {
        super(description);
        this.avgKmPerCharge = avgKmPerCharge;
        this.batterySize = batterySize;
    }

    public void startEngine() {
        System.out.printf("Electrical -> Battery Size %d", batterySize);
    }

    protected void runEngine() {
        System.out.printf("Electrical -> usage exceeds the average: %.2f %n", avgKmPerCharge);
    }
}
