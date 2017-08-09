package banger.action.model;

public class Product {
    private int id;

    private String productId;

    private String productName;

    private String productSellerId;

    private double productPrice;

    private int productStock;

    private int productTaste;

    private int productIsSell;

    private String productDescription;

    private int productHassSelled;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getProductId() {
        return productId;
    }

    public void setProductId(String productId) {
        this.productId = productId;
    }

    public String getProductName() {
        return productName;
    }

    public void setProductName(String productName) {
        this.productName = productName == null ? null : productName.trim();
    }

    public String getProductSellerId() {
        return productSellerId;
    }

    public void setProductSellerId(String productSellerId) {
        this.productSellerId = productSellerId;
    }

    public double getProductPrice() {
        return productPrice;
    }

    public void setProductPrice(double productPrice) {
        this.productPrice = productPrice;
    }

    public int getProductStock() {
        return productStock;
    }

    public void setProductStock(int productStock) {
        this.productStock = productStock;
    }

    public int getProductTaste() {
        return productTaste;
    }

    public void setProductTaste(int productTaste) {
        this.productTaste = productTaste;
    }

    public int getProductIsSell() {
        return productIsSell;
    }

    public void setProductIsSell(int productIsSell) {
        this.productIsSell = productIsSell;
    }

    public String getProductDescription() {
        return productDescription;
    }

    public void setProductDescription(String productDescription) {
        this.productDescription = productDescription == null ? null : productDescription.trim();
    }

    public int getProductHassSelled() {
        return productHassSelled;
    }

    public void setProductHassSelled(int productHassSelled) {
        this.productHassSelled = productHassSelled;
    }
}