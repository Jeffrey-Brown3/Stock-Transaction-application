package edu.uml.Jeff_Brown.stocktrader;


import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertNotNull;

/**
 * This class tests the sample stock service to pass to client code when requested.
 */
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