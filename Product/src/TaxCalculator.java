public class TaxCalculator {

    public double calcVat(Product product) {
        double priceWithTax;
        switch (product.getCategory()) {
            case 1:
                priceWithTax = product.getPriceNetto() * 1.10;
                break;
            case 2:
                priceWithTax = product.getPriceNetto() * 1.23;
                break;
            case 3:
                priceWithTax = product.getPriceNetto() * 1.70;
                break;
            default:
                priceWithTax = product.getPriceNetto() * 2;
        }
        return priceWithTax;
    }

}
