public class Driver {

    private String fullName;
    private String licenseCode;

    /**
     * Constructor for the Driver class
     */
    public Driver (String fullName, String licenseCode) {

        this.fullName = fullName;
        this.licenseCode = licenseCode;

    }

    /**
     * Method that sets driver full name
     */
    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    /**
     * Method that gets drivers full name
     */
    public String getFullName() {
        return fullName;
    }

    /**
     * Method that sets drivers licence code
     */
    public void setLicenseCode(String licenseCode) {
        this.licenseCode = licenseCode;
    }

    /**
     * Method that gets drivers licence code
     */
    public String getLicenseCode() {
        return licenseCode;
    }

    /**
     * Method that checks if a driver is allowed to drive a certain
     * type of taxi based on their licence code
     */
    public boolean canDrive(TaxiType taxi) {

        if (licenseCode == null || licenseCode.length() != 10) {
            return false;
        } else if (taxi == TaxiType.MINIBUS) {
            return licenseCode.charAt(7) == 'M';
        } else if (taxi == TaxiType.REGULAR) {
            return licenseCode.charAt(8) == 'R';
        } else if (taxi == TaxiType.SMALL) {
            return licenseCode.charAt(9) == 'S';
        }
        return false;
    }

}
