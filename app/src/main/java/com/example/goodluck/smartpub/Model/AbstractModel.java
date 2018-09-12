package com.example.goodluck.smartpub.Model;

public class AbstractModel {
    private String itemName;
    private int imageResourceId;

    public AbstractModel(String itemName, int imageResourceId){
        this.itemName = itemName;
        this.imageResourceId = imageResourceId;
    }

    public String getItemName() {
        return itemName;
    }

    public void setItemName(String itemName){
        this.itemName =itemName;
    }

    public int getImageResourceId() {
        return imageResourceId;
    }

    public void setImageResourceId(int imageResourceId) {
        this.imageResourceId = imageResourceId;
    }
}
