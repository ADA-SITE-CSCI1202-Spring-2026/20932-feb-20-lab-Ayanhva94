import java.util.Scanner;

class Invoice {

    private String partNumber;
    private String partDescription;
    private int quantity;
    private double pricePerItem;

    public Invoice(String partNumber, String partDescription,
                   int quantity, double pricePerItem) {

        this.partNumber = partNumber;
        this.partDescription = partDescription;

        this.quantity = (quantity > 0) ? quantity : 0;
        this.pricePerItem = (pricePerItem > 0) ? pricePerItem : 0.0;
    }

    public double getInvoiceAmount() {
        return quantity * pricePerItem;
    }
}

public class InvoiceTest {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("How many invoices? ");
        int n = sc.nextInt();
        sc.nextLine();

        Invoice[] invoices = new Invoice[n];

        for (int i = 0; i < n; i++) {

            System.out.println("\nInvoice " + (i + 1));

            System.out.print("Part number: ");
            String partNumber = sc.nextLine();

            System.out.print("Description: ");
            String description = sc.nextLine();

            System.out.print("Quantity: ");
            int quantity = sc.nextInt();

            System.out.print("Price per item: ");
            double price = sc.nextDouble();
            sc.nextLine();

            invoices[i] = new Invoice(partNumber, description, quantity, price);
        }

        System.out.println("\n--- Invoice Amounts ---");

        for (int i = 0; i < invoices.length; i++) {
            System.out.println("Invoice " + (i + 1) +
                    " Amount: " + invoices[i].getInvoiceAmount());
        }

        sc.close();
    }
}
