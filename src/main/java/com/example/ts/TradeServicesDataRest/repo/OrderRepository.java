package com.example.ts.TradeServicesDataRest.repo;

import org.springframework.data.repository.CrudRepository;

import com.example.ts.TradeServicesDataRest.domain.Orders;

public interface OrderRepository extends CrudRepository<Orders,Integer> {

}
