public abstract class Vehicle extends Product{
    protected String model;
    private Boolean isLimitedEdition;

    public Vehicle(String name, int price, int stoc, String model, Boolean isLimitedEdition)
    {
        super(name, price, stoc);
        this.model = model;
        this.isLimitedEdition = isLimitedEdition;
    }

    public Vehicle()
    {
        super();
        this.model = "";
        this.isLimitedEdition = false;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public Boolean getLimitedEdition() {
        return isLimitedEdition;
    }

    public void setLimitedEdition(Boolean limitedEdition) {
        isLimitedEdition = limitedEdition;
    }

    @Override
    public String toString()
    {
        return (super.toString() + "/" + this.model);
    }
}
