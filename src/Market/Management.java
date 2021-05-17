package Market;

import java.util.*;

public class Management implements IMarketable{

    final private Scanner input = new Scanner(System.in);
    //Product product = new Product();
    LinkedList<Product> productLinkedList = new LinkedList<Product>();


    private int getIntInput() {
        int choice = 0;
        while (choice == 0) {
            try {
                choice = input.nextInt();
                if (choice == 0)
                    throw new InputMismatchException();
                input.nextLine();
            } catch (InputMismatchException e) {
                input.nextLine();
                System.out.println("Invalid input. Please try again: ");
            }
        }
        return choice;
    }

    private double getDoubleInput() {
        double choice = 0;
        while (choice == 0) {
            try {
                choice = input.nextDouble();
                if (choice == 0)
                    throw new InputMismatchException();
                input.nextLine();
            } catch (InputMismatchException e) {
                input.nextLine();
                System.out.println("Invalid input. Please try again: ");
            }
        }
        return choice;
    }

    private String getStringInput() {
        String choice = null;
        while (choice == null) {
            try {
                choice = input.nextLine();
                if (choice == null)
                    throw new InputMismatchException();
                //input.nextLine();
            } catch (InputMismatchException e) {
                input.nextLine();
                System.out.println("Invalid input. Please try again: ");
            }
        }
        return choice;
    }

    public int getOperationChoice() {
        int choice;

        System.out.println("---------Welcome--------");
        System.out.println("============================");
        System.out.println("Please select operation");
        System.out.println("1) Product operation");
        System.out.println("2) Sale operation");
        System.out.println("3) EXIT");

        choice = getIntInput();
        return choice;
    }

    public int getProductOperationChoice() {
        int choice = 0;

        System.out.println("========================");
        System.out.println("Please select operation");
        System.out.println("1) Add product");
        System.out.println("2) Edit product");
        System.out.println("3) Search product");
        System.out.println("4) Delete product");
        System.out.println("5) Show all product");
        System.out.println("6) Show product for category");
        System.out.println("7) Show product for price range");
        System.out.println("8) Go back");

        choice = getIntInput();
            switch (choice) {
                case 1:
                    addProduct();
                    break;
                case 2:
                    editProduct();
                    break;
                case 3:
                    searchProduct();
                    break;
                case 4:
                    deleteProduct();
                    break;
                case 5:
                    showAllProduct();
                    break;
                case 6:
                    showProductForCategory();
                    break;
                case 7:
                    showProductForPriceRange();
                    break;
                case 8:
                    getOperationChoice();
                    break;
                default:
                    System.out.println("Invalid operation choice, please try again");
                    getProductOperationChoice();
                    break;
        }
        return choice;
    }

    public int getSaleOperationChoice(){
        int choice = 0;

        System.out.println("==================");
        System.out.println("Please select operation");
        System.out.println("1) Add sale");
        System.out.println("2) Return product from sale");
        System.out.println("3) Return sale");
        System.out.println("4) Show sale information for date range");
        System.out.println("5) Show sale information for price range");
        System.out.println("6) Show sale information for a date");
        System.out.println("7) Show sale information for sale number");
        System.out.println("8) Go back");

        choice = getIntInput();
        switch (choice){
            case 1:
                addSale();
                break;
            case 2:
                returnProductFromSale();
                break;
            case 3:
                returnSale();
                break;
            case 4:
                showSaleInformationForDateRange();
                break;
            case 5:
                showSaleInformationForPriceRange();
                break;
            case 6:
                showSaleInformationForADate();
                break;
            case 7:
                showSaleInformationForSaleNumber();
                break;
            case 8:
                getOperationChoice();
                break;
            default:
                System.out.println("Invalid operation choice, please try again");
                getSaleOperationChoice();
                break;
        }
        return choice;
    }


    @Override
    public String addProduct() {
        Product product = new Product();
        int choice = 0;
        System.out.println("Enter product name: ");
        String name = getStringInput();
        System.out.println("Enter product price: ");
        double price = getDoubleInput();
        System.out.println("Enter product count: ");
        double count = getDoubleInput();
        product.setName(name);
        product.setPrice(price);
        product.setCount(count);
        System.out.println("Please select a category: ");
        System.out.println("For Cookies Press 1:");
        System.out.println("For Drink Press 2:");
        System.out.println("For Dairy Press 3:");
        System.out.println("For Food Press 4:");
        System.out.println("For Fruit Press 5:");
        choice = getIntInput();
            switch (choice) {
                case 1:
                    product.setCategory(Category.COOKIES);
                    break;
                case 2:
                    product.setCategory(Category.DRINK);
                    break;
                case 3:
                    product.setCategory(Category.DAIRY);
                    break;
                case 4:
                    product.setCategory(Category.FOOD);
                    break;
                case 5:
                    product.setCategory(Category.FRUIT);
                    break;
                default:
                    System.out.println("Invalid option, Please try again");
                    getIntInput();
                    break;
            }
            productLinkedList.add(product);
        System.out.println("You succesfully added " + product);
        return null;
    }


    @Override
    public String editProduct() {
        System.out.println("this function is not available for now");
        return null;
    }

    @Override
    public String searchProduct() {
        System.out.println("this function is not available for now");
        return null;
    }

    @Override
    public String deleteProduct() {
        System.out.println("this function is not available for now");
        return null;
    }

    @Override
    public void showAllProduct() {
        System.out.println("All product: "
                + productLinkedList);

    }

    @Override
    public void showProductForCategory() {
        System.out.println("this function is not available for now");
    }

    @Override
    public void showProductForPriceRange() {
        System.out.println("this function is not available for now");
    }

    @Override
    public String addSale() {
        System.out.println("this function is not available for now");
        return null;
    }

    @Override
    public String returnProductFromSale() {
        System.out.println("this function is not available for now");
        return null;
    }

    @Override
    public String returnSale() {
        System.out.println("this function is not available for now");
        return null;
    }

    @Override
    public void showSaleInformationForDateRange() {
        System.out.println("this function is not available for now");
    }

    @Override
    public void showSaleInformationForPriceRange() {
        System.out.println("this function is not available for now");
    }

    @Override
    public void showSaleInformationForADate() {
        System.out.println("this function is not available for now");
    }

    @Override
    public void showSaleInformationForSaleNumber() {
        System.out.println("this function is not available for now");
    }
}
