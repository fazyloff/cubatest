package ru.gradient.cubatest.entity;

import com.haulmont.chile.core.annotations.NamePattern;
import com.haulmont.cuba.core.entity.BaseIntegerIdEntity;
import com.haulmont.cuba.core.entity.HasUuid;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;
import javax.validation.constraints.Email;
import java.util.UUID;

@Table(name = "CUBATEST_CUSTOMER")
@Entity(name = "cubatest_Customer")
@NamePattern("Customer")
public class Customer extends BaseIntegerIdEntity implements HasUuid {
    private static final long serialVersionUID = -2093824408304704593L;
    @Column(name = "UUID")
    protected UUID uuid;

    public UUID getUuid() {
        return uuid;
    }

    public void setUuid(UUID uuid) {
        this.uuid = uuid;
    }
    @Column(name="Name")
    protected String name;

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }



    @Column(name="INN")
    protected String inn;

    public String getInn() {
        return this.inn;
    }

    public void setInn(String inn) {
        this.inn = inn;
    }
    @Column(name="Type")
    protected CustomerType type;
    public CustomerType getType() {
        return type;
    }

    public void setType(CustomerType type) {
        this.type = type;
    }

    @Email
    @Column(name = "Email")
    protected String email;

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
}