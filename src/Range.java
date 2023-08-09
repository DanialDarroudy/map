import java.util.List;

public class Range {
    public String name;
    public List<Street> range;
    //-----------------------------
    public Range(String name , List<Street> range){
        this.name = name;
        this.range = range;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setRange(List<Street> range) {
        this.range = range;
    }
    //--------------------------

    public String getName() {
        return this.name;
    }

    public List<Street> getRange() {
        return this.range;
    }
}
