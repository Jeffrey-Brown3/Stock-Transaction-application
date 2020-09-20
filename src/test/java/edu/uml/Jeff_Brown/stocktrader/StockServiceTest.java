package edu.uml.Jeff_Brown.stocktrader;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertNull;

import java.sql.Timestamp;
import java.util.Calendar;
import java.util.List;


public class StockServiceTest{
    StockService myStockService;
    Timestamp timestamp;

    @Before
    public void setUp() {
        this.myStockService = new StockService() {
            @Override
            public StockTransaction getQuote(StockSymbolType symbol, Timestamp timeOfTransaction) {
                return null;
            }

            @Override
            public List<StockTransaction> getQuote(StockSymbolType symbol, Calendar from, Calendar until) {
                return null;
            }
        };
        timestamp = new Timestamp(Calendar.getInstance().getTimeInMillis());
    }

    @Test
    public void testMyMethod_True() {
        assertNull(myStockService.getQuote(StockSymbolType.APPL, timestamp));
    }

}