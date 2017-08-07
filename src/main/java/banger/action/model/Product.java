package banger.action.model;

public class Product {
    private int id;

    private long productId;

    private String productNo;

    private String productName;

    private long productSellerId;

    private double productPrice;

    private int productStock;

    private int productTaste;

    private int productIsSell;

    private String productDescription;

    private int productPictureId;

    private int productHassSelled;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public long getProductId() {
        return productId;
    }

    public void setProductId(long productId) {
        this.productId = productId;
    }

    public String getProductNo() {
        return productNo;
    }

    public void setProductNo(String productNo) {
        this.productNo = productNo == null ? null : productNo.trim();
    }

    public String getProductName() {
        return productName;
    }

    public void setProductName(String productName) {
        this.productName = productName == null ? null : productName.trim();
    }

    public long getProductSellerId() {
        return productSellerId;
    }

    public void setProductSellerId(long productSellerId) {
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

    public int getProductPictureId() {
        return productPictureId;
    }

    public void setProductPictureId(int productPictureId) {
        this.productPictureId = productPictureId;
    }

    public int getProductHassSelled() {
        return productHassSelled;
    }

    public void setProductHassSelled(int productHassSelled) {
        this.productHassSelled = productHassSelled;
    }

    @Override
    public String toString() {
        return "Product{" +
                "id=" + id +
                ", productId=" + productId +
                ", productNo='" + productNo + '\'' +
                ", productName='" + productName + '\'' +
                ", productSellerId=" + productSellerId +
                ", productPrice=" + productPrice +
                ", productStock=" + productStock +
                ", productTaste=" + productTaste +
                ", productIsSell=" + productIsSell +
                ", productDescription='" + productDescription + '\'' +
                ", productPictureId=" + productPictureId +
                ", productHassSelled=" + productHassSelled +
                '}';
    }
}