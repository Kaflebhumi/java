public class VehicleRentalSystem {
    public static void main(String[] args) {
        Car car = new Car("J278", 9000, 4);
        Truck truck = new Truck("C890", 8999, 2, 3000);
        Bike bike = new Bike("K875", 9060, 3);

        System.out.println("Car plate number: " + car.getPlateNumber());
        System.out.println("No. of days: " + car.getDays());
        System.out.println("Total rate: " + car.calculateRental());
        System.out.println(" ");

        System.out.println("Truck plate number: " + truck.getPlateNumber());
        System.out.println("No. of days: " + truck.getDays());
        System.out.println("Total rate: " + truck.calculateRental());
        System.out.println(" ");

        System.out.println("Bike plate number: " + bike.getPlateNumber());
        System.out.println("No. of days: " + bike.getDays());
        System.out.println("Total rate: " + bike.calculateRental());
    }
}

abstract class Vehicle{
    private String plateNumber;
    private double baseRate;
    private int days;

    public Vehicle(String platenumber, double baserate, int days){
        this.plateNumber = platenumber;
        this.baseRate = baserate;
        this.days = days;
    }

    public String getPlateNumber(){
        return plateNumber;
    }
    public void setPlateNumber(String platenumber){
        this.plateNumber = platenumber;
    }

    public double getBaseRate(){
        return baseRate;
    }
    public void setBaseRate(double baserate){
        this.baseRate = baserate;
    }

    public int getDays(){
        return days;
    }
    public void setDays(int days){
        this.days = days;
    }

    public double calculateRental(){
        return baseRate;
    }
}

class Car extends Vehicle{
    public Car(String pn, double br, int days){
        super(pn, br, days);
    }

    @Override
    public double calculateRental(){
        return getBaseRate() * getDays();
    }
}

class Truck extends Vehicle{
    private double loadFee;

    public Truck(String pn, double br, int days, double lf){
        super(pn, br, days);
        this.loadFee = lf;
    }

    public double getLoadFee(){
        return loadFee;
    }
    public void setLoadFee(double lf){
        this.loadFee = lf;
    }

    @Override
    public double calculateRental(){
        return getBaseRate() * getDays() + getLoadFee();
    }
}

class Bike extends Vehicle{
    public Bike(String pn, double br, int days){
        super(pn, br, days);
    }

    @Override
    public double calculateRental(){
        return getBaseRate();
    }
}