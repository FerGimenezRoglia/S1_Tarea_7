package nivel_1.ejercicio2;

import nivel_1.ejercicio2.herencia.OnlineWorker2;
import nivel_1.ejercicio2.herencia.OnsiteWorker2;
import nivel_1.ejercicio2.modulo.ManagementOfWorkers2;

public class Main {
    public static void main(String[] args) {

        OnlineWorker2 onlineWorker = new OnlineWorker2("Alice", "Smith", 20.0);
        OnsiteWorker2 onsiteWorker = new OnsiteWorker2("Bob", "Johnson", 25.0);

        onsiteWorker.calculateBonuses();
        onlineWorker.calculateOvertime(10);

    }
}
