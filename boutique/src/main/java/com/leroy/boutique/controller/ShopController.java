package com.leroy.boutique.controller;

import com.leroy.boutique.entity.*;
import com.leroy.boutique.repository.*;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.Date;
import java.util.List;

@RestController
@RequestMapping("/shop")
public class ShopController {

    @Autowired
    private ClientRepository ClientRepository;

    @Autowired
    private BasketRepository BasketRepository;

    @Autowired
    private BasketProductRepository BasketProductRepository;

    @Autowired
    private OrderProductRepository OrderProductRepository;

    @Autowired
    private OrderRepository OrderRepository;

    @Autowired
    private BillRepository BillRepository;

    @ApiOperation(value = "find basket by client id")
    @GetMapping("/client/{id}/basket")
    public Basket getBasketByClientId(@PathVariable Long id){
        Client client  = ClientRepository.findById(id).get();
        return BasketRepository.findBasketByClient(client);
    }
    @ApiOperation(value = "find basket details by client id")
    @GetMapping("/client/{id}/basket/details")
    public BasketProduct getBasketDetailByClientId(@PathVariable Long id) {
        Client client = ClientRepository.findById(id).get();
        Basket basket = BasketRepository.findBasketByClient(client);
        return BasketProductRepository.findBasketProductByBasket(basket);
    }

    @ApiOperation(value = "find order details by order id")
    @GetMapping("/client/{id}/order/details")
    public OrderProduct getOrderDetailByClientId(@PathVariable Long id) {
        Order order = OrderRepository.findById(id).get();
        return OrderProductRepository.findOrderProductByOrder(order);
    }


    @ApiOperation(value = "get bill by order id")
    @GetMapping("order/{id}/bill")
    public Bill getBillByOrder(@PathVariable Long id){
        Order order = OrderRepository.findById(id).get();
        return BillRepository.findBillByOrder(order);
    }

    @ApiOperation(value = "get orders by client id")
    @GetMapping("client/{id}/order/history")
    public List<Order> getClientOrders(@PathVariable Long id){
        Client client  = ClientRepository.findById(id).get();
        return OrderRepository.findOrdersByClient(client);
    }

    @ApiOperation(value = "create client's basket")
    @PostMapping("/client/{id}/basket")
    public Basket setBasketByClientId(@PathVariable Long id){
        Client client  = ClientRepository.findById(id).get();

        Basket bskt  = BasketRepository.findBasketByClient(client);

        if(bskt != null){
            return bskt;
        }

        Basket basket = new Basket();
        basket.setClient(client);
        return BasketRepository.save(basket);
    }


    @ApiOperation(value = "Add a product into a basket by client id")
    @PostMapping("/client/{id}")
    public BasketProduct setBasketProduct(@RequestBody BasketProduct basketProduct, @PathVariable Long id){

        Client client  = ClientRepository.findById(id).get();
        Basket basket = BasketRepository.findBasketByClient(client);

        basketProduct.setBasket(basket);
        return BasketProductRepository.save(basketProduct);
    }

    @ApiOperation(value = "client basket validation")
    @PostMapping ("/client/{id}/basket/validation")
    public Order setBasketValidation(@PathVariable Long id){
        Client client  = ClientRepository.findById(id).get();
        Basket basket = BasketRepository.findBasketByClient(client);
        List<BasketProduct> basketProductList = BasketProductRepository.findAll();

        Double total_amount = 0.0;

        basketProductList.removeIf(item -> !item.getBasket().getId_basket().equals(basket.getId_basket()));


        Order order = new Order();
        order.setClient(client);
        order.setDate(new Date());
        OrderRepository.save(order);



        for(var item : basketProductList){
            total_amount += item.getTotal_amount();
            OrderProductRepository.save(new OrderProduct(
                    order,
                    item.getProduct(),
                    item.getQuantity(),
                    item.getTotal_amount()));
        }

        order.setTotal_amount(total_amount);

        for(var item : basketProductList){
            BasketProductRepository.delete(item);
        }

        Bill bill = new Bill();
        bill.setOrder(order);
        BillRepository.save(bill);

        return OrderRepository.save(order);
    }

}
