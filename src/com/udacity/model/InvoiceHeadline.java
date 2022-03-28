
package com.udacity.model;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;

public class InvoiceHeadline {
    private int invNum;
    private String customerName;
    private Date invDate;
    private ArrayList<InvLine> lines;  

    public InvoiceHeadline(int invNum, String customerName, Date invDate) {
        this.invNum = invNum;
        this.customerName = customerName;
        this.invDate = invDate;
        
    }

    public Date invoicedate() {
        return invDate;
    }

    public void invoicedatesetvalue(Date invDate) {
        this.invDate = invDate;
    }

    public int getinvoicenumber() {
        return invNum;
    }

    public void setInvoiceNum(int invNum) {
        this.invNum = invNum;
    }

    public String CustomerNameReq() {
        return customerName;
    }

    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }

    @Override
    public String toString() {
        String str = "InvoiceHeader{" + "invNum=" + invNum + ", customerName=" + customerName + ", invDate=" + invDate + '}';
        for (InvLine line : getLines()) {
            str += "\n\t" + line;
        }
        return str;
    }

    public ArrayList<InvLine> getLines() {
        if (lines == null)
            lines = new ArrayList<>(); 
        return lines;
    }

    public void setLines(ArrayList<InvLine> lines) {
        this.lines = lines;
    }

    public double totalinvoice() {
        double total = 0.0;
        for (InvLine line : getLines()) {
            total += line.lineTotalgetting();
        }
        return total;
    }
    
    public void addInvoiceLine(InvLine line) {
        getLines().add(line);
    }
    
    public String getDataAsCSV() {
        DateFormat df = new SimpleDateFormat("dd-MM-yyyy");
        return "" + getinvoicenumber() + "," + df.format(invoicedate()) + "," + CustomerNameReq();
    }
    
}
