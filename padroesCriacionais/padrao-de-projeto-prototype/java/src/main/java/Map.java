public class Map implements Cloneable {
    public String name;
    public String minimumLevel;
    public String coordinateNpcX;
    public String coordinateNpcY;


    public Map(
            String name,
            String minimumLevel,
            String coordinateNpcX,
            String coordinateNpcY
    ) {
        this.name = name;
        this.minimumLevel = minimumLevel;
        this.coordinateNpcX = coordinateNpcX;
        this.coordinateNpcY = coordinateNpcY;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getMinimumLevel() {
        return minimumLevel;
    }

    public void setMinimumLevel(String minimumLevel) {
        this.minimumLevel = minimumLevel;
    }

    public String getCoordinateNpcX() {
        return this.coordinateNpcX;
    }

    public void setCoordinateNpcX(String coordinateX) {
        this.coordinateNpcX = coordinateX;
    }

    public String getCoordinateNpcY() {
        return this.coordinateNpcY;
    }
    public void setCoordinateNpcY(String coordinateY) {
        this.coordinateNpcY = coordinateY;
    }

    @Override
    public Map clone() throws CloneNotSupportedException {
        Map mapClone = (Map) super.clone();
        return mapClone;
    }

    @Override
    public String toString() {
        return "Map{" +
                "name='" + name +
                "', level minimo='" + minimumLevel +
                "', coordenada x='" + this.coordinateNpcX + '\'' +
                ", coordenada y='" + this.coordinateNpcY + '\'' +
                '}';
    }
}
