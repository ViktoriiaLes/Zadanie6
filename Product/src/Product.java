class Product {
    private String name;
    private String description;
    private int category;
    private double priceNetto;

    public Product(String name, String description, int category, double priceNetto) {
        this.name = name;
        this.description = description;
        this.category = category;
        this.priceNetto = priceNetto;
    }

    public Product() {

    }

    public void setName(String name) {
        this.name = name;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public void setCategory(int category) {
        this.category = category;
    }

    public void setPriceNetto(double priceNetto) {
        this.priceNetto = priceNetto;
    }

    public String getName() {
        return name;
    }

    public String getDescription() {
        return description;
    }

    public int getCategory() {
        return category;
    }

    public double getPriceNetto() {
        return priceNetto;
    }
}
