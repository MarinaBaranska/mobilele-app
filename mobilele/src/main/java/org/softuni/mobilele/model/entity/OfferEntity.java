package org.softuni.mobilele.model.entity;

import jakarta.persistence.*;
import org.softuni.mobilele.model.entity.enums.EngineEnum;
import org.softuni.mobilele.model.entity.enums.TransmissionEnum;

import java.math.BigDecimal;

@Entity
@Table(name = "offers")
public class OfferEntity extends BaseEntity{
    //•	id – uuid or number.
    //•	description – some text.
    //•	engine – enumerated value (GASOLINE, DIESEL, ELECTRIC, HYBRID).
    //•	imageUrl – the url of image.
    //•	mileage – a number.
    //•	price – the price of the offer.
    //•	transmission – enumerated value (MANUAL, AUTOMATIC).
    //•	year – the year of offered car.
    //•	created – a date and time.
    //•	modified – a date and time.
    //•	model – the model of a car.
    //•	seller – a user that sells the car.

    @Column(nullable = false)
    private String description;

    @Column(nullable = false)
    @Enumerated(EnumType.STRING)
    private EngineEnum engine;

    private String imageUrl;

    private int mileage;

    @Column(nullable = false)
    private BigDecimal price;

    @Column(nullable = false)
    @Enumerated(EnumType.STRING)
    private TransmissionEnum transmission;

    private int year;

    //  //•	model – the model of a car.
    //    //•	seller – a user that sells the car.
    @ManyToOne
    private ModelEntity model;

    @ManyToOne
    private UserEntity seller;


    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public EngineEnum getEngine() {
        return engine;
    }

    public void setEngine(EngineEnum engine) {
        this.engine = engine;
    }

    public String getImageUrl() {
        return imageUrl;
    }

    public void setImageUrl(String imageUrl) {
        this.imageUrl = imageUrl;
    }

    public int getMileage() {
        return mileage;
    }

    public void setMileage(int mileage) {
        this.mileage = mileage;
    }

    public BigDecimal getPrice() {
        return price;
    }

    public void setPrice(BigDecimal price) {
        this.price = price;
    }

    public TransmissionEnum getTransmission() {
        return transmission;
    }

    public void setTransmission(TransmissionEnum transmission) {
        this.transmission = transmission;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public ModelEntity getModel() {
        return model;
    }

    public void setModel(ModelEntity model) {
        this.model = model;
    }

    public UserEntity getSeller() {
        return seller;
    }

    public void setSeller(UserEntity seller) {
        this.seller = seller;
    }

    @Override
    public String toString() {
        return "OfferEntity{" +
                "description='" + description + '\'' +
                ", engine=" + engine +
                ", imageUrl='" + imageUrl + '\'' +
                ", mileage=" + mileage +
                ", price=" + price +
                ", transmission=" + transmission +
                ", year=" + year +
                ", model=" + model +
                ", seller=" + seller +
                '}';
    }
}
