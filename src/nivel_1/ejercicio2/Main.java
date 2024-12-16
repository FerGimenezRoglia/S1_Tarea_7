package nivel_1.ejercicio2;

import nivel_1.ejercicio2.herencia.OnlineWorker2;
import nivel_1.ejercicio2.herencia.OnsiteWorker2;

@SuppressWarnings("deprecation")
public class Main {
    public static void main(String[] args) {

        OnlineWorker2 onlineWorker = new OnlineWorker2("Alicia", "Smith", 20.0);
        double onlineSalary = onlineWorker.calculateSalary(50);
        System.out.println("On-Site Worker Salary: " + onlineSalary + " €.");
        OnsiteWorker2 onsiteWorker = new OnsiteWorker2("Ramón", "Herrera", 25.0);
        double onsiteSalary = onsiteWorker.calculateSalary(25);
        System.out.println("On-Site Worker Salary: " + onsiteSalary + " €.");


        onsiteWorker.calculateBonuses();
        onlineWorker.calculateOvertime(10);

    }
}
