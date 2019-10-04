package ru.gradient.cubatest.web.screens.customer;

import com.haulmont.cuba.gui.screen.*;
import ru.gradient.cubatest.entity.Customer;

@UiController("cubatest_Customer.browse")
@UiDescriptor("customer-browse.xml")
@LookupComponent("customersTable")
@LoadDataBeforeShow
public class CustomerBrowse extends StandardLookup<Customer> {
}