import java.util.Objects;

public class Bicycle extends Vehicle {
    private int height;

    public Bicycle(String name, int price, int stoc, String model, Boolean isLimitedEdition, int height)
    {
        super(name, price, stoc, model, isLimitedEdition);
        this.height = height;
    }

    public Bicycle()
    {
        super();
        this.height = 0;
    }

    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    @Override
    public String toString()
    {
        return (super.toString() + "/" + this.height);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Bicycle bicycle = (Bicycle) o;
        return model == bicycle.getModel();
    }

    @Override
    public int hashCode() {
        return Objects.hash(this.height);
    }
}
