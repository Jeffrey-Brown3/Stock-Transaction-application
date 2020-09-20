package edu.uml.Jeff_Brown.stocktrader;


import org.junit.Test;

import static org.junit.Assert.assertNotNull;
/**
 * A list of stock symbols
 *  test returns of one of the symbols
 */
public class StockSymbolTypeTest{

    @Test
    public void testStockSymbolType(){
        assertNotNull("result is null", StockSymbolType.AMZ);
    }
}