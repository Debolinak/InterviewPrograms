package pojo.request.response;

import java.util.List;

public class OrderDetailRequest {
    public List<OrderDetail> getOrders() {
        return orders;
    }

    public void setOrders(List<OrderDetail> orders) {
        this.orders = orders;
    }

    private List<OrderDetail> orders;

}
