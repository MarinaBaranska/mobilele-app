package org.softuni.mobilele.model.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Table;
import org.springframework.format.annotation.DateTimeFormat;

@Entity
@Table(name = "brands")
public class BrandEntity extends BaseEntity{

    //•	name – a name of brand.
    //•	created – a date and time.
    //•	modified – a date and time.
    @Column
    private String name;

    @Column
    private DateTimeFormat created;
    @Column
    private DateTimeFormat modified;
}
