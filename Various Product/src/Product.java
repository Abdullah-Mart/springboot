public class Product {



    String name;
    double price;
    int quantity;
    static int totalQuantity= 0;
    static double totalAmount=0;

    public Product (String name, double price, int quantity){

        this.name=name;
        this.price=price;
        this.quantity=quantity;

        totalQuantity += quantity;
        totalAmount+= price*quantity;


    }
    public static void viewRaport(){
        System.out.println("Total Amount: "+totalAmount);
        System.out.println("Total Quantity: "+totalQuantity);

    }

}
