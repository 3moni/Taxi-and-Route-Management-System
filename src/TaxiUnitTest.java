import java.io.File;
import java.util.List;

public class TaxiUnitTest {

    public static void main(String[] args) {
        testTaxiIds();
        testConstructorAndGetters();
        testSetters();
        testToString();


        File f = new File("src/taxis.txt");
        List<Taxi> taxis = FileDataLoader.listTaxis(f);

        /**
         * Prints how many taxis were loaded but only prints out 5 taxis to show
         * what they look like (no need for 30 as that would be too much 5 is enough)
         */
        if (taxis == null) {
            System.out.println("\nLoading failed (returned null).");
        } else {
            System.out.println("\nLoaded taxis: " + taxis.size());
            for (int i = 0; i < taxis.size() && i < 5; i++) {
                System.out.println(taxis.get(i));
            }
        }

    }







    /**
     * Method that tests constructors and getters
     */
    public static void testConstructorAndGetters() {
        // Test case 1
        Taxi taxi1 = new Taxi("AA00BBB", 1234, true, TaxiType.MINIBUS);

        String expPlate1 = "AA00BBB";
        String actPlate1 = taxi1.getNumberPlate();
        if (expPlate1.equals(actPlate1)) {
            System.out.println("numberPlate; Expected: " + expPlate1 + "; Actual: " + actPlate1 + "; PASS");
        } else {
            System.out.println("numberPlate; Expected: " + expPlate1 + "; Actual: " + actPlate1 + "; FAIL");
        }

        int expMileage1 = 1234;
        int actMileage1 = taxi1.getMileage();
        if (expMileage1 == actMileage1) {
            System.out.println("mileage; Expected: " + expMileage1 + "; Actual: " + actMileage1 + "; PASS");
        } else {
            System.out.println("mileage; Expected: " + expMileage1 + "; Actual: " + actMileage1 + "; FAIL");
        }

        boolean expEV1 = true;
        boolean actEV1 = taxi1.isElectricVehicle();
        if (expEV1 == actEV1) {
            System.out.println("electricVehicle; Expected: " + expEV1 + "; Actual: " + actEV1 + "; PASS");
        } else {
            System.out.println("electricVehicle; Expected: " + expEV1 + "; Actual: " + actEV1 + "; FAIL");
        }

        TaxiType expType1 = TaxiType.MINIBUS;
        TaxiType actType1 = taxi1.getType();
        if (expType1 == actType1) {
            System.out.println("type; Expected: " + expType1 + "; Actual: " + actType1 + "; PASS");
        } else {
            System.out.println("type; Expected: " + expType1 + "; Actual: " + actType1 + "; FAIL");
        }

        // Test case 2
        Taxi taxi2 = new Taxi("CE12GIK", 0, false, TaxiType.REGULAR);

        String expPlate2 = "CE12GIK";
        String actPlate2 = taxi2.getNumberPlate();
        if (expPlate2.equals(actPlate2)) {
            System.out.println("numberPlate; Expected: " + expPlate2 + "; Actual: " + actPlate2 + "; PASS");
        } else {
            System.out.println("numberPlate; Expected: " + expPlate2 + "; Actual: " + actPlate2 + "; FAIL");
        }

        int expMileage2 = 0;
        int actMileage2 = taxi2.getMileage();
        if (expMileage2 == actMileage2) {
            System.out.println("mileage; Expected: " + expMileage2 + "; Actual: " + actMileage2 + "; PASS");
        } else {
            System.out.println("mileage; Expected: " + expMileage2 + "; Actual: " + actMileage2 + "; FAIL");
        }

        boolean expEV2 = false;
        boolean actEV2 = taxi2.isElectricVehicle();
        if (expEV2 == actEV2) {
            System.out.println("electricVehicle; Expected: " + expEV2 + "; Actual: " + actEV2 + "; PASS");
        } else {
            System.out.println("electricVehicle; Expected: " + expEV2 + "; Actual: " + actEV2 + "; FAIL");
        }

        TaxiType expType2 = TaxiType.REGULAR;
        TaxiType actType2 = taxi2.getType();
        if (expType2 == actType2) {
            System.out.println("type; Expected: " + expType2 + "; Actual: " + actType2 + "; PASS");
        } else {
            System.out.println("type; Expected: " + expType2 + "; Actual: " + actType2 + "; FAIL");
        }

        // Test case 3
        Taxi taxi3 = new Taxi("ZX99YYY", 999999, true, TaxiType.SMALL);

        String expPlate3 = "ZX99YYY";
        String actPlate3 = taxi3.getNumberPlate();
        if (expPlate3.equals(actPlate3)) {
            System.out.println("numberPlate; Expected: " + expPlate3 + "; Actual: " + actPlate3 + "; PASS");
        } else {
            System.out.println("numberPlate; Expected: " + expPlate3 + "; Actual: " + actPlate3 + "; FAIL");
        }

        int expMileage3 = 999999;
        int actMileage3 = taxi3.getMileage();
        if (expMileage3 == actMileage3) {
            System.out.println("mileage; Expected: " + expMileage3 + "; Actual: " + actMileage3 + "; PASS");
        } else {
            System.out.println("mileage; Expected: " + expMileage3 + "; Actual: " + actMileage3 + "; FAIL");
        }

        boolean expEV3 = true;
        boolean actEV3 = taxi3.isElectricVehicle();
        if (expEV3 == actEV3) {
            System.out.println("electricVehicle; Expected: " + expEV3 + "; Actual: " + actEV3 + "; PASS");
        } else {
            System.out.println("electricVehicle; Expected: " + expEV3 + "; Actual: " + actEV3 + "; FAIL");
        }

        TaxiType expType3 = TaxiType.SMALL;
        TaxiType actType3 = taxi3.getType();
        if (expType3 == actType3) {
            System.out.println("type; Expected: " + expType3 + "; Actual: " + actType3 + "; PASS");
        } else {
            System.out.println("type; Expected: " + expType3 + "; Actual: " + actType3 + "; FAIL");
        }

        System.out.println();
    }



    /**
     * Method that tests Setters
     */
    public static void testSetters() {
        Taxi midTaxi = new Taxi("ASFK341", 0, false, TaxiType.REGULAR);

        midTaxi.setNumberPlate("CE12GIK");
        String expPlate = "CE12GIK";
        String actPlate = midTaxi.getNumberPlate();
        if (expPlate.equals(actPlate)) {
            System.out.println("setNumberPlate; Expected: " + expPlate + "; Actual: " + actPlate + "; PASS");
        } else {
            System.out.println("setNumberPlate; Expected: " + expPlate + "; Actual: " + actPlate + "; FAIL");
        }

        midTaxi.setMileage(999999);
        int expMileage = 999999;
        int actMileage = midTaxi.getMileage();
        if (expMileage == actMileage) {
            System.out.println("setMileage; Expected: " + expMileage + "; Actual: " + actMileage + "; PASS");
        } else {
            System.out.println("setMileage; Expected: " + expMileage + "; Actual: " + actMileage + "; FAIL");
        }

        midTaxi.setElectricVehicle(true);
        boolean expEV = true;
        boolean actEV = midTaxi.isElectricVehicle();
        if (expEV == actEV) {
            System.out.println("setElectricVehicle; Expected: " + expEV + "; Actual: " + actEV + "; PASS\n");
        } else {
            System.out.println("setElectricVehicle; Expected: " + expEV + "; Actual: " + actEV + "; FAIL\n");
        }
    }

    /**
     * Method that tests implementation of automatic taxiIds method i made in Taxi.java
     */
    public static void testTaxiIds() {
        Taxi averageTaxi1 = new Taxi("SFAH134", 12431, false, TaxiType.SMALL);
        Taxi averageTaxi2 = new Taxi("SFAH133", 14514, true, TaxiType.MINIBUS);
        Taxi averageTaxi3 = new Taxi("SFAH136", 15123, false, TaxiType.REGULAR);

        int id1 = averageTaxi1.getTaxiId();
        int id2 = averageTaxi2.getTaxiId();
        int id3 = averageTaxi3.getTaxiId();

        int expId1 = 499101;
        if (expId1 == id1) {
            System.out.println("First taxiId; Expected: " + expId1 + "; Actual: " + id1 + "; PASS");
        } else {
            System.out.println("First taxiId; Expected: " + expId1 + "; Actual: " + id1 + "; FAIL");
        }

        int expId2 = id1 + 1;
        if (expId2 == id2) {
            System.out.println("Second taxiId; Expected: " + expId2 + "; Actual: " + id2 + "; PASS");
        } else {
            System.out.println("Second taxiId; Expected: " + expId2 + "; Actual: " + id2 + "; FAIL");
        }

        int expId3 = id2 + 1;
        if (expId3 == id3) {
            System.out.println("Third taxiId; Expected: " + expId3 + "; Actual: " + id3 + "; PASS\n");
        } else {
            System.out.println("Third taxiId; Expected: " + expId3 + "; Actual: " + id3 + "; FAIL\n");
        }
    }

    /**
     * Method that tests the ToString method
     */
    public static void testToString() {
        // Test case 1
        Taxi taxi1 = new Taxi("AA00BBB", 1234, true, TaxiType.REGULAR);
        String exp1 = "{" + taxi1.getTaxiId() + "; AA00BBB; 1234; true}";
        String act1 = taxi1.toString();

        if (exp1.equals(act1)) {
            System.out.println("toString case 1; Expected: " + exp1 + "; Actual: " + act1 + "; PASS");
        } else {
            System.out.println("toString case 1; Expected: " + exp1 + "; Actual: " + act1 + "; FAIL");
        }

        // Test case 2 - changed values
        Taxi taxi2 = new Taxi("CE12GIK", 0, false, TaxiType.MINIBUS);
        String exp2 = "{" + taxi2.getTaxiId() + "; CE12GIK; 0; false}";
        String act2 = taxi2.toString();

        if (exp2.equals(act2)) {
            System.out.println("toString case 2; Expected: " + exp2 + "; Actual: " + act2 + "; PASS");
        } else {
            System.out.println("toString case 2; Expected: " + exp2 + "; Actual: " + act2 + "; FAIL");
        }

        // Test case 3 - changed values again
        Taxi taxi3 = new Taxi("ZX99YYY", 999999, true, TaxiType.SMALL);
        String exp3 = "{" + taxi3.getTaxiId() + "; ZX99YYY; 999999; true}";
        String act3 = taxi3.toString();

        if (exp3.equals(act3)) {
            System.out.println("toString case 3; Expected: " + exp3 + "; Actual: " + act3 + "; PASS");
        } else {
            System.out.println("toString case 3; Expected: " + exp3 + "; Actual: " + act3 + "; FAIL");
        }

        System.out.println();
    }


}