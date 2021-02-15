package com.kodilla.hibernate.invoice.dao;

import com.kodilla.hibernate.invoice.Invoice;
import com.kodilla.hibernate.invoice.Item;
import com.kodilla.hibernate.invoice.Product;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest
public class InvoiceDaoTestSuite {

    @Autowired
    InvoiceDao invoiceDao;

    @Test
    public void testInvoiceDaoSave() {

        //Given
        Product water = new Product("water");
        Product candy = new Product("candy");
        Product chocolate = new Product("chocolate");

        Item itemWater = new Item(water, new BigDecimal(3), 3);
        Item itemCandy = new Item(candy, new BigDecimal(2), 10);
        Item itemChocolate = new Item(chocolate, new BigDecimal(5), 3);

        List<Item> items = new ArrayList<>();
        items.add(itemWater);
        items.add(itemCandy);
        items.add(itemChocolate);

        Invoice invoice = new Invoice("1/2021", items);

        //When
        invoiceDao.save(invoice);
        int id = invoice.getId();

        //Then
        assertNotEquals(0, id);

        //CleanUp
        invoiceDao.deleteById(id);
    }
}