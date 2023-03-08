public class Equipment extends Product{
    private String supplierName;
    private String country;

    public Equipment(String name, int price, int qty, String supplier, String country)
    {
        super(name, price, qty);
        this.supplierName = supplier;
        this.country = country;
    }

    public Equipment()
    {
        super();
        this.supplierName = "";
        this.country = "";
    }

    @Override
    public String toString()
    {
        return (super.toString() + "/" + this.supplierName + "/" + this.country);
    }
}
