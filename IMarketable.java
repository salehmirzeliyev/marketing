package Market;

public interface IMarketable {
    public String addProduct();
    public String editProduct();
    public String searchProduct();
    public String deleteProduct();
    public void showAllProduct();
    public void showProductForCategory();
    public void showProductForPriceRange();
    public String addSale();
    public String returnProductFromSale();
    public String returnSale();
    public void showSaleInformationForDateRange();
    public void showSaleInformationForPriceRange();
    public void showSaleInformationForADate();
    public void showSaleInformationForSaleNumber();
}
