package pl.globallogic.sessions.s7.store_catalog;

import java.util.NavigableSet;

public class StoreCatalogDemo {
    public static void main(String[] args) {
        StoreCatalog store = new StoreCatalog();
        Product mango = new Product("Mango", 1.8);

        store.addProduct(new Product("Apple", 1.2));
        store.addProduct(new Product("Banana", 0.5));
        store.addProduct(new Product("Orange", 0.9));
        store.addProduct(new Product("Orange", 0.9));
        store.addProduct(new Product("Pineapple", 2.5));
//        store.addProduct(new Product("Mango", 1.8));
//        store.addProduct(new Product("Mango", 1.8));
        store.addProduct(mango);
        store.addProduct(mango);

        System.out.println("----------------------------");
        store.listAllProducts();

        System.out.printf("Is %s in a store: %s\n", mango, store.alreadyInStore(mango));

        System.out.println(store.getProductsInPriceRange(0.6, 2.0));
    }


}
