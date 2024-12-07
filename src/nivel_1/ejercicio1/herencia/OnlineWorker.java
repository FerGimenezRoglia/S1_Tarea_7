package nivel_1.ejercicio1.herencia;

public class OnlineWorker extends Worker {

    private static final double INTERNET_RATE = 50.0;

    public OnlineWorker(String name, String surname, double hourlyRate) {
        super(name, surname, hourlyRate);
    }

    @Override
    public double calculateSalary(int hoursWorked) {
        return (hoursWorked * this.hourlyRate) + INTERNET_RATE;
    }

    @Override
    public String toString() {
        return super.toString();
    }
}
