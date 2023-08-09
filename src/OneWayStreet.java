import java.util.List;

public class OneWayStreet extends Street {
    public List<Point> points;
    public List<Point> traffic;
    public List<Point> nonTraffic;
    public List<Point> block;

    //-------------------------------
    public OneWayStreet(String name, List<Street> leadingStreets, Type type, List<Point> points, List<Point> traffic, List<Point> nonTraffic, List<Point> block) {
        super(name, leadingStreets, type);
        this.points = points;
        this.traffic = traffic;
        this.nonTraffic = nonTraffic;
        this.block = block;
    }

    public void setPoints(List<Point> points) {
        this.points = points;
    }


    public void setTraffic(List<Point> traffic) {
        this.traffic = traffic;
    }

    public void setNonTraffic(List<Point> nonTraffic) {
        this.nonTraffic = nonTraffic;
    }

    public void setBlock(List<Point> block) {
        this.block = block;
    }

    //---------------------------------------
    public List<Point> getPoints() {
        return this.points;
    }

    public List<Point> getTraffic() {
        return this.traffic;
    }

    public List<Point> getNonTraffic() {
        return this.nonTraffic;
    }

    public List<Point> getBlock() {
        return this.block;
    }
}
