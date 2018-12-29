package com.lbs.re.model;

import com.lbs.re.util.HasLogger;

import javax.persistence.*;
import java.io.Serializable;

@MappedSuperclass
public class AbstractBaseEntity implements Serializable, HasLogger {

    @Id
    @Column(name = "ID", nullable = false, updatable = false)
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer id;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }
}
