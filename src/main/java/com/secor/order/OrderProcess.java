package com.secor.order;

import jakarta.persistence.*;

import java.math.BigDecimal;

@Entity
public class OrderProcess {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "orderid")
    private Long orderid;
    @Column(name = "ordername")
    private String ordername;
    @Column(name = "orderdescription")
    private String orderdescription;
    @Column(name = "orderprice")
    private BigDecimal orderprice;
    @Column(name = "orderstockQuantity")
    private int orderstockQuantity;

    public int getorderstockQuantity() {
        return orderstockQuantity;
    }

    public void setorderstockQuantity(int orderstockQuantity) {
        this.orderstockQuantity = orderstockQuantity;
    }

    public BigDecimal getorderprice() {
        return orderprice;
    }

    public void setorderprice(BigDecimal orderprice) {
        this.orderprice = orderprice;
    }

    public String getorderdescription() {
        return orderdescription;
    }

    public void setorderdescription(String orderdescription) {
        this.orderdescription = orderdescription;
    }

    public String getordername() {
        return ordername;
    }

    public void setordername(String ordername) {
        this.ordername = ordername;
    }

    public Long getorderid() {
        return orderid;
    }

    public void setorderid(Long orderid) {
        this.orderid = orderid;
    }


}
