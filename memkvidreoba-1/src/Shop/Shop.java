package Shop;

public class Shop {
    private Product[] products;
    private int productCount;

    public Shop(int capacity) {
        products = new Product[capacity];
        productCount = 0;
    }

    public Product[] getProducts() {
        return products;
    }

    public void addProduct(Product product) {
        if (productCount < products.length) {
            products[productCount] = product;
            productCount++;
        } else {
            System.out.println("Shop.Shop is full. Cannot add more products.");
        }
    }
}

