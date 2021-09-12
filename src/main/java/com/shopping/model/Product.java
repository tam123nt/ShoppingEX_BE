package com.shopping.model;

import com.sun.istack.NotNull;
import lombok.Data;

import javax.persistence.*;

@Entity
@Data
// Theo quy chuẩn của SB thì không cần table, ở đây thêm table để chỉ record thuộc table nào
@Table(name="Products")
public class Product {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="ProductID")
    private Long productID;

    @NotNull
    @Column(name="ProductName")
    private String productName;

    @Column(name = "SupplierID")
    private Long supplierID;

    @Column(name = "CategoryID")
    private Long categoryID;

    @Column(name = "QuantityPerUnit")
    private String quantityPerUnit;

    @Column(name = "UnitPrice")
    private double unitPrice;

    @Column(name = "UnitsInStock")
    private Long unitsInStock;

    @Column(name = "UnitsOnOrder")
    private Long unitsOnOrder;

    @Column(name = "ReorderLevel")
    private Long reorderLevel;

    @Column(name = "Discontinued")
    private Boolean discontinued;

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

    public String getQuantityPerUnit() {
        return quantityPerUnit;
    }

    public void setQuantityPerUnit(String quantityPerUnit) {
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

    public Boolean getDiscontinued() {
        return discontinued;
    }

    public void setDiscontinued(Boolean discontinued) {
        this.discontinued = discontinued;
    }
}