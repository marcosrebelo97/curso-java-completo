package entities;

public class ImportedProduct extends Product {
    private Double customsFree;

    public ImportedProduct(){
        super();
    }

    public ImportedProduct(Double customsFree) {
        this.customsFree = customsFree;
    }

    public ImportedProduct(String name, Double price, Double customsFree) {
        super(name, price);
        this.customsFree = customsFree;
    }

    public Double totalPrice(){
        return getPrice() + customsFree;
    }

    @Override
    public String priceTag(){
        return super.getName()
                + " $ "
                + String.format("%.2f", totalPrice())
                + "(Custom fee: $ "
                + String.format("%.2f", customsFree) + ")";
    }
}
