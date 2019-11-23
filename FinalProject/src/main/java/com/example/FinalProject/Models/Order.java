package com.example.FinalProject.Models;

import javax.persistence.*;

@Entity
@Table(name="orders")
public class Order {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    public int orderID;

    @Column(name="customerid")
    public int customerID;

    @Column(name="productid")
    public int productID;

    @Column(name="orderdate")
    public String orderDate;

    @Column(name="orderstatus")
    public String orderStatus;

    @Column(name="paymentid")
    public int paymentID;

    @Column(name="employeeid")
    public int employeeID;

    public Order() {
        this.customerID = customerID;
        this.productID = productID;
        this.orderDate = orderDate;
        this.orderStatus = orderStatus;
        this.paymentID = paymentID;
        this.employeeID = employeeID;
    }

    public int getOrderID() {
        return orderID;
    }

    public void setOrderID(int orderID) {
        this.orderID = orderID;
    }

    public int getCustomerID() {
        return customerID;
    }

    public void setCustomerID(int customerID) {
        this.customerID = customerID;
    }

    public int getProductID() {
        return productID;
    }

    public void setProductID(int productID) {
        this.productID = productID;
    }

    public String getOrderDate() {
        return orderDate;
    }

    public void setOrderDate(String orderDate) {
        this.orderDate = orderDate;
    }

    public String getOrderStatus() {
        return orderStatus;
    }

    public void setOrderStatus(String orderStatus) {
        this.orderStatus = orderStatus;
    }

    public int getPaymentID() {
        return paymentID;
    }

    public void setPaymentID(int paymentID) {
        this.paymentID = paymentID;
    }

    public int getEmployeeID() {
        return employeeID;
    }

    public void setEmployeeID(int employeeID) {
        this.employeeID = employeeID;
    }
}
