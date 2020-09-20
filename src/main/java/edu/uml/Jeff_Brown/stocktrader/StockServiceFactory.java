package edu.uml.Jeff_Brown.stocktrader;
/**
 * This class gets an instance of the sample stock service to pass to client code when requested.
 */
public class StockServiceFactory {
    /*This method returns an instance of the sample stock service, I imagine in the future we will input parameters
    to determine the type of stock service we wish to have returned once theres more than one variety? */
    public StockService getInstance(){
        StockService service = new SampleStockService();
        return service;
    }
}
