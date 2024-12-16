package nivel_1.ejercicio2.herencia;

public class OnsiteWorker2 extends Worker2{

    private static double fuel = 30;

    public OnsiteWorker2(String name, String surname, double hourlyRate) {
        super(name, surname, hourlyRate);
    }

    public static double getFuel() {
        return fuel;
    }

    public static void setFuel(double fuel) {
        OnsiteWorker2.fuel = fuel;
    }


    @Override
    public double calculateSalary(int hoursWorked) {

        return (hoursWorked * super.hourlyRate) + fuel;
    }

    @Deprecated
    public void calculateBonuses() {
        System.out.println("Deprecated methot ");
    }

    @Override
    public String toString() {
        return super.toString();
    }

}
