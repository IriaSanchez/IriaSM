package org.example;

import java.io.Serializable;

public class Categories implements Serializable {

    private int CategoryID;
    private String CategoryName;
    private String Description;

    public Categories() {
    }

    public Categories(int categoryID, String categoryName, String description) {
        CategoryID = categoryID;
        CategoryName = categoryName;
        Description = description;
    }

    public int getCategoryID() {
        return CategoryID;
    }

    public void setCategoryID(int categoryID) {
        CategoryID = categoryID;
    }

    public String getCategoryName() {
        return CategoryName;
    }

    public void setCategoryName(String categoryName) {
        CategoryName = categoryName;
    }

    public String getDescription() {
        return Description;
    }

    public void setDescription(String description) {
        Description = description;
    }

    @Override
    public String toString() {
        return "Categories{" +
                "CategoryID=" + CategoryID +
                ", CategoryName='" + CategoryName + '\'' +
                ", Description='" + Description + '\'' +
                '}';
    }
}
