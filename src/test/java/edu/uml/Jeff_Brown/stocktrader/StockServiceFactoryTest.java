package edu.uml.Jeff_Brown.stocktrader;


import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertNotNull;


public class StockServiceFactoryTest{

    StockService returned = new SampleStockService();
    StockServiceFactory factory = new StockServiceFactory();
    @Before
    public void setUp(){
        returned = factory.getInstance();
    }
    @Test
    public void testGetInstance(){
        assertNotNull("null stock service was returned", returned);
    }

}