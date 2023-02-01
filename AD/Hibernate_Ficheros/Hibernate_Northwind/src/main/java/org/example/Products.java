package org.example;

import java.io.Serializable;
import java.math.BigDecimal;

public class Products implements Serializable {

    private int ProductID;
    private String ProductName;
    private int SupplierID;
    private int CategoryID;
    private String QuantityPerUnit;
    private BigDecimal UnitPrice;
    private short UnitsInStock;
    private short UnitsInOrder;
    private short ReorderLevel;
    private boolean Discontinued;
    private Categories categorie;

    public Products() {
    }

    public Products(int productID, String productName, int supplierID, int categoryID, String quantityPerUnit, BigDecimal unitPrice, short unitsInStock, short unitsInOrder, short reorderLevel, boolean discontinued) {
        ProductID = productID;
        ProductName = productName;
        SupplierID = supplierID;
        CategoryID = categoryID;
        QuantityPerUnit = quantityPerUnit;
        UnitPrice = unitPrice;
        UnitsInStock = unitsInStock;
        UnitsInOrder = unitsInOrder;
        ReorderLevel = reorderLevel;
        Discontinued = discontinued;
    }

    public int getProductID() {
        return ProductID;
    }

    public void setProductID(int productID) {
        ProductID = productID;
    }

    public String getProductName() {
        return ProductName;
    }

    public void setProductName(String productName) {
        ProductName = productName;
    }

    public int getSupplierID() {
        return SupplierID;
    }

    public void setSupplierID(int supplierID) {
        SupplierID = supplierID;
    }

    public int getCategoryID() {
        return CategoryID;
    }

    public void setCategoryID(int categoryID) {
        CategoryID = categoryID;
    }

    public String getQuantityPerUnit() {
        return QuantityPerUnit;
    }

    public void setQuantityPerUnit(String quantityPerUnit) {
        QuantityPerUnit = quantityPerUnit;
    }

    public BigDecimal getUnitPrice() {
        return UnitPrice;
    }

    public void setUnitPrice(BigDecimal unitPrice) {
        UnitPrice = unitPrice;
    }

    public short getUnitsInStock() {
        return UnitsInStock;
    }

    public void setUnitsInStock(short unitsInStock) {
        UnitsInStock = unitsInStock;
    }

    public short getUnitsInOrder() {
        return UnitsInOrder;
    }

    public void setUnitsInOrder(short unitsInOrder) {
        UnitsInOrder = unitsInOrder;
    }

    public short getReorderLevel() {
        return ReorderLevel;
    }

    public void setReorderLevel(short reorderLevel) {
        ReorderLevel = reorderLevel;
    }

    public boolean isDiscontinued() {
        return Discontinued;
    }

    public void setDiscontinued(boolean discontinued) {
        Discontinued = discontinued;
    }

    public Categories getCategorie() {
        return categorie;
    }

    public void setCategorie(Categories categorie) {
        this.categorie = categorie;
    }

    @Override
    public String toString() {
        return "Products{" +
                "ProductID=" + ProductID +
                ", ProductName='" + ProductName + '\'' +
                ", SupplierID=" + SupplierID +
                ", CategoryID=" + CategoryID +
                ", QuantityPerUnit='" + QuantityPerUnit + '\'' +
                ", UnitPrice=" + UnitPrice +
                ", UnitsInStock=" + UnitsInStock +
                ", UnitsInOrder=" + UnitsInOrder +
                ", ReorderLevel=" + ReorderLevel +
                ", Discontinued=" + Discontinued +
                ", categorie=" + categorie +
                '}';
    }
}
