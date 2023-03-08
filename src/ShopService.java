public class ShopService {
    private final Shop shop;

    public ShopService(Shop shop) {
        this.shop = shop;
    }

    public void addProduct(Product product)
    {
        int numberOfProducts = shop.getNumProducts();
        shop.setNumProducts();
        shop.getProducts()[numberOfProducts] = product;
        System.out.println("The product has been added");
    }
}
