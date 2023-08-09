import java.util.ArrayList;
import java.util.List;

public abstract class Street {
    public String name;
    public List<Street> leadingStreets;
    public Type type;

    public final static ArrayList<Street> streets = new ArrayList<>();

    //---------------------------------
    public Street(String name, List<Street> leadingStreets, Type type) {
        this.name = name;
        this.leadingStreets = leadingStreets;
        this.type = type;
        streets.add(this);
    }

    //-----------------------------------

    public void setName(String name) {
        this.name = name;
    }

    public void setLeadingStreets(List<Street> leadingStreets) {
        this.leadingStreets = leadingStreets;
    }

    public void setType(Type type) {
        this.type = type;
    }

    public String getName() {
        return this.name;
    }

    public Type getType() {
        return this.type;
    }

    public List<Street> getLeadingStreets() {
        return this.leadingStreets;
    }
    public void deleteStreet(Street street){
        streets.remove(street);
    }
    public void addLeadedStreet(Street street){
        this.leadingStreets.add(street);
    }
}
