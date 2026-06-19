public class EmployeeSystem {

    public static void main(String[] args) {

        Supervisor supervisor = new Supervisor("Aashis Paudel", 25, 80000.00, 2, 1000.99);
        Coder coder = new Coder("Dipesh Dhakal", 30, 29900.04, 1000, 8);

        System.out.println("Supervisor Name : " + supervisor.getName());
        System.out.println("Employee ID : " + supervisor.getId());
        System.out.println("Total Salary : " + supervisor.calculatePay());

        System.out.println();

        System.out.println("Coder Name : " + coder.getName());
        System.out.println("Employee ID : " + coder.getId());
        System.out.println("Total Salary : " + coder.calculatePay());
    }
}

abstract class Worker {

    private String name;
    private int id;
    private double salary;
    private double payRate;

    public Worker(String name, int id, double salary, double payRate) {
        this.name = name;
        this.id = id;
        this.salary = salary;
        this.payRate = payRate;
    }

    public String getName() {
        return name;
    }

    public int getId() {
        return id;
    }

    public double getSalary() {
        return salary;
    }

    public double getPayRate() {
        return payRate;
    }

    abstract double calculatePay();
}

class Supervisor extends Worker {

    private double bonusAmount;

    public Supervisor(String name, int id, double salary, double payRate, double bonusAmount) {
        super(name, id, salary, payRate);
        this.bonusAmount = bonusAmount;
    }

    @Override
    double calculatePay() {
        return getSalary() + bonusAmount;
    }
}

class Coder extends Worker {

    private double overtimeHours;

    public Coder(String name, int id, double salary, double payRate, double overtimeHours) {
        super(name, id, salary, payRate);
        this.overtimeHours = overtimeHours;
    }

    @Override
    double calculatePay() {
        return getSalary() + (overtimeHours * getPayRate());
    }
}