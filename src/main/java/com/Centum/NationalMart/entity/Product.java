package com.Centum.NationalMart.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;
@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Product {
    @Id
    public int pid;
    public String productname;
    public String productqty;
    public String productprice;
    public String promoprice;
    public Date promostart;
    public Date promoend;
    public String description;
}
