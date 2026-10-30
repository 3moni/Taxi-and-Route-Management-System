import java.util.ArrayList;
import java.util.List;

/**
 * Represents one stop on the fixed tour map
 *
 * Each TouristAttraction stores references to the attraction(s) that come next
 * It can branch because there may be more than one "next" attraction
 */
public class TouristAttraction {

    //name of the attraction
    private final String name;

    //list of attractions that come immediately after this one (directional)
    private final ArrayList<TouristAttraction> nextAttractions;

    /**
     * a constructor tht creates an object ONLY after providing a name
     */
    public TouristAttraction(String name) {
        this.name = name;
        this.nextAttractions = new ArrayList<>();
    }

    /**
     * Returns the name of this attraction.
     */
    public String getName() {
        return name;
    }

    /**
     * Adds an attraction to the list of "next" attractions.
     *
     */
    public void addNext(TouristAttraction attraction) {
        nextAttractions.add(attraction);
    }

    /**
     * Returns the list of next TouristAttractions.
     */
    public List<TouristAttraction> getNext() {
        return nextAttractions;
    }
}