package com.webservices.secao12.resources;

import com.webservices.secao12.entities.Order;
import com.webservices.secao12.entities.User;
import com.webservices.secao12.repositories.OrderRepository;
import com.webservices.secao12.services.OrderService;
import com.webservices.secao12.services.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping(value = "/orders")
public class OrderResources {

    @Autowired
    OrderService orderService;

    @GetMapping
    public ResponseEntity<List<Order>> findAll(){
        List<Order> list = orderService.findAll();
        return ResponseEntity.ok().body(list);
    }

    @GetMapping(value = "/{id}")
    public ResponseEntity<Optional<Order>> findById(@PathVariable Long id){
        Optional<Order> obj = orderService.findById(id);
        return ResponseEntity.ok().body(obj);
    }

}
