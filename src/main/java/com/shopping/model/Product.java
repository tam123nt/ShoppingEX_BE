package com.shopping.model;

import lombok.Data;

import javax.persistence.*;

@Entity
@Data
public class Product {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long productID;

    @Column(name = "ProductName")
    private String productName;

    @Column(name = "SupplierID")
    private Long supplierID;

    @Column(name = "CategoryID")
    private Long categoryID;

    @Column(name = "QuantityPerUnit")
    private Long quantityPerUnit;

    @Column(name = "UnitPrice")
    private double unitPrice;

    @Column(name = "UnitsInStock")
    private Long unitsInStock;

    @Column(name = "UnitsOnOrder")
    private Long unitsOnOrder;

    @Column(name = "name")
    private Long reorderLevel;

    @Column(name = "name")
    private boolean discontinuted;

    public Long getProductID() {
        return productID;
    }

    public void setProductID(Long productID) {
        this.productID = productID;
    }

    public String getProductName() {
        return productName;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }

    public Long getSupplierID() {
        return supplierID;
    }

    public void setSupplierID(Long supplierID) {
        this.supplierID = supplierID;
    }

    public Long getCategoryID() {
        return categoryID;
    }

    public void setCategoryID(Long categoryID) {
        this.categoryID = categoryID;
    }

    public Long getQuantityPerUnit() {
        return quantityPerUnit;
    }

    public void setQuantityPerUnit(Long quantityPerUnit) {
        this.quantityPerUnit = quantityPerUnit;
    }

    public double getUnitPrice() {
        return unitPrice;
    }

    public void setUnitPrice(double unitPrice) {
        this.unitPrice = unitPrice;
    }

    public Long getUnitsInStock() {
        return unitsInStock;
    }

    public void setUnitsInStock(Long unitsInStock) {
        this.unitsInStock = unitsInStock;
    }

    public Long getUnitsOnOrder() {
        return unitsOnOrder;
    }

    public void setUnitsOnOrder(Long unitsOnOrder) {
        this.unitsOnOrder = unitsOnOrder;
    }

    public Long getReorderLevel() {
        return reorderLevel;
    }

    public void setReorderLevel(Long reorderLevel) {
        this.reorderLevel = reorderLevel;
    }

    public boolean isDiscontinuted() {
        return discontinuted;
    }

    public void setDiscontinuted(boolean discontinuted) {
        this.discontinuted = discontinuted;
    }
}