package com.shopping.model;

import lombok.Data;

import javax.persistence.*;
import java.util.Date;

@Entity
@Data
@Table(name="Orders")
public class Order {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="OrderID")
    private Long id;

    @Column(name="CustomerID")
    private Long customerId;

    @Column(name="EmployeeID")
    private Long employeeId;

    @Column(name="OrderDate")
    private Date orderDate;

    @Column(name="RequiredDate")
    private Date requiredDate;

    @Column(name="ShippedDate")
    private Date shippedDate;

    @Column(name="ShipVia")
    private Long shipVia;

    @Column(name="Freight")
    private Boolean freight;

    @Column(name="ShipName")
    private String shipName;

    @Column(name="ShipAddress")
    private String shipAddress;

    @Column(name="ShipCity")
    private String shipCity;

    @Column(name="ShipRegion")
    private String shipRegion;

    @Column(name="ShipPostalCode")
    private String shipPostalCode;

    @Column(name="ShipCountry")
    private String shipCountry;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getCustomerId() {
        return customerId;
    }

    public void setCustomerId(Long customerId) {
        this.customerId = customerId;
    }

    public Long getEmployeeId() {
        return employeeId;
    }

    public void setEmployeeId(Long employeeId) {
        this.employeeId = employeeId;
    }

    public Date getOrderDate() {
        return orderDate;
    }

    public void setOrderDate(Date orderDate) {
        this.orderDate = orderDate;
    }

    public Date getRequiredDate() {
        return requiredDate;
    }

    public void setRequiredDate(Date requiredDate) {
        this.requiredDate = requiredDate;
    }

    public Date getShippedDate() {
        return shippedDate;
    }

    public void setShippedDate(Date shippedDate) {
        this.shippedDate = shippedDate;
    }

    public Long getShipVia() {
        return shipVia;
    }

    public void setShipVia(Long shipVia) {
        this.shipVia = shipVia;
    }

    public Boolean getFreight() {
        return freight;
    }

    public void setFreight(Boolean freight) {
        this.freight = freight;
    }

    public String getShipName() {
        return shipName;
    }

    public void setShipName(String shipName) {
        this.shipName = shipName;
    }

    public String getShipAddress() {
        return shipAddress;
    }

    public void setShipAddress(String shipAddress) {
        this.shipAddress = shipAddress;
    }

    public String getShipCity() {
        return shipCity;
    }

    public void setShipCity(String shipCity) {
        this.shipCity = shipCity;
    }

    public String getShipRegion() {
        return shipRegion;
    }

    public void setShipRegion(String shipRegion) {
        this.shipRegion = shipRegion;
    }

    public String getShipPostalCode() {
        return shipPostalCode;
    }

    public void setShipPostalCode(String shipPostalCode) {
        this.shipPostalCode = shipPostalCode;
    }

    public String getShipCountry() {
        return shipCountry;
    }

    public void setShipCountry(String shipCountry) {
        this.shipCountry = shipCountry;
    }
}
