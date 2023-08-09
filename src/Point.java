public class Point {
    final private Double latitude;
    final private Double longitude;

    final private String id;

    //---------------------------------------
    public Point(Double latitude, Double longitude , String id) {
        this.latitude = latitude;
        this.longitude = longitude;
        this.id = id;
    }

    //----------------------------------------

    public Double getLatitude() {
        return this.latitude;
    }

    public Double getLongitude() {
        return this.longitude;
    }

    public String getId() {
        return this.id;
    }
}