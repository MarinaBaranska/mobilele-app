package org.softuni.mobilele.model.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
import jakarta.persistence.Table;
import org.softuni.mobilele.model.entity.enums.CategoryEnum;

@Entity
@Table(name = "models")
public class ModelEntity extends BaseEntity{
    //•	name – a model name.
    //•	category – an enumeration (Car, Buss, Truck, Motorcycle)
    //•	imageUrl – the url of image with size between 8 and 512 characters.
    //•	startYear – a number.
    //•	endYear – a number.
    //•	created – a date and time.
    //•	modified – a date and time.
    //•	brand – a model brand.

    private String name;

    @Enumerated(EnumType.STRING)
    private CategoryEnum categoryEnum;

    private String imageUrl ;

    private int startYear;
    private int endYear;

}
