package nivel_1.ejercicio1;

import nivel_1.ejercicio1.herencia.OnlineWorker;
import nivel_1.ejercicio1.herencia.OnsiteWorker;

public class Main {
    public static void main(String[] args) {

        OnsiteWorker onsiteWorker = new OnsiteWorker("Oscar", "Pérez", 45);
        double onSiteSalary = onsiteWorker.calculateSalary(35);
        System.out.println("On-Site Worker Salary: " + onSiteSalary + " €.");

        OnlineWorker onlineWorker = new OnlineWorker("Pedro", "López", 80);
        double onLineSalary = onlineWorker.calculateSalary(30);
        System.out.println("On-Line Worker Salary: " + onLineSalary + " €.");

    }
}
