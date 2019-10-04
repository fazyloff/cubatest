package ru.gradient.cubatest.web.screens.customer;

import com.haulmont.cuba.gui.screen.*;
import ru.gradient.cubatest.entity.Customer;

@UiController("cubatest_Customer.edit")
@UiDescriptor("customer-edit.xml")
@EditedEntityContainer("customerDc")
@LoadDataBeforeShow
public class CustomerEdit extends StandardEditor<Customer> {
}