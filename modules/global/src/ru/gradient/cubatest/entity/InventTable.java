package ru.gradient.cubatest.entity;

import com.haulmont.chile.core.annotations.NamePattern;
import com.haulmont.cuba.core.entity.StandardEntity;

import javax.persistence.Entity;
import javax.persistence.Table;

@NamePattern("%s|id")
@Table(name = "CUBATEST_INVENT_TABLE")
@Entity(name = "cubatest_InventTable")
public class InventTable extends StandardEntity {
    private static final long serialVersionUID = -8532739292330490582L;
}