package com.client.ws.rasmooplus.controller;

import com.client.ws.rasmooplus.exception.NotFoundException;
import com.client.ws.rasmooplus.model.SubcriptionType;
import com.client.ws.rasmooplus.repository.SubscriptionTypeRepository;
import com.client.ws.rasmooplus.service.SubscriptionTypeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Objects;


@RestController
@RequestMapping("/subscription-type")
public class SubscriptionTypeController {
    
    @Autowired
    SubscriptionTypeService subscriptionTypeService;

    @GetMapping
    public ResponseEntity<List<SubcriptionType>> findAll(){
         return ResponseEntity.status(HttpStatus.OK).body(subscriptionTypeService.findAll());
    }

    @GetMapping("/{id}")
    public ResponseEntity<SubcriptionType>findById(@PathVariable("id") Long id){
        return ResponseEntity.status(HttpStatus.OK).body(subscriptionTypeService.findById(id));
    }

}
