public abstract class Vehicle {
    private String model;
    private String registrationNumber;

    public Vehicle(String model, String registrationNumber) {
        this.model = model;
        this.registrationNumber = registrationNumber;
    }

    public String getModel() {
        return model;
    }

    public String getRegistrationNumber() {
        return registrationNumber;
    }

    public abstract double calculateRent(int days); // Abstract method
}

