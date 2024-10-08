package com.dev.nicodav28.order_service.controller;

import com.dev.nicodav28.order_service.dto.OrderRequest;
import com.dev.nicodav28.order_service.model.Order;
import com.dev.nicodav28.order_service.service.OrderService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/order")
@RequiredArgsConstructor
public class OrderController {

    private final OrderService orderService;

    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    public Order placeOrder(@RequestBody OrderRequest orderRequest) {
        return orderService.placeOrder(orderRequest);
    }

    //todo: listar todas la ordenes
    //todo: listar 1 orden especifico
    //todo: actualizar ordenes
    //todo: eliminar ordenes
}
