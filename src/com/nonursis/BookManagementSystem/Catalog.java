package com.nonursis.BookManagementSystem;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;

public class Catalog implements Iterable<CatalogItem> {
    private ArrayList<CatalogItem> arrayList;

    public Catalog() {
        this.arrayList = new ArrayList<CatalogItem>();
    }

    /**
     * add a Item
     * @param item
     */
    public void addItem(CatalogItem item) {

    }

    /**
     * remove a Item
     */
    public void removeItem() {

    }

    /**
     * find
     * @param code
     * @return
     */
    public CatalogItem getItem(String code) {
        return null;
    }

    /**
     * find
     * @param index
     * @return
     */
    public CatalogItem getItem(int index) {
        return null;
    }

    /**
     *
     * @return number of Items
     */
    public int getNumberOfItems() {
        return 0;
    }

    @Override
    public Iterator<CatalogItem> iterator() {
        return this.arrayList.iterator();
    }
}
