

public class Basket {
    ClothingProduct clothingProduct;
    ElectronicProduct electronicProduct;
    private Product [] products;

    public Basket(Product[] products) {
        this.products = products;
    }

    public void calculateTotalSum (){
        Double totalShippingCost = 0.0;
        Double totalProductCost = ElectronicProduct.getPriceSum() + ClothingProduct.getPriceSum();
        for (Product product: products) {
            totalShippingCost += product.calculateShippingCost(50.5);//в километрах, наверное
        }
        System.out.printf("Total shipping cost: %.2f" +
                           "\nTotal products cost: %.2f", totalShippingCost, totalProductCost
        );
    }
}
