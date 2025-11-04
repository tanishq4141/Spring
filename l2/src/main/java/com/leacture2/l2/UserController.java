package com.leacture2.l2;


import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicLong;

@RestController
@RequestMapping("/api/product")
public class UserController {

    private final Map<Integer, Product> productStore = new HashMap<>();
    private final AtomicInteger idCounter = new AtomicInteger(3);


    public UserController(){
        productStore.put(1, new Product(1, "cahi",20.0,"tea"));
            productStore.put(2, new Product(2, "parleg",5.0,"cookies"));


    }

    @GetMapping("/")
    public List<Product> getAll(){

        return new ArrayList<>(productStore.values());

    }
    @GetMapping("/{id}")
    public ResponseEntity<?> getProductById(@PathVariable int id) {
        Product product = productStore.get(id);

        if (product != null) {
            return ResponseEntity.ok(product);
        } else {
            return ResponseEntity.status(HttpStatus.NOT_FOUND)
                    .body("Product with ID " + id + " not found.");
        }

    }
    @PostMapping("/")
    public ResponseEntity<Product> createProduct(@RequestBody Product newProduct) {
        int id = idCounter.getAndIncrement();
        newProduct.setId(id); // Only set the ID
        productStore.put(id, newProduct);
        return ResponseEntity.status(HttpStatus.CREATED).body(newProduct);
    }








}
