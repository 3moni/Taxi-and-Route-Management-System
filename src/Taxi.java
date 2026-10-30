public class Taxi {

    private final int taxiId;
    private String numberPlate;
    private int mileage;
    private boolean electricVehicle;
    private static int nextId = 499101; //holds next incremented id number
    private Driver driver;
    private TaxiType type;

    private static final double RATE_SMALL = 0.93;
    private static final double RATE_REGULAR = 1.21;
    private static final double RATE_MINIBUS = 2.55;
    private static final double ELECTRIC_DISCOUNT = 0.7;




    /**
     * a simple taxi constructor that takes in numberPlate, mileage, electricalVehicle and type
     * as parameters
     */
    public Taxi(String numberPlate, int mileage, boolean electricVehicle, TaxiType type) {
        this.taxiId = nextId;
        nextId++;

        this.numberPlate = numberPlate;
        this.mileage = mileage;
        this.electricVehicle = electricVehicle;
        this.type = type;
    }

    /**
     * a more complex driver constructor that takes numberPlate, mileage, electricalVehicle, type
     * and an extra parameter which is a driver object
     */
    public Taxi(String numberPlate, int mileage, boolean electricVehicle, TaxiType type, Driver driver) {
        this.taxiId = nextId;
        nextId++;

        this.numberPlate = numberPlate;
        this.mileage = mileage;
        this.electricVehicle = electricVehicle;
        this.type = type;
        this.driver = driver;
    }

    /**
     * Method that calculates cost of trip depending on taxi type
     */
    public double calculateCost(double milesAmount) {
        double cost = 0;
        switch (type) {
            case SMALL -> {
                cost = milesAmount * RATE_SMALL;
            }
            case REGULAR -> {
                cost = milesAmount * RATE_REGULAR;
            }
            case MINIBUS -> {
                cost = milesAmount * RATE_MINIBUS;
            }
        }

            if (electricVehicle) {
                cost *= ELECTRIC_DISCOUNT;
            }
            return cost;

    }

    /**
     * Method that gets taxi ID
     */
    public int getTaxiId() {
        return taxiId;
    }

    /**
     * Method that gets driver for the taxi
     */
    public Driver getDriver() {
        return driver;
    }

    /**
     * Method that sets driver to a taxi
     */
    public void setDriver(Driver driver) {
        this.driver = driver;
    }

    /**
     * Method that gets type of taxi
     */
    public TaxiType getType() {
        return type;
    }

    /**
     * Method that sets taxi numberPlate
     */
    public void setNumberPlate(String numberPlate) {
        this.numberPlate = numberPlate;
    }

    /**
     * Method that gets taxi numberPlate
     */
    public String getNumberPlate() {
        return numberPlate;
    }

    /**
     * Method that gets sets taxi mileage
     */
    public void setMileage(int mileage) {
        this.mileage = mileage;
    }

    /**
     * Method that gets taxi milage
     */
    public int getMileage() {
        return mileage;
    }

    /**
     * Method that sets taxi as an electricVehicle
     */
    public void setElectricVehicle(boolean electricVehicle) {
        this.electricVehicle = electricVehicle;
    }

    /**
     * Method that checks if a taxi is an electricVehicle
     */
    public boolean isElectricVehicle() {
        return electricVehicle;
    }

    /**
     * a toString method that returns a taxi info in specified format
     */
    @Override
    public String toString() {
        return "{" + taxiId + "; " + numberPlate + "; " + mileage + "; " + electricVehicle + "}";
    }
}
