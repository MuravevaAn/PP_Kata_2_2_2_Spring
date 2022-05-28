package web.model;

public class Car {
    private String brand;
    private String color;
    private long series;

    public Car(String brand, String color, long series) {
        this.brand = brand;
        this.color = color;
        this.series = series;
    }

    public String getNameCar() {
        return brand;
    }

    public void setNameCar(String nameCar) {
        this.brand = nameCar;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public long getSeries() {
        return series;
    }

    public void setSeries(long engine) {
        this.series = engine;
    }
}
