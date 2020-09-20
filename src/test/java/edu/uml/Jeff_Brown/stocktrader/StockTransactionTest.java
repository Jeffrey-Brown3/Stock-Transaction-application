package edu.uml.Jeff_Brown.stocktrader;


import org.junit.Before;
import org.junit.Test;

import java.math.BigDecimal;
import java.sql.Timestamp;
import java.util.Calendar;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotEquals;

public class StockTransactionTest{

    Timestamp timestamp;
    StockTransaction transaction;

    @Before
    public void setUp(){
        timestamp = new Timestamp(Calendar.getInstance().getTimeInMillis());
        transaction = new StockTransaction(new BigDecimal(100), StockSymbolType.AMZ, timestamp);
    }
    @Test
    public void testGetPrice(){
        assertEquals("expected return price does not match", new BigDecimal(100), transaction.getPrice());
    }

    @Test
    public void testGetStockSymbol(){
        assertNotEquals("expected return stock symbol should not match", StockSymbolType.APPL, transaction.getStockSymbol());
    }

    @Test
    public void testGetTime(){
        assertEquals("expected return time does not match", timestamp, transaction.getTime());
    }

    @Test
    public void testToString(){
        assertNotEquals("expected return string should not match", "StockQuote{...", transaction.toString());
    }
}