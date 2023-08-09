import java.util.List;

public class TwoWayStreet extends Street {
    public List<Point> points1;
    public List<Point> points2;
    public List<Point> traffic1;
    public List<Point> traffic2;
    public List<Point> nonTraffic1;
    public List<Point> nonTraffic2;
    public List<Point> block1;
    public List<Point> block2;

    //--------------------------------------
    public TwoWayStreet(String name, List<Street> leadingStreets, Type type, List<Point> points1, List<Point> points2, List<Point> traffic1, List<Point> traffic2, List<Point> nonTraffic1, List<Point> nonTraffic2, List<Point> block1, List<Point> block2) {
        super(name, leadingStreets, type);
        this.points1 = points1;
        this.points2 = points2;
        this.traffic1 = traffic1;
        this.traffic2 = traffic2;
        this.nonTraffic1 = nonTraffic1;
        this.nonTraffic2 = nonTraffic2;
        this.block1 = block1;
        this.block2 = block2;
    }

    public void setPoints1(List<Point> points1) {
        this.points1 = points1;
    }

    public void setPoints2(List<Point> points2) {
        this.points2 = points2;
    }

    public void setTraffic1(List<Point> traffic1) {
        this.traffic1 = traffic1;
    }

    public void setTraffic2(List<Point> traffic2) {
        this.traffic2 = traffic2;
    }

    public void setNonTraffic1(List<Point> nonTraffic1) {
        this.nonTraffic1 = nonTraffic1;
    }

    public void setNonTraffic2(List<Point> nonTraffic2) {
        this.nonTraffic2 = nonTraffic2;
    }

    public void setBlock1(List<Point> block1) {
        this.block1 = block1;
    }

    public void setBlock2(List<Point> block2) {
        this.block2 = block2;
    }

    //---------------------------------------------
    public List<Point> getPoints1() {
        return points1;
    }

    public List<Point> getPoints2() {
        return points2;
    }

    public List<Point> getTraffic1() {
        return traffic1;
    }

    public List<Point> getTraffic2() {
        return traffic2;
    }

    public List<Point> getNonTraffic1() {
        return nonTraffic1;
    }

    public List<Point> getNonTraffic2() {
        return nonTraffic2;
    }

    public List<Point> getBlock1() {
        return block1;
    }

    public List<Point> getBlock2() {
        return block2;
    }
}
