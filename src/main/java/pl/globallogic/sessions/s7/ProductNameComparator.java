package pl.globallogic.sessions.s7;

import pl.globallogic.sessions.s7.store_catalog.Product;

import java.util.Comparator;

public class ProductNameComparator implements Comparator<Product> {

    @Override
    public int compare(Product first, Product second) {
        return first.getName().compareTo(second.getName());
//        return second.getName().compareTo(first.getName());  //  REVERSED ORDER
    }
}
