public class Shop {
    private Product[] products = new Product[101];
    private int numProducts = 0;

    public Shop() {

    }

    public int getNumProducts() {
        return numProducts;
    }

    public void setNumProducts() {
        this.numProducts++;
    }

    public Product[] getProducts() {
        return products;
    }

    public void setProducts(Product[] products) {
        this.products = products;
    }
}
