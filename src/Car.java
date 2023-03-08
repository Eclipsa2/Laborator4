public class Car extends Vehicle{
    private String color;
    private Engine engine;

    public Car(String name, int price, int stoc, String model, Boolean isLimitedEdition, String color, Engine engine) {
        super(name, price, stoc, model, isLimitedEdition);
        this.color = color;
        this.engine = engine;
    }

    public Car(String color, Engine engine) {
        this.color = color;
        this.engine = engine;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public Engine getEngine() {
        return engine;
    }

    public void setEngine(Engine engine) {
        this.engine = engine;
    }

    @Override
    public String toString()
    {
        return (super.toString() + "/" + this.color + "/" + this.engine);
    }
}
