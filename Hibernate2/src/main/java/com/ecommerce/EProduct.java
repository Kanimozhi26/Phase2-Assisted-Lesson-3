package com.ecommerce;

import java.math.BigDecimal;
import java.util.Date;

public class EProduct {
        private long ID;
        private String name;
        private BigDecimal price;
        private Date date_added;
        
        public EProduct() {
                
        }
        public EProduct(long ID, String name, BigDecimal price, Date date_added) {
                this.ID = ID;
                this.name = name;
                this.price = price;
                this.date_added = date_added;
        }
        
        public long getID() {return this.ID; }
        public String getName() { return this.name;}
        public BigDecimal getPrice() { return this.price;}
        public Date getDateAdded() { return this.date_added;}
        
        public void setID(long ID) { this.ID = ID;}
        public void setName(String name) { this.name = name;}
        public void setPrice(BigDecimal price) { this.price = price;}
        public void setDateAdded(Date date_added) { this.date_added = date_added;}
        
        
}

