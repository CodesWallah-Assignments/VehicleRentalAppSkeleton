public class Car extends Vehicle {
    public Car(String model, String registrationNumber) {
        super(model, registrationNumber);
    }

    @Override
    public double calculateRent(int days) {
        return days * 500; // ₹500 per day
    }
}

