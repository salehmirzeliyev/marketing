package Market;

public class Main extends Management{
    public static void main(String[] args) {

//        LinkedList<Product> productList = new LinkedList<Product>();
//        LinkedList<Sale> saleLink = new LinkedList<Sale>();
        Product product = new Product();
//        Sale sale = new Sale();
        Management manager = new Management();

        int choice = manager.getOperationChoice();

        while (choice != 0) {
            switch (choice) {
                case 1:
                    manager.getProductOperationChoice();
                    break;
                case 2:
                    manager.getSaleOperationChoice();
                    break;
                case 3:
                    System.out.println("Good Bye");
                default:
                    System.out.println("Invalid Option, Please try again");
                    break;
            }
            choice = manager.getOperationChoice();
        }
    }
    }
