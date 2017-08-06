package banger.action.model;

public class Address {
    private int id;

    private long addressId;

    private long addressBuyerId;

    private String addressAddress;

    private int addressIsDefault;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public long getAddressId() {
        return addressId;
    }

    public void setAddressId(long addressId) {
        this.addressId = addressId;
    }

    public long getAddressBuyerId() {
        return addressBuyerId;
    }

    public void setAddressBuyerId(long addressBuyerId) {
        this.addressBuyerId = addressBuyerId;
    }

    public String getAddressAddress() {
        return addressAddress;
    }

    public void setAddressAddress(String addressAddress) {
        this.addressAddress = addressAddress == null ? null : addressAddress.trim();
    }

    public int getAddressIsDefault() {
        return addressIsDefault;
    }

    public void setAddressIsDefault(int addressIsDefault) {
        this.addressIsDefault = addressIsDefault;
    }
}