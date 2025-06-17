public class Truck extends Vehicle {
    public Truck(String model, String registrationNumber) {
        super(model, registrationNumber);
    }

    @Override
    public double calculateRent(int days) {
        return days * 1000; // ₹1000 per day
    }
}

