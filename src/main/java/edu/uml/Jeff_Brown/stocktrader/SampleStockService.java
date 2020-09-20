package edu.uml.Jeff_Brown.stocktrader;

import java.math.BigDecimal;
import java.sql.Timestamp;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;
/**
 * This class implements a simple stock purchase service to be used with the stockServiceFactory.
 */
public class SampleStockService implements StockService{
    @Override
    public StockTransaction getQuote(StockSymbolType symbol, Timestamp timeOfTransaction) {
        Timestamp timestamp = new Timestamp(Calendar.getInstance().getTimeInMillis());
        return new StockTransaction(new BigDecimal(100), StockSymbolType.AMZ, timestamp);
    }

    @Override
    public List<StockTransaction> getQuote(StockSymbolType symbol, Calendar from, Calendar until) {
        List<StockTransaction> stockTransactions = new ArrayList<>();
        Timestamp timestamp = new Timestamp(Calendar.getInstance().getTimeInMillis());
        stockTransactions.add(new StockTransaction(new BigDecimal(100), StockSymbolType.AMZ, timestamp));
        return new ArrayList<>();
    }
}
