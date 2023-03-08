public abstract class Product {
    private String name;
    private int price;
    private int inStock;
    public Product(String name, int price, int stoc)
    {
        this.name = name;
        this.price = price;
        this.inStock = stoc;
    }

    public Product()
    {
        this.name = "";
        this.price = 0;
        this.inStock = 0;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public int getInStock() {
        return inStock;
    }

    public void setInStock(int inStock) {
        this.inStock = inStock;
    }

    public String getName()
    {
        return this.name;
    }

    @Override
    public String toString()
    {
        return (this.name + "/" + this.price + "/" + this.inStock);
    }

}
