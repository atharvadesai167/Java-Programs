import java.util.Scanner;

class Employee {
    int employeeID;
    String employeeName;
    String department;
    int yearsOfService;
    double basicSalary;

    Scanner sc = new Scanner(System.in);

    public void addEmployee() {
        System.out.print("Enter Employee ID: ");
        employeeID = sc.nextInt();
        sc.nextLine();

        System.out.print("Enter Employee Name: ");
        employeeName = sc.nextLine();

        System.out.print("Enter Department: ");
        department = sc.nextLine();

        System.out.print("Enter Years of Service: ");
        yearsOfService = sc.nextInt();

        System.out.print("Enter Basic Salary: ");
        basicSalary = sc.nextDouble();
    }

    public void display() {
        System.out.println("\nEmployee ID: " + employeeID);
        System.out.println("Employee Name: " + employeeName);
        System.out.println("Department: " + department);
        System.out.println("Years of Service: " + yearsOfService);
        System.out.println("Basic Salary: " + basicSalary);
    }

    public double calculateSalary() {
        double allowance = 0.20 * basicSalary;
        double increments = yearsOfService * 0.07 * basicSalary;

        return basicSalary + allowance + increments;
    }
}


class Manager extends Employee {
    int teamSize;
    String level;

    public void addManager() {
        addEmployee();

        System.out.print("Enter Team Size: ");
        teamSize = sc.nextInt();
        sc.nextLine();

        System.out.print("Enter Manager Level: ");
        level = sc.nextLine();
    }

    public void assignTask() {
        System.out.println("Manager is assigning tasks to the team.");
    }

    @Override
    public void display() {
        super.display();

        System.out.println("Team Size: " + teamSize);
        System.out.println("Manager Level: " + level);
    }

    @Override
    public double calculateSalary() {
        double allowance = 0.20 * basicSalary;
        double increments = yearsOfService * 0.07 * basicSalary;
        double bonus = teamSize * 0.03 * basicSalary;

        return basicSalary + allowance + increments + bonus;
    }
}


class SeniorManager extends Manager {
    int numberOfTeams;
    String projectType;

    public void addSeniorManager() {
        addManager();

        System.out.print("Enter Number of Teams: ");
        numberOfTeams = sc.nextInt();
        sc.nextLine();

        System.out.print("Enter Project Type: ");
        projectType = sc.nextLine();
    }

    public void allocateBudget() {
        System.out.println("Senior Manager is allocating budget for projects.");
    }

    @Override
    public void display() {
        super.display();

        System.out.println("Number of Teams: " + numberOfTeams);
        System.out.println("Project Type: " + projectType);
    }

    @Override
    public double calculateSalary() {
        double allowance = 0.20 * basicSalary;
        double increments = yearsOfService * 0.07 * basicSalary;
        double bonus = teamSize * 0.03 * basicSalary;

        return basicSalary + allowance + increments + bonus;
    }
}


class Developer extends Employee {
    String languageSkills;
    String level;

    public void addDeveloper() {
        addEmployee();

        System.out.print("Enter Language/Skills: ");
        sc.nextLine();
        languageSkills = sc.nextLine();

        System.out.print("Enter Developer Level: ");
        level = sc.nextLine();
    }

    public void writeCode() {
        System.out.println("Developer is writing code using " + languageSkills + ".");
    }

    @Override
    public void display() {
        super.display();

        System.out.println("Language/Skills: " + languageSkills);
        System.out.println("Developer Level: " + level);
    }

    @Override
    public double calculateSalary() {
        double allowance = 0.20 * basicSalary;
        double increments = yearsOfService * 0.07 * basicSalary;

        double certificationBonus = 0;

        if (languageSkills.equalsIgnoreCase("C")) {
            certificationBonus = 0.02 * basicSalary;
        }
        else if (languageSkills.equalsIgnoreCase("CPP")) {
            certificationBonus = 0.03 * basicSalary;
        }
        else if (languageSkills.equalsIgnoreCase("Java")) {
            certificationBonus = 0.05 * basicSalary;
        }
        else if (languageSkills.equalsIgnoreCase("Python")) {
            certificationBonus = 0.05 * basicSalary;
        }

        return basicSalary + allowance + increments + certificationBonus;
    }
}


public class EmployeeManagementSystem {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("===== EMPLOYEE MANAGEMENT SYSTEM =====");

        System.out.println("\n1. Employee");
        System.out.println("2. Manager");
        System.out.println("3. Senior Manager");
        System.out.println("4. Developer");

        System.out.print("\nEnter your choice: ");
        int choice = sc.nextInt();

        if (choice == 1) {

            Employee e = new Employee();

            e.addEmployee();
            e.display();

            System.out.println("Total Salary: " + e.calculateSalary());
        }

        else if (choice == 2) {

            Manager m = new Manager();

            m.addManager();
            m.display();
            m.assignTask();

            System.out.println("Total Salary: " + m.calculateSalary());
        }

        else if (choice == 3) {

            SeniorManager sm = new SeniorManager();

            sm.addSeniorManager();
            sm.display();
            sm.assignTask();
            sm.allocateBudget();

            System.out.println("Total Salary: " + sm.calculateSalary());
        }

        else if (choice == 4) {

            Developer d = new Developer();

            d.addDeveloper();
            d.display();
            d.writeCode();

            System.out.println("Total Salary: " + d.calculateSalary());
        }

        else {
            System.out.println("Invalid choice.");
        }

        sc.close();
    }
}