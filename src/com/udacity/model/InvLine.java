
package com.udacity.model;

public class InvLine {
    private String itemName;
    private double itemPrice;
    private int itemCount;
    private InvoiceHeadline header;

    public InvLine(String itemName, double itemPrice, int itemCount, InvoiceHeadline header) {
        this.itemName = itemName;
        this.itemPrice = itemPrice;
        this.itemCount = itemCount;
        this.header = header;
    }
    
    public String ItemNameGET() {
        return itemName;
    }

    public void ItemNameSET(String itemName) {
        this.itemName = itemName;
    }

    public double iTEMpRICEgETTING() {
        return itemPrice;
    }

    public void setItemPrice(double itemPrice) {
        this.itemPrice = itemPrice;
    }

    public int ItemCountgetting() {
        return itemCount;
    }

    public void ItemCountSetting(int itemCount) {
        this.itemCount = itemCount;
    }

    public InvoiceHeadline getHeader() {
        return header;
    }

    public void Headersetting(InvoiceHeadline header) {
        this.header = header;
    }

    @Override
    public String toString() {
        return "InvoiceLine{" + "itemName=" + itemName + ", itemprice=" + itemPrice + ", itemCount=" + itemCount + '}';
    }
    
    public double lineTotalgetting() {
        return itemCount * itemPrice;
    }
    
    public String DataAsCSVgetting() {
        return "" + getHeader().getinvoicenumber() + "," + ItemNameGET() + "," + iTEMpRICEgETTING() + "," + ItemCountgetting();
    }
}
