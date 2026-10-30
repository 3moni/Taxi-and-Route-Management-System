import java.util.List;

/**
 * Class for routing logic for Task 6 par 2
 */
public class TaxiRouter {

    //distance between stops is fixed to 1.5 miles
    private static final double MILES_PER_STOP = 1.5;

    /**
     * Returns the cost of the most profitable (longest) route
     * starting from the given attraction.
     */
    public static double calculateMostProfitableRouteCost(TouristAttraction start, Taxi taxi) {
        if (start == null) {
            throw new IllegalArgumentException("Start attraction cannot be null.");
        }
        if (taxi == null) {
            throw new IllegalArgumentException("Taxi cannot be null.");
        }

        // Find the length of the longest route
        int stops = maxStopsFrom(start);

        // Convert stops to miles using the rule: 1 stop = 1.5 miles
        double miles = stops * MILES_PER_STOP;

        return taxi.calculateCost(miles);
    }

    /**
     * Returns the maximum number of forward moves possible from this attraction.
     * so if there is no next attraction then max stops = 0
     * otherwise +1 for each stop
     *
     * Explanation:
     * since each next attraction can branch again
     * meaning we dont know how deep the longest path is,
     * so recursion allows us to explore each path
     * when we reach the end of that path (meaning the inner loop is done, reached end of branch)
     * the method goes back to the outer loop, the initial one the method started with and
     * checks if there is another path it should check and create inner loops again
     * (by inner loops i mean loops created by the recursion)
     */
    private static int maxStopsFrom(TouristAttraction current) {
        List<TouristAttraction> next = current.getNext();

        // Base case: no next attractions means route ends here
        if (next == null || next.isEmpty()) {
            return 0;
        }

        // Recursive case: try each branch and take the longest
        int best = 0;
        for (TouristAttraction child : next) {
            int stopsViaChild = 1 + maxStopsFrom(child);
            if (stopsViaChild > best) {
                best = stopsViaChild;
            }
        }
        return best;
    }
}