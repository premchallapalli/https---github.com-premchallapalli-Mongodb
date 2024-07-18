package dev_migration.migration_api;

public class Classdata {

    private String vendorId;
    private String storeId;
    private String PackageId;
    private String price;

    
    public Classdata() {
    }


    public Classdata(String vendorId, String storeId, String packageId, String price) {
        this.vendorId = vendorId;
        this.storeId = storeId;
        this.PackageId = packageId;
        this.price = price;
    }


    public String getVendorId() {
        return vendorId;
    }


    public void setVendorId(String vendorId) {
        this.vendorId = vendorId;
    }


    public String getStoreId() {
        return storeId;
    }


    public void setStoreId(String storeId) {
        this.storeId = storeId;
    }


    public String getPackageId() {
        return PackageId;
    }


    public void setPackageId(String packageId) {
        this.PackageId = packageId;
    }


    public String getPrice() {
        return price;
    }


    public void setPrice(String price) {
        this.price = price;
    }

}
