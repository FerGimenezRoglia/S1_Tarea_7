package nivel_1.ejercicio1.modulo;

import nivel_1.ejercicio1.herencia.OnlineWorker;
import nivel_1.ejercicio1.herencia.OnsiteWorker;
import nivel_1.ejercicio1.herencia.Worker;

import java.util.ArrayList;
import java.util.Scanner;

public class ManagementOfWorkers {

    ArrayList<Worker> workers = new ArrayList<>();

    public void manageWorkers() {
        workerManagementMenu();
    }

    public static int menuOptions() {
        Scanner sc = new Scanner(System.in);

        try {
            System.out.println("\nWorker Management Menu: ");
            System.out.println("1. Add Worker");
            System.out.println("2. Calculate Salary");
            System.out.println("3. Show All Workers");
            System.out.println("0. Exit");
            System.out.print("Enter your option: ");

            int option = sc.nextInt();
            sc.nextLine();
            return option;

        } catch (Exception e) {
            System.out.println("Invalid input. Please enter a valid number.");
            sc.nextLine();
            return -1;
        }

    }

    public void workerManagementMenu() {
        int option;
        do {
            option = menuOptions();

            switch (option) {
                case 1:
                    addWorker();
                    break;
                case 2:
                    selectWorkerForSalaryCalculation();
                    break;
                case 3:
                    showAllWorkers();
                    break;
                case 0:
                    System.out.println("Exiting the application...");
                    break;
                default:
                    if (option == -1) {
                        System.out.println("Invalid input. Please try again.");
                    } else {
                        System.out.println("Please enter a valid option.");
                    }
            }
        } while (option != 0);
    }

    private void addWorker() {
        Scanner sc = new Scanner(System.in);

        try {
            System.out.print("Enter worker name: ");
            String name = sc.nextLine();

            System.out.print("Enter worker surname: ");
            String surname = sc.nextLine();

            System.out.print("Enter hourly rate: ");
            double hourlyRate = sc.nextDouble();

            System.out.print("Enter worker type (1: Online, 2: Onsite): ");
            int workerType = sc.nextInt();

            if (workerType == 1) {
                workers.add(new OnlineWorker(name, surname, hourlyRate));
                System.out.println("Online Worker added successfully!");
            } else if (workerType == 2) {
                workers.add(new OnsiteWorker(name, surname, hourlyRate));
                System.out.println("Onsite Worker added successfully!");
            } else {
                System.out.println("Invalid worker type. Please try again.");
            }
        } catch (Exception e) {
            System.out.println("Error: Invalid input. Please try again.");
            sc.nextLine();
        }
    }

    private void selectWorkerForSalaryCalculation() {
        Scanner sc = new Scanner(System.in);

        try {
            if (workers.isEmpty()) {
                System.out.println("No workers available to calculate salary.");
            }

            System.out.println("\nWorker List:");
            for (int i = 0; i < workers.size(); i++) {
                System.out.println(i + ": " + workers.get(i));
            }

            System.out.print("Select worker index (0 to " + (workers.size() - 1) + "): ");
            int index = sc.nextInt();

            if (index >= 0 && index < workers.size()) {
                Worker selectedWorker = workers.get(index);
                calculateSalary(selectedWorker);
            } else {
                System.out.println("Invalid index. Please try again.");
            }
        } catch (Exception e) {
            System.out.println("Error: Invalid input. Please try again.");
            sc.nextLine();
        }
    }

    private void calculateSalary(Worker worker) {
        Scanner sc = new Scanner(System.in);

        try {

            if (worker instanceof OnlineWorker) {
                System.out.print("Enter monthly hours worked: ");
                int hoursWorked = sc.nextInt();

                double salary = worker.calculateSalary(hoursWorked);
                System.out.println("Calculated Salary for Online Worker " + worker.getName() + ": " + salary);

            } else if (worker instanceof OnsiteWorker) {
                System.out.print("Enter monthly hours worked: ");
                int hoursWorked = sc.nextInt();

                double salary = worker.calculateSalary(hoursWorked);
                System.out.println("Calculated Salary for Onsite Worker " + worker.getName() + ": " + salary);

            } else {
                System.out.println("Worker type does not match. Please try again.");
            }
        } catch (Exception e) {
            System.out.println("Error: Invalid input. Please try again.");
            sc.nextLine();
        }
    }

    private void showAllWorkers() {
        if (workers.isEmpty()) {
            System.out.println("No workers have been added yet.");
        } else {
            System.out.println("\nWorker List:");
            for (Worker worker : workers) {
                System.out.println(worker);
            }
        }
    }

}
