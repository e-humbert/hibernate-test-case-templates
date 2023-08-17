package org.hibernate.bugs;

import java.io.Serializable;

public class DataProjection implements Serializable {

    private Item item;

    private ItemList itemList;

    public DataProjection(Item item, ItemList itemList) {
        this.item = item;
        this.itemList = itemList;
    }

    public Item getItem() {
        return item;
    }

    public void setItem(Item item) {
        this.item = item;
    }

    public ItemList getItemList() {
        return itemList;
    }

    public void setItemList(ItemList itemList) {
        this.itemList = itemList;
    }

    @Override
    public String toString() {
        return "DataProjection{" +
                "item=" + item +
                ", itemList=" + itemList +
                '}';
    }

}
