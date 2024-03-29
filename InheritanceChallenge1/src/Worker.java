public class Worker {
    private String name;
    private String birthDate;  // Date format mm/dd/yyyy
    protected String endDate;

    public Worker() {
    }
    public Worker(String name, String birthDate) {
        this.name = name;
        this.birthDate = birthDate;
    }

    public int getAge() {
        int currentYear = 2024;
        int birthYear = Integer.parseInt(birthDate.substring(6)); // Date format mm/dd/yyyy
        return currentYear - birthYear;
    }

    public double collectPay() {
        return 0.0;   // this method should be overridden
    }

    public void terminate(String endDate) {
        this.endDate = endDate;
    }

    public String toString() {
        return "Worker{" +
                "name='" + name + '\'' +
                ", birthDate='" + birthDate + '\'' +
                ", endDate='" + endDate + '\'' +
                '}';
    }
}
