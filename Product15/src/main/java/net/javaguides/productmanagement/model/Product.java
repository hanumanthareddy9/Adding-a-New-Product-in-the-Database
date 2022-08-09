package net.javaguides.productmanagement.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;


@Entity
@Table(name="instructor")
public class Product {
 
    @Id
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    @Column(name="id")
    protected int id;
 
    @Column(name="name")
    protected String name;
 
    @Column(name="type")
    protected String type;
 
    @Column(name="country")
    protected String country;
 
    public Product() {
    }
 
    public Product(String name, String type, String country) {
        super();
        this.name = name;
        this.type = type;
        this.country = country;
    }

    public Product(int id, String name, String type, String country) {
        super();
        this.id = id;
        this.name = name;
        this.type = type;
        this.country = country;
    }

    public int getId() {
        return id;
    }
    public void setId(int id) {
        this.id = id;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public String gettype() {
        return type;
    }
    public void settype(String type) {
        this.type = type;
    }
    public String getCountry() {
        return country;
    }
    public void setCountry(String country) {
        this.country = country;
    } 
}
