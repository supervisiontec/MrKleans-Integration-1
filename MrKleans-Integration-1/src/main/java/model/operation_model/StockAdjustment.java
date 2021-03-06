/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model.operation_model;

import java.io.Serializable;
import java.math.BigDecimal;
import javax.persistence.Column;

/**
 *
 * @author chama
 */
public class StockAdjustment implements Serializable {

    @Column(name = "index_no")
    private Integer indexNo;

    @Column(name = "item_no")
    private String itemNo;

    @Column(name = "item_name")
    private String itemName;

    @Column(name = "item_unit")
    private String itemUnit;

    @Column(name = "barcode")
    private String barcode;

    @Column(name = "enter_date")
    private String enterDate;

    @Column(name = "enter_time")
    private String enterTime;

    @Column(name = "updated_date")
    private String updatedDate;

    @Column(name = "updated_time")
    private String updatedTime;

    @Column(name = "cost_price")
    private BigDecimal costPrice;

    @Column(name = "qty")
    private BigDecimal qty;

    @Column(name = "branch")
    private Integer branch;

    @Column(name = "`check`")
    private Boolean check;
    
    @Column(name = "ref_no")
    private String refNo;
    
    @Column(name = "form_type")
    private String formType;

    public StockAdjustment() {
    }

    public StockAdjustment(Integer indexNo, String itemNo, String itemName, String itemUnit, String barcode, String enterDate, String enterTime, String updatedDate, String updatedTime, BigDecimal costPrice, BigDecimal qty, Integer branch, Boolean check, String refNo, String formType) {
        this.indexNo = indexNo;
        this.itemNo = itemNo;
        this.itemName = itemName;
        this.itemUnit = itemUnit;
        this.barcode = barcode;
        this.enterDate = enterDate;
        this.enterTime = enterTime;
        this.updatedDate = updatedDate;
        this.updatedTime = updatedTime;
        this.costPrice = costPrice;
        this.qty = qty;
        this.branch = branch;
        this.check = check;
        this.refNo = refNo;
        this.formType = formType;
    }

    public Integer getIndexNo() {
        return indexNo;
    }

    public void setIndexNo(Integer indexNo) {
        this.indexNo = indexNo;
    }

    public String getItemNo() {
        return itemNo;
    }

    public void setItemNo(String itemNo) {
        this.itemNo = itemNo;
    }

    public String getItemName() {
        return itemName;
    }

    public void setItemName(String itemName) {
        this.itemName = itemName;
    }

    public String getItemUnit() {
        return itemUnit;
    }

    public void setItemUnit(String itemUnit) {
        this.itemUnit = itemUnit;
    }

    public String getBarcode() {
        return barcode;
    }

    public void setBarcode(String barcode) {
        this.barcode = barcode;
    }

    public String getEnterDate() {
        return enterDate;
    }

    public void setEnterDate(String enterDate) {
        this.enterDate = enterDate;
    }

    public String getEnterTime() {
        return enterTime;
    }

    public void setEnterTime(String enterTime) {
        this.enterTime = enterTime;
    }

    public String getUpdatedDate() {
        return updatedDate;
    }

    public void setUpdatedDate(String updatedDate) {
        this.updatedDate = updatedDate;
    }

    public String getUpdatedTime() {
        return updatedTime;
    }

    public void setUpdatedTime(String updatedTime) {
        this.updatedTime = updatedTime;
    }

    public BigDecimal getCostPrice() {
        return costPrice;
    }

    public void setCostPrice(BigDecimal costPrice) {
        this.costPrice = costPrice;
    }

    public BigDecimal getQty() {
        return qty;
    }

    public void setQty(BigDecimal qty) {
        this.qty = qty;
    }

    public Integer getBranch() {
        return branch;
    }

    public void setBranch(Integer branch) {
        this.branch = branch;
    }

    public Boolean getCheck() {
        return check;
    }

    public void setCheck(Boolean check) {
        this.check = check;
    }

    public String getRefNo() {
        return refNo;
    }

    public void setRefNo(String refNo) {
        this.refNo = refNo;
    }

    public String getFormType() {
        return formType;
    }

    public void setFormType(String formType) {
        this.formType = formType;
    }

}
