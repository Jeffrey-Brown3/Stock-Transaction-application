package edu.uml.Jeff_Brown.stocktrader;


import org.junit.Test;

import static org.junit.Assert.assertNotNull;

public class StockSymbolTypeTest{

    @Test
    public void testStockSymbolType(){
        assertNotNull("result is null", StockSymbolType.AMZ);
    }
}