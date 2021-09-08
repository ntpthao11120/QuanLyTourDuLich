/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.ntpt.pojos;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.Transient;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import org.springframework.web.multipart.MultipartFile;

/**
 *
 * @author ntpth
 */
@Entity
@Table(name = "tour")
public class Tour implements Serializable{
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    @Size(min = 10, max = 50, message = "{tour.name.sizeMsg}")
    private String name;
    private String trip;
    @Column(name = "adult_price")
    @NotNull(message = "{tour.price.notNullMsg}")
    private BigDecimal adultPrice;
    @Column(name = "child_price")
    @NotNull(message = "{tour.price.notNullMsg}")
    private BigDecimal childPrice;
    @Column(name = "start_day")
    @Temporal(javax.persistence.TemporalType.DATE)
    private Date startDay;
    @Column(name = "end_day")
    @Temporal(javax.persistence.TemporalType.DATE)
    private Date endDay;
    private String description;
    private String image;
    @ManyToOne(fetch = FetchType.EAGER)
    @JoinColumn(name = "category_id")
    @NotNull(message = "{tour.category.notNullMsg}")
    private Category category;
    @Transient
    private MultipartFile file;

    /**
     * @return the id
     */
    public int getId() {
        return id;
    }

    /**
     * @param id the id to set
     */
    public void setId(int id) {
        this.id = id;
    }

    /**
     * @return the name
     */
    public String getName() {
        return name;
    }

    /**
     * @param name the name to set
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * @return the trip
     */
    public String getTrip() {
        return trip;
    }

    /**
     * @param trip the trip to set
     */
    public void setTrip(String trip) {
        this.trip = trip;
    }

    /**
     * @return the adultPrice
     */
    public BigDecimal getAdultPrice() {
        return adultPrice;
    }

    /**
     * @param adultPrice the adultPrice to set
     */
    public void setAdultPrice(BigDecimal adultPrice) {
        this.adultPrice = adultPrice;
    }

    /**
     * @return the childPrice
     */
    public BigDecimal getChildPrice() {
        return childPrice;
    }

    /**
     * @param childPrice the childPrice to set
     */
    public void setChildPrice(BigDecimal childPrice) {
        this.childPrice = childPrice;
    }

    /**
     * @return the startDay
     */
    public Date getStartDay() {
        return startDay;
    }

    /**
     * @param startDay the startDay to set
     */
    public void setStartDay(Date startDay) {
        this.startDay = startDay;
    }

    /**
     * @return the endDay
     */
    public Date getEndDay() {
        return endDay;
    }

    /**
     * @param endDay the endDay to set
     */
    public void setEndDay(Date endDay) {
        this.endDay = endDay;
    }

    /**
     * @return the description
     */
    public String getDescription() {
        return description;
    }

    /**
     * @param description the description to set
     */
    public void setDescription(String description) {
        this.description = description;
    }


    /**
     * @return the category
     */
    public Category getCategory() {
        return category;
    }

    /**
     * @param category the category to set
     */
    public void setCategory(Category category) {
        this.category = category;
    }

    /**
     * @return the image
     */
    public String getImage() {
        return image;
    }

    /**
     * @param image the image to set
     */
    public void setImage(String image) {
        this.image = image;
    }

    /**
     * @return the file
     */
    public MultipartFile getFile() {
        return file;
    }

    /**
     * @param file the file to set
     */
    public void setFile(MultipartFile file) {
        this.file = file;
    }
}
