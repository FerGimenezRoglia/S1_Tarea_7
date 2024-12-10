package nivel_1.ejercicio1.herencia;

public class OnsiteWorker extends Worker {

    private static double fuel = 30;

    public OnsiteWorker(String name, String surname, double hourlyRate) {
        super(name, surname, hourlyRate);
    }

    public static double getFuel() {
        return fuel;
    }

    public static void setFuel(double fuel) {
        OnsiteWorker.fuel = fuel;
    }


    @Override
    public double calculateSalary(int hoursWorked) {

        return (hoursWorked * super.hourlyRate) + fuel;
    }

    @Override
    public String toString() {
        return super.toString();
    }
}
