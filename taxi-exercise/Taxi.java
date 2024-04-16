public class Taxi {
    
    private Human driver;
    private Human[] passengers;
    
    public Taxi(Human driver) {
        this.driver = driver;
        this.passengers = new Human[4];
    }
    
    public String getDriverName() {
        return driver.getFullName();
    }
    
    public void add(Human passenger) {
        for (int i = 0; i < passengers.length; i++) {
            if (passengers[i] == null) {
                passengers[i] = passenger;
                System.out.printf("%s gets in.\n", passenger);
                return;
            }
        }
        System.out.printf("We are sorry, %s. The taxi is full.\n", passenger);
    }
    public String getStatus() {
        if (passengers[0] == null) {
            return String.format("This is the taxi of %s. He takes nobody along.", driver);
        }
        else if (passengers[1] == null) {
            return String.format("This is the taxi of %s. He takes %s along.", driver, passengers[0]);
        }
        else if (passengers[2] == null) {
            return String.format("This is the taxi of %s. He takes %s and %s along.", driver, passengers[0], passengers[1]);
        }
        else if (passengers[3] == null) {
            return String.format("This is the taxi of %s. He takes %s, %s and %s along.", driver, passengers[0], passengers[1], passengers[2]);
        }
        else {
            return String.format("This is the taxi of %s. He takes %s, %s, %s and %s along.", driver, passengers[0], passengers[1], passengers[2], passengers[3]);
        }
    }
    public Human[] allGetOut() {
        int count = 0;
        for (int i = 0; i < passengers.length; i++) {
            if (passengers[i] != null) {
                count++;
            }
        }
        Human[] tempPassengers = new Human[count];
        System.arraycopy(passengers, 0, tempPassengers, 0, count);
        this.passengers = new Human[4];
        return tempPassengers;
    }
    
    @Override
    public String toString() {
        return getStatus();
    }
}