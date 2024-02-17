package com.interview.munero.domain;

import java.util.List;

public class ItemListWrapper {
    private List<Item> items;

    private Integer total;
    private Integer rowCount;
    private Integer current;

    public ItemListWrapper(List<Item> items, Integer total, Integer rowCount, Integer current) {
        this.items = items;
        this.total = total;
        this.rowCount = rowCount;
        this.current = current;
    }

    public ItemListWrapper() {
    }

    public List<Item> getItemList() {
        return items;
    }

    public void setItemList(List<Item> items) {
        this.items = items;
    }

    public Integer getTotal() {
        return total;
    }

    public void setTotal(Integer total) {
        this.total = total;
    }

    public Integer getRowCount() {
        return rowCount;
    }

    public void setRowCount(Integer rowCount) {
        this.rowCount = rowCount;
    }

    public Integer getCurrent() {
        return current;
    }

    public void setCurrent(Integer current) {
        this.current = current;
    }
}
