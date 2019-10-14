import java.util.Scanner;

public class TestProduct {
    public static void main(String[] args) {

        calcAndPrintVat(new Product("Czekolada", "Gorzka 60%", 2, 5.66));
        calcAndPrintVat(new Product("Czekolada", "Mleczna 30%", 1, 3.32));
        calcAndPrintVat(new Product("Krewetki", "Mrozone 500 gr", 0, 19.66));
        inputProductAndCalcVat();

    }

    private static void calcAndPrintVat(Product product) {
        TaxCalculator taxCalculator = new TaxCalculator();
        System.out.printf("Produkt %s: kategoria %d, opis %s, cena bez VAT %.2f. ", product.getName(), product.getCategory(), product.getDescription(), product.getPriceNetto());
        System.out.printf("Cena produktu z VAT vynosi: %.2f\n", taxCalculator.calcVat(product));
    }

    private static void inputProductAndCalcVat() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Jezeli chcesz wprowadzic nowy produkt nacisnij Y");
        String y = scanner.nextLine();
        if (y.toUpperCase().charAt(0)!= 'Y') return;
        System.out.println("Wprowadz nazwe produktu");
        String productName = scanner.nextLine();
        System.out.println("Wprowadz opis produktu");
        String description = scanner.nextLine();
        System.out.println("Wprowadz kategorie (int) produktu");
        int category = scanner.nextInt();
        scanner.nextLine();
        System.out.println("Wprowadz cene productu bez VAT");
        double priceNoTax = scanner.nextDouble();
        scanner.nextLine();
        scanner.close();
        calcAndPrintVat(new Product(productName, description, category, priceNoTax));
    }

}


