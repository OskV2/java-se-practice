package pl.globallogic.sessions.s7.store_catalog;

import java.util.HashSet;
import java.util.NavigableSet;
import java.util.Set;
import java.util.TreeSet;

public class StoreCatalog {

    //  out catalog does not allow to have duplicates
    //  add products to catalog
    //  list products

    NavigableSet<Product> products;

    public StoreCatalog() {
        products = new TreeSet<>();
    }

    public void addProduct(Product product) {
        if (products.add(product)) {
            System.out.println("Added product " + product);
        } else {
            System.out.printf("Product '%s' is already in a catalog. \n", product.getName());
        }
    }

    public void listAllProducts() {
        System.out.println("Listing our catalog:");
        for (Product product : products) {
            System.out.println(product);
        }
    }

    public boolean alreadyInStore(Product product) {
        return products.contains(product);
    }

    public NavigableSet<Product> getProductsInPriceRange(double minPrice, double maxPrice) {
        Product minPriceProduct = new Product("", minPrice);
        Product maxPriceProduct = new Product("", maxPrice);
        return products.subSet(minPriceProduct, true, maxPriceProduct, true);
    }

}
