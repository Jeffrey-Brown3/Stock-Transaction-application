package edu.uml.Jeff_Brown.stocktrader;

import org.junit.Before;
import org.junit.Test;

import java.sql.Timestamp;
import java.util.Calendar;
import static org.junit.Assert.assertNotNull;

public class SampleStockServiceTest{
    StockService service;
    Timestamp timestamp;


    @Before
    public void setUp(){
        service = new SampleStockService();
        timestamp = new Timestamp(Calendar.getInstance().getTimeInMillis());
    }

    @Test
    public void testGetQuote(){
        assertNotNull("test", service.getQuote(StockSymbolType.APPL, timestamp));
    }
}