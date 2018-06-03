package com.example.ts.TradeServicesDataRest.repo;

import org.springframework.data.repository.CrudRepository;

import com.example.ts.TradeServicesDataRest.domain.Trade;

public interface TradeRepository extends CrudRepository<Trade,String>{
}
