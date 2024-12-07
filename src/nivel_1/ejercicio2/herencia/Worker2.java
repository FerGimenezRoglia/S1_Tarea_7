package nivel_1.ejercicio2.herencia;

public abstract class Worker2 {

    protected final String name;
    protected final String surname;
    protected double hourlyRate;

    public Worker2(String name, String surname, double hourlyRate) {
        this.name = name;
        this.surname = surname;
        this.hourlyRate = hourlyRate;
    }

    public String getName() {
        return name;
    }

    public String getSurname() {
        return surname;
    }

    public abstract double calculateSalary(int hoursWorked);

    @Override
    public String toString() {
        return "Worker --> " + name + " " + surname;
    }
}
