import java.io.File;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class FileDataLoader {

    /**
     * Method that reads lines in a file, seperate the line into parts
     * depending on commas (,) and returns the taxis in an arrayList
     */
    public static List<Taxi> listTaxis(File file) {
        try {
            List<Taxi> taxis = new ArrayList<>();
            Scanner in = new Scanner(file);

            while (in.hasNextLine()) {
                String line = in.nextLine();

                String[] parts = line.split(",");

                String numberPlate = parts[0];
                int mileage = Integer.parseInt(parts[1]);
                boolean isElectricVehicle = Boolean.parseBoolean(parts[2]);
                TaxiType taxiType = TaxiType.valueOf(parts[3]);
                String driverName = parts[4];
                String driverLicence = parts[5];

                Driver driver = new Driver(driverName, driverLicence);

                Taxi taxi = new Taxi(numberPlate, mileage, isElectricVehicle, taxiType, driver);

                taxis.add(taxi);
            }

            in.close();
            return taxis;

        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }
}