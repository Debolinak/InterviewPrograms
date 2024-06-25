package pojo.request.response;

public class OrderDetail {
    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public String getProductOrderedId() {
        return productOrderedId;
    }

    public void setProductOrderedId(String state) {
        this.productOrderedId = state;
    }

    String country;
    String productOrderedId;
}
