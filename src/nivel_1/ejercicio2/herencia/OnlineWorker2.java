package nivel_1.ejercicio2.herencia;

import nivel_1.ejercicio2.herencia.Worker2;

public class OnlineWorker2 extends Worker2 {

    private static final double INTERNET_RATE = 50.0;

    public OnlineWorker2(String name, String surname, double hourlyRate) {
        super(name, surname, hourlyRate);
    }

    @Override
    public double calculateSalary(int hoursWorked) {
        return (hoursWorked * this.hourlyRate) + INTERNET_RATE;
    }

    @Deprecated
    public void calculateOvertime(int overtimeHours) {
        double overtimePay = overtimeHours * (hourlyRate * 1.5);
        System.out.println("\nDeprecated methot:  _ Over time pay: " +overtimePay);
    }

    @Override
    public String toString() {
        return super.toString();
    }

}
