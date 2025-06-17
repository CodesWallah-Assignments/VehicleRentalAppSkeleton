public class Bike extends Vehicle {
    public Bike(String model, String registrationNumber) {
        super(model, registrationNumber);
    }

    @Override
    public double calculateRent(int days) {
        return days * 200; // ₹200 per day
    }
}

