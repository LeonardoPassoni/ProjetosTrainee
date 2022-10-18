package br.com.sgsistemas.udemyproject.model;


import br.com.sgsistemas.udemyproject.model.pk.OrderItemPk;
import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.Table;
import java.io.Serializable;
import java.util.Objects;

@Entity
@Data
@Table(name = "tb_order_item")
@NoArgsConstructor

public class OrderItem implements Serializable {
    private static final long serialVersionUID = 1L;
    @EmbeddedId
    @JsonIgnore
    private OrderItemPk id = new OrderItemPk();

    private Integer quantity;
    private Double price;


    public OrderItem(Order order, Product product, Integer quantity, Double price) {
        this.quantity = quantity;
        this.price = price;
        this.id.setOrder(order);
        this.id.setProduct(product);
    }

    @JsonIgnore
    public Order getOrder() {
        return this.id.getOrder();
    }

    public void setOrder(Order order) {
        this.id.setOrder(order);
    }


    public Double getSubTotal(){
        return price * quantity;
    }


    public Product getProduct() {
        return this.id.getProduct();
    }

    public void setProduct(Product product) {
        this.id.setProduct(product);
    }


    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        OrderItem orderItem = (OrderItem) o;
        return id.equals(orderItem.id);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id);
    }
}
